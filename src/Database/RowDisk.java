package Database;

import FileManager.FileManagerBase;
import Utils.Bytes;
import Utils.Log;
import jdk.nashorn.internal.ir.Block;

import java.io.IOException;
import java.nio.ByteBuffer;

public class RowDisk extends BlockDisk {
    /**
     * row in a table stored on the disk
     */

    private static int DATA_SIZE, POINTER_SIZE;
    private static int HEADER_SIZE;
    private static byte[] headerBytes;

    private FileManagerBase fm;

    public RowDisk(String fileName, int blockSize, int infoSize){
        super(blockSize, infoSize);
        fm = new FileManagerBase(fileName, blockSize);
        if(fm.getSize() == 0){
            BLOCK_SIZE = blockSize;
            INFO_SIZE = infoSize;
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
    }

    public int write(byte[] data) {
        return BlockDisk.write(this.fm, data);
    }

    public byte[] read(int position) {
        return BlockDisk.read(this.fm, position);
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
    private void readDataFromHeader(byte[] headerBytes){
        BLOCK_SIZE = Bytes.bytesToInt(headerBytes, 0);
        DATA_SIZE = Bytes.byteToInt(headerBytes[4]);
        POINTER_SIZE = Bytes.byteToInt(headerBytes[5]);
        HEADER_SIZE = 6;
    }
}
