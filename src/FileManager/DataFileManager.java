package FileManager;

public class DataFileManager extends FileManagerBase {

    /**
     * Constructor for the FileManager. Given a file name and a block size, either opens an existing file
     * (if the file exists) or creates a new one, in R/W mode.
     *
     * @param fileName  - the file name to open
     * @param blockSize - the size of each block in the file
     */
    public DataFileManager(String fileName, int blockSize) {
        super(fileName, blockSize);
    }
}
