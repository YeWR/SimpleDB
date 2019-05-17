package Database;

import FileManager.FileManagerBase;
import Utils.Bytes;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Table{
    /**
     * @param TYPE_SIZE: type的存储byte大小
     * =========================================
     */
    private Database db;
    private Schema schema;
    private String name;
    private Path path;

    /**
     * for create
     * @param db
     * @param name
     * @param schema
     */
    public Table(Database db, String name, Schema schema){
        this.db = db;
        this.schema = schema;
        this.name = name;

        path = Paths.get(this.db.getPath().toString(), name + ".table");
    }

    /**
     * for read
     * @param db
     * @param name
     */
    public Table(Database db, String name){

    }

    public void update(){
        try {
            OutputStream f = new FileOutputStream(path.toString());
            f.write(this.toBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public byte[] toBytes(){
        /**
         * table name
         * schema
         */
        byte[] schemaData = this.schema.toBytes();
        byte[] nameData = Bytes.stringToBytes(this.name);
        byte[] bytes = Bytes.combineBytes(nameData, schemaData);
        return bytes;
    }

    /**
     * @return the column number of the table
     */
    public int column(){
        return this.schema.columns();
    }

    /**
     * @return the types of the schema
     */
    public String[] types(){
        return (String[]) schema.getTypes().toArray();
    }
}
