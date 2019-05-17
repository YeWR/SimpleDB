package Database;

import FileManager.FileManagerBase;
import Utils.Bytes;
import javafx.scene.control.Tab;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Database extends Prototype {
    public static final int INT = 1;
    public static final int LONG = 2;
    public static final int FLOAT = 3;
    public static final int DOUBLE = 4;
    public static final int STRING = 5;

    public static final int INTSIZE = 4;
    public static final int LONGSIZE = 8;
    public static final int FLOATSIZE = 8;
    public static final int DOUBLESIZE = 8;
    public static final int STRINGSIZE = 256;

    private static int BLOCK_SIZE; //, COLUMN_SIZE;
    private static int HEADER_SIZE;
    private static byte[] headerBytes;

    private String name;
    private HashMap<String, Table> tableHashMap;

    public Database(String name, int blockSize){
        path = Paths.get("data/", name, name + ".db");
        fm = new FileManagerBase(path.toString(), blockSize);

        if(fm.getSize() == 0){
            BLOCK_SIZE = blockSize;
            if(overFlow()){
                System.out.println("The block size is too small, exiting...");
                System.exit(1);
            }
            headerBytes = new byte[BLOCK_SIZE];
            writeDataToHeader(headerBytes);
            tableHashMap = new HashMap<String, Table>();
        }
        else {
            try {
                headerBytes = fm.read(0);
                readDataFromHeader(headerBytes);
                if(BLOCK_SIZE != blockSize){
                    System.out.println("The block size contained in header block did not match input block size, exiting.");
                    System.exit(1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Table createTable(String tableName, String[] columnNames, String[] columnTypes){
        Schema schema = new Schema(columnNames, columnTypes);
        return createTable(tableName, schema);
    }

    private Table createTable(String tableName, Schema schema){
        Table table = new Table(this, tableName, schema);
        this.tableHashMap.put(tableName, table);
        return table;
    }

    /**
     * Writes the data byte array to the header of the table file.
     * @param headerBytes
     */
    void writeDataToHeader(byte[] headerBytes) {
        Bytes.intToBytes(BLOCK_SIZE, headerBytes, 0);
        HEADER_SIZE = 4;
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
    static void readDataFromHeader(byte[] headerBytes){
        BLOCK_SIZE = Bytes.bytesToInt(headerBytes, 0);
        HEADER_SIZE = 4;
    }

    public String getName(){
        return this.name;
    }

    public static int typeToInt(String type){
        switch (type){
            case "Int":
                return Database.INT;
            case "Long":
                return Database.LONG;
            case "Float":
                return Database.FLOAT;
            case "Double":
                return Database.DOUBLE;
            case "String":
                return Database.STRING;
            default:
                return 0;
        }
    }

    public static int getTypeSize(String type){
        switch (type){
            case "Int":
                return Database.INTSIZE;
            case "Long":
                return Database.LONGSIZE;
            case "Float":
                return Database.FLOATSIZE;
            case "Double":
                return Database.DOUBLESIZE;
            case "String":
                return Database.STRINGSIZE;
            default:
                return 0;
        }
    }
}
