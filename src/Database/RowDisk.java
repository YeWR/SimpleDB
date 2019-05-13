package Database;

import FileManager.FileManagerBase;
import Utils.Bytes;
import Utils.Log;
import jdk.nashorn.internal.ir.Block;

import java.io.IOException;
import java.nio.ByteBuffer;

public class RowDisk {
    /**
     * row in a table stored on the disk
     */

    private static int BLOCK_SIZE, INFO_SIZE, DATA_SIZE, POINTER_SIZE;
    private static int HEADER_SIZE;
    private static byte[] headerBytes;

    private FileManagerBase fm;
//    private BlockDisk[] blocks;
    /**
     * @param hasNext: has next page of the row
     *              0 -> no
     *              1 -> yes
     * @param nextBlock: the pointer of the next block
     */
    private byte hasNext;
    private byte[] nextBlock;


    public RowDisk(String fileName, int blockSize, int infoSize, byte[] data){
        fm = new FileManagerBase(fileName, blockSize);
        if(fm.getSize() == 0){
            DATA_SIZE = 4;
            POINTER_SIZE = 4;
            if(BLOCK_SIZE < DATA_SIZE + POINTER_SIZE){
                System.out.println("The block size is too small, exiting.");
                System.exit(1);
            }
            headerBytes = new byte[BLOCK_SIZE];
            writeDataToHeader(headerBytes);
        }
        else {
            // Read header block and set info
            try {
                headerBytes = fm.read(0);
                readDataFromHeader(headerBytes);
                if (BLOCK_SIZE != blockSize){
                    System.out.println("The block size contained in header block did not match input block size, exiting.");
                    System.exit(1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        this.hasNext = Bytes.intToByte(0);
        Bytes.intToBytes(0, this.nextBlock, 0);
    }

    /**
     * write data to disk
     * @param data: total bytes of data
     * @return the position of the first block to write
     */
    public int write(byte[] data){
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

    /**
     * read data from disk
     * @param position: the first index
     * @return the bytes
     */
    public byte[] read(int position){
        byte[] data = new byte[0];
        while (true) {
            try {
                byte[] blockBytes = fm.read(position);
                BlockDisk block = new BlockDisk(BLOCK_SIZE, INFO_SIZE, blockBytes);

                byte[] content = block.getContent();
                data = Bytes.combineBytes(data, content);

                if(!block.hasNext()){
                    break;
                }
                position = block.getNextBlock();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    private byte[] writeInfo(boolean empty, boolean hasNext, int nextPosition, int contentBytes){
        byte[] info = new byte[INFO_SIZE];
        info[0] = Bytes.booleanToByte(empty);
        info[1] = Bytes.booleanToByte(hasNext);
        Bytes.intToBytes(nextPosition, info, 2);
        Bytes.intToBytes(contentBytes, info, 6);
        return info;
    }

    /**
     * Writes the data byte array to the header of the index file.
     * @param headerBytes - the header byte to get the index information from
     */
    private void writeDataToHeader(byte[] headerBytes){
        Bytes.intToBytes(BLOCK_SIZE, headerBytes, 0);
        headerBytes[4] = Bytes.intToByte(DATA_SIZE);
        headerBytes[5] = Bytes.intToByte(POINTER_SIZE);
        HEADER_SIZE = 6;
        try {
            fm.write(headerBytes, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets the in-memory variables of the header from the byte array.
     * @param headerBytes - the byte array to get the header information from
     */
    private static void readDataFromHeader(byte[] headerBytes){
        BLOCK_SIZE = Bytes.bytesToInt(headerBytes, 0);
        DATA_SIZE = Bytes.byteToInt(headerBytes[4]);
        POINTER_SIZE = Bytes.byteToInt(headerBytes[5]);
        HEADER_SIZE = 6;
    }

    public static int getAvailableSize(){
        return BLOCK_SIZE - 1 - POINTER_SIZE;
    }
}
