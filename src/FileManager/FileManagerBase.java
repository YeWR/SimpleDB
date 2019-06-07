package FileManager;

import Utils.Bytes;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileManagerBase {
    private RandomAccessFile file;
    private File inputFile;
    private FileChannel fc;
    private ByteBuffer bb;
    private final int blockSize;        // size of one block
    private int size = 0;               // number of blocks in the file
    private long numReadWrites = 0;     // number of reads and writes performed on RandomAccessFile

    /**
     * Constructor for the FileManager. Given a file name and a block size, either opens an existing file
     * (if the file exists) or creates a new one, in R/W mode.
     * @param fileName - the file name to open
     * @param blockSize - the size of each block in the file
     */
    public FileManagerBase(String fileName, int blockSize){
        this.blockSize = blockSize;
        this.numReadWrites = 0;
        this.inputFile = new File(fileName);
        try {
            this.file = new RandomAccessFile(inputFile, "rw");
            this.fc = this.file.getChannel();
            this.bb = ByteBuffer.allocate(blockSize);

            if(inputFile.exists()){
                this.size = (int) (this.inputFile.length() / blockSize);
                if(this.inputFile.length() % blockSize != 0){
                    this.file.setLength(size * blockSize);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for writing a block to the FileManager, given a position to write it to.
     * @param bytes - the byte representation of the Node to write to the FileManager
     * @param position - the position to write it to
     */
    public void write(byte[] bytes, int position) throws IOException {
        if(position < 0 || position > this.size){
            throw new IndexOutOfBoundsException("Position index out of bounds when writing to block " + position + "\n"
                    + "Size of file is " + this.size);
        }
        else {
            this.bb = ByteBuffer.allocate(this.blockSize);
            this.bb.put(bytes);
            this.bb.rewind();

            fc.write(this.bb, position * this.blockSize);
            this.numReadWrites ++;
            if(position == this.size){
                this.size ++;
            }
        }
    }

    /**
     * Method for writing a block to the end of the FileManager.
     * @param bytes - the byte representation of the Node to write to the FileManager
     * @return the new size of the FileManager (after writing the block).
     */

    public int write(byte[] bytes) throws IOException {
        this.bb = ByteBuffer.allocate(this.blockSize);
        this.bb.put(bytes);
        this.bb.rewind();

        fc.write(bb, size * blockSize);
        this.numReadWrites ++;
        this.size ++;

        return this.size;
    }

    /**
     * Method for reading a block given a position within the file
     * @param blockPosition - the position of the block in the file
     * @return the block that found at that position
     */
    public byte[] read(int blockPosition) throws IOException{
        if(blockPosition < 0 || blockPosition > this.size){
            throw new IndexOutOfBoundsException();
        }

        this.bb = ByteBuffer.allocate(this.blockSize);
        this.fc.read(bb, blockPosition * this.blockSize);
        this.numReadWrites ++;
        return this.bb.array();
    }

    public int getBlockSize(){
        return this.blockSize;
    }

    public int getSize(){
        return this.size;
    }

    public long getNumberOfReadWrites(){
        return this.numReadWrites;
    }

    public void resetReadWriteCounter(){
        this.numReadWrites = 0;
    }

    /**
     * Deletes the underlying file that the RAF accesses, after it closes the file.
     * @return true if the file was successfully deleted.
     */
    public boolean deleteFile(){
        try {
            this.file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return this.inputFile.delete();
    }

    /**
     * Method for closing the random access file
     */
    public void close() throws IOException {
        this.file.close();
    }

    /**
     * find the next available position of block for storing.
     * @param num: the number of positions you want
     * @return
     */
    public int[] getNextBlockPositions(int num){
        int[] positions = new int[num];
        int index = 0;

        for(int i = 1; i < this.size; ++i){
            ByteBuffer infoBuffer = ByteBuffer.allocate(1);
            try {
                this.fc.read(infoBuffer, i * this.blockSize);
                this.numReadWrites ++;
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte info = infoBuffer.array()[0];
            boolean empty = Bytes.byteToBoolean(info);
            if(empty && index < num){
                positions[index] = i;
                index ++;
            }
        }

        for (int i = index; i < num; ++i){
            positions[i] = this.size + i;
        }
        return positions;
    }

}
