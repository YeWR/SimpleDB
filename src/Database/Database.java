package Database;

import Utils.FileUtils;
import javafx.scene.control.Tab;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static Utils.FileUtils.deleteDir;

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
    private HashMap<String, Table> tableInUse;

    public Database(String name, int blockSize, int infoSize){
        BLOCK_SIZE = blockSize;
        INFO_SIZE = infoSize;
        this.name = name;

        path = Paths.get("./data", name);
        if(!FileUtils.fileExist(path.toString())) {
            FileUtils.createDir(path.toString());
        }

        tableInUse = new HashMap<String, Table>();
    }

    public Table getTable(String tableName){
        Table table =  this.tableInUse.get(tableName);
        if(table == null) {
            table = new Table(this, tableName);
            this.tableInUse.put(tableName, table);
        }
        return table;
    }

    public Table createTable(String tableName, String[] columnNames, String[] columnTypes, String indexNames[]){
        Schema schema = new Schema(columnNames, columnTypes, indexNames);
        return createTable(tableName, schema);
    }

    private Table createTable(String tableName, Schema schema){
        if(tableIsExist(tableName)){
            System.out.println("Table exists, cannot create table " + tableName);
            return null;
        }
        // create file
//        Path filePath = Paths.get(path.toString(), tableName + ".table");
//        FileUtils.createFile(filePath.toString());

        Table table = new Table(this, tableName, schema);
        this.tableInUse.put(tableName, table);
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

    public static Class typeToClass(String type){
        switch (type){
            case "Int":
                return Integer.class;
            case "Long":
                return Long.class;
            case "Float":
                return Float.class;
            case "Double":
                return Double.class;
            case "String":
                return String.class;
            default:
                return null;
        }
    }

    public static int classToSize(Class cls){
        if(cls == Integer.class){
            return Database.INTSIZE;
        }
        else if(cls == Long.class){
            return Database.LONGSIZE;
        }
        else if(cls == Float.class){
            return Database.FLOATSIZE;
        }
        else if(cls == Double.class){
            return Database.DOUBLESIZE;
        }
        else if(cls == String.class){
            return Database.STRINGSIZE;
        }
        else {
            return 0;
        }
    }

    public static String typeToString(int type){
        switch (type){
            case 1:
                return "Int";
            case 2:
                return "Long";
            case 3:
                return "Float";
            case 4:
                return "Double";
            case 5:
                return "String";
            default:
                return null;
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

    public boolean tableIsExist(String tableName) {
        Path filePath = Paths.get(path.toString(), tableName + ".table");
        return FileUtils.fileExist(filePath.toString());
    }

    public void close(){
        if(this.tableInUse == null){
            return;
        }
        for (Map.Entry<String, Table> entry : this.tableInUse.entrySet()){
            entry.getValue().close();
        }
    }

    public void deleteDB(){
        if(this.tableInUse != null){
            for (Map.Entry<String, Table> entry : this.tableInUse.entrySet()){
                entry.getValue().deleteTable();
            }
        }
        deleteDir(this.path.toString());
    }
}
