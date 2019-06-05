package Database;

import FileManager.FileManagerBase;
import Utils.Bytes;

import java.io.IOException;

public class BlockDisk extends Prototype {
    /**
     * a block on the disk abstract
     * @param info:
     *            [0] -> is empty
     *            [1] -> has next; 0 -> doesn't have next block
     *            [2-5] -> index of next block
     *            [6-9] -> the bytes of the content
     */

    private byte[] info;
    private byte[] content;

    /**
     * read
     */
    public BlockDisk(FileManagerBase fm, int position){
        try {
            byte[] blockBytes = fm.read(position);
            this.info = new byte[INFO_SIZE];
            System.arraycopy(blockBytes, 0, this.info, 0, INFO_SIZE);

            this.content = new byte[getBytesOfContent()];
            System.arraycopy(blockBytes, INFO_SIZE, this.content, 0, this.content.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * create
     */
    public BlockDisk(int blockSize, int infoSize){
        BLOCK_SIZE = blockSize;
        INFO_SIZE = infoSize;
        if(INFO_SIZE < 10){
            System.out.println("INFO_SIZE too small");
            System.exit(1);
        }
        info = new byte[INFO_SIZE];
    }

    /**
     * write data to disk
     * @param data: total bytes of data
     * @return the position of the first block to write
     */
    public static int write(FileManagerBase fm, byte[] data){
        int len;
        byte[] info;
        byte[] content = new byte[getAvailableSize()];
        int num = (int) Math.ceil( (double) data.length / getAvailableSize());
        assert num > 0;
        int[] positions = fm.getNextBlockPositions(num);

        for(int i = 0; i < num; ++i){
            if(i == num - 1){
                len = data.length - i * getAvailableSize();
                info = writeInfo(false, false, 0, len);
            }
            else {
                len = getAvailableSize();
                info = writeInfo(false, true, positions[i+1], len);
            }
            System.arraycopy(data, i * getAvailableSize(), content, 0, len);

            byte[] block = Bytes.combineBytes(info, content);
            try {
                fm.write(block, positions[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return positions[0];
    }

    public static void delete(FileManagerBase fm, long[] positions){
        boolean over = false;
        for (int i = 0; i < positions.length; ++i) {
            int position = (int) positions[i];

            while (!over && position > 0) {
                BlockDisk block = new BlockDisk(fm, position);
                if (!block.hasNext()) {
                    over = true;
                }
                byte[] info = writeInfo(true, false, 0, 0);
                try {
                    fm.write(info, position);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                position = block.getNextBlock();
            }
        }
    }

    public static void delete(FileManagerBase fm, int position){
        boolean over = false;
        while (!over && position > 0){
            BlockDisk block = new BlockDisk(fm, position);
            if(!block.hasNext()){
                over = true;
            }
            byte[] info = writeInfo(true, false, 0, 0);
            try {
                fm.write(info, position);
            } catch (IOException e) {
                e.printStackTrace();
            }
            position = block.getNextBlock();
        }
    }

    /**
     * read data from disk
     * @param position: the first index
     * @return the bytes
     */
    public static byte[] read(FileManagerBase fm, int position){
        byte[] data = new byte[0];
        while (true) {
            BlockDisk block = new BlockDisk(fm, position);
            byte[] content = block.getContent();
            data = Bytes.combineBytes(data, content);

            if(!block.hasNext()){
                break;
            }
            position = block.getNextBlock();
        }
        return data;
    }

    private static byte[] writeInfo(boolean empty, boolean hasNext, int nextPosition, int contentBytes){
        byte[] info = new byte[INFO_SIZE];
        info[0] = Bytes.booleanToByte(empty);
        info[1] = Bytes.booleanToByte(hasNext);
        Bytes.intToBytes(nextPosition, info, 2);
        Bytes.intToBytes(contentBytes, info, 6);
        return info;
    }

    public void setEmpty(boolean empty){
        info[0] = Bytes.booleanToByte(empty);
    }

    public void setHasNext(boolean hasNext){
        info[1] = Bytes.booleanToByte(hasNext);
    }

    public int contentSize(){
        return BLOCK_SIZE - INFO_SIZE;
    }

    public boolean empty(){
        return Bytes.byteToBoolean(info[0]);
    }

    public boolean hasNext(){
        return Bytes.byteToBoolean(info[1]);
    }

    public int getNextBlock(){
        return Bytes.bytesToInt(info, 2);
    }

    public int getBytesOfContent(){
        return Bytes.bytesToInt(info, 6);
    }

    public byte[] getInfo() {
        return info;
    }

    public byte[] getContent(){
        return this.content;
    }

    public static int getAvailableSize(){
        return BLOCK_SIZE - INFO_SIZE;
    }
}
