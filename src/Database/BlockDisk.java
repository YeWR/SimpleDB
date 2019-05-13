package Database;

import FileManager.FileManagerBase;
import Utils.Bytes;

import java.io.IOException;

public class BlockDisk {
    /**
     * a block on the disk abstract
     * @param info:
     *            [0] -> is empty
     *            [1] -> has next; 0 -> doesn't have next block
     *            [2-5] -> index of next block
     *            [6-9] -> the bytes of the content
     */

    private int BLOCK_SIZE, INFO_SIZE;

    private byte[] info;
    private byte[] block;


    public BlockDisk(int blockSize, int infoSize, byte[] blockBytes){
        BLOCK_SIZE = blockSize;
        INFO_SIZE = infoSize;
        if(INFO_SIZE < 10){
            System.out.println("INFO_SIZE too small");
            System.exit(1);
        }
        info = new byte[INFO_SIZE];
        block = blockBytes;
        System.arraycopy(block, 0, info, 0, INFO_SIZE);
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

    public byte[] getContent() {
        byte[] content = new byte[getBytesOfContent()];
        System.arraycopy(block, INFO_SIZE, content, 0, BLOCK_SIZE - INFO_SIZE);
        return content;
    }

    public byte[] getInfo() {
        return info;
    }
}
