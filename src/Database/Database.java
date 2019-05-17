package Database;

import FileManager.FileManagerBase;
import Utils.Bytes;
import Utils.FileUtils;
import javafx.scene.control.Tab;

import java.io.File;
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

    private String name;
    private Path path;

    public Database(String name, int blockSize){
        BLOCK_SIZE = blockSize;
        this.name = name;

        path = Paths.get("./data", name);
        FileUtils.createDir(path.toString());
    }

    public Table createTable(String tableName, String[] columnNames, String[] columnTypes){
        // TODO: find the same
        Schema schema = new Schema(columnNames, columnTypes);
        return createTable(tableName, schema);
    }

    private Table createTable(String tableName, Schema schema){
        // create file
        Path filePath = Paths.get(path.toString(), tableName + ".table");
        FileUtils.createFile(filePath.toString());

        Table table = new Table(this, tableName, schema);
        return table;
    }

    private int getTableNum(){
        return 0;
    }

    public String getName(){
        return this.name;
    }

    public Path getPath(){
        return this.path;
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
