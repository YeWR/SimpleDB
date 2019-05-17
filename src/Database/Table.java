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
        this.path = Paths.get(this.db.getPath().toString(), name + ".table");

        this.update();
    }

    /**
     * for read
     * @param db
     * @param name
     */
    public Table(Database db, String name){
        this.db = db;
        this.name = name;
        this.path = Paths.get(this.db.getPath().toString(), name + ".table");

        try {
            File file = new File(this.path.toString());
            Long filelength = file.length();
            byte[] filecontent = new byte[filelength.intValue()];
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            byte[] nameB = new byte[Database.STRINGSIZE];
            System.arraycopy(filecontent, 0, nameB, 0, Database.STRINGSIZE);
            String tempName = Bytes.bytesToString(nameB);
            if(!tempName.equals(name)){
                System.out.println("Table read error");
                System.exit(1);
            }

            byte[] left = new byte[(int) (filelength - Database.STRINGSIZE)];
            System.arraycopy(filecontent, Database.STRINGSIZE, left, 0, left.length);
            this.schema = new Schema(left);

        } catch (IOException e) {
            e.printStackTrace();
        }
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

    public String toString(){
        String s = new String();
        s = "Table " + name + "\n";
        s += this.schema.toString();
        return s;
    }
}
