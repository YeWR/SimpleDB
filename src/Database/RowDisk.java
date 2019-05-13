package Database;

import FileManager.FileManagerBase;
import Utils.Bytes;
import Utils.Log;

import java.io.IOException;
import java.nio.ByteBuffer;

public class RowDisk {
    /**
     * row in a table stored on the disk
     */

    private static int BLOCK_SIZE, DATA_SIZE, POINTER_SIZE;
    private static byte[] headerBytes;

    private FileManagerBase fm;
    /**
     * @param hasNext: has next page of the row
     *              0 -> no
     *              1 -> yes
     * @param nextBlock: the pointer of the next block
     */
    private byte hasNext;
    private byte[] nextBlock;


    public RowDisk(String fileName, int blockSize){
        fm = new FileManagerBase(fileName, blockSize);
        if(fm.getSize() == 0){
            // the file opened was empty
            // Write new header data first

            BLOCK_SIZE = blockSize;
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
//        int slice = getAvailableSize();
//        int dataBytes = data.length;
//
//        byte[] head = Bytes.combineBytes(this.hasNext, this.nextBlock);
//        if(dataBytes > slice){
//            int num = dataBytes / slice;
//            for()
//
//        }
//        else {
//            byte[] dataThisBlock = Bytes.combineBytes(head, data);
//            try {
//                return fm.write(dataThisBlock);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        return 0;

    }

    /**
     * Writes the data byte array to the header of the index file.
     * @param headerBytes - the header byte to get the index information from
     */
    private void writeDataToHeader(byte[] headerBytes){
        Bytes.intToBytes(BLOCK_SIZE, headerBytes, 0);
        headerBytes[4] = Bytes.intToByte(DATA_SIZE);
        headerBytes[5] = Bytes.intToByte(POINTER_SIZE);
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
    }

    public static int getAvailableSize(){
        return BLOCK_SIZE - 1 - POINTER_SIZE;
    }
}
