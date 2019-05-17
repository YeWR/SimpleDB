package Database;

import FileManager.FileManagerBase;
import Utils.Bytes;

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
    private FileManagerBase fm;

    public Table(Database db, String name, Schema schema){
        this.db = db;
        this.schema = schema;
        this.name = name;

        Path path = Paths.get(this.db.getPath().toString(), name + ".table");
        fm = new FileManagerBase(path.toString(), Prototype.BLOCK_SIZE);
        if(fm.getSize() == 0){

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
