package Database;

import BplusTree.*;
import FileManager.FileManagerBase;
import Utils.Bytes;
import Utils.FileUtils;
import Utils.IntegerComparator;
import Utils.StringComparator;
import serialization.IntegerSerDeser;
import serialization.StringSerDeser;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static Utils.FileUtils.deleteDir;

public class Table{
    /**
     * @param TYPE_SIZE: type的存储byte大小
     * =========================================
     */
    private Database db;
    private Schema schema;
    private String name;
    private Path path;
    private Path filePath;
    private HashMap<String, BplusTree> trees;

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

        this.path = Paths.get(this.db.getPath().toString(), this.name);
        FileUtils.createDir(path.toString());

        this.filePath = Paths.get(this.path.toString(), this.name + ".table");
        FileUtils.createFile(filePath.toString());

        this.initIndex();
        this.writeToFile();
    }

    /**
     * for read
     * @param db
     * @param name
     */
    public Table(Database db, String name){
        this.db = db;
        this.name = name;
        this.path = Paths.get(this.db.getPath().toString(), this.name);
        this.filePath = Paths.get(this.path.toString(), this.name + ".table");

        try {
            File file = new File(this.filePath.toString());
            Long filelength = file.length();
            byte[] filecontent = new byte[filelength.intValue()];
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();

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

            this.initIndex();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initIndex(){
        ArrayList<Integer> indexes = schema.getIndexes();
        this.trees = new HashMap<String, BplusTree>(indexes.size());
        for (int id : indexes) {
            String idName = this.schema.name(id);
            String idType = this.schema.type(id);

            this.trees.put(idName, this.newIndex(idName, idType));
        }
    }

    /**
     *
     * @param indexName
     * @param indexType
     * @return
     */
    private BplusTree newIndex(String indexName, String indexType){
        Path temp = Paths.get(this.path.toString(), name + "_" + indexName + ".index");
        if(indexType.equals("String")){
            try {
                return new BplusTree<String>(temp.toString(), 4, 128, new StringSerDeser(), new StringComparator());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(indexType.equals("Int")){
            try {
                return new BplusTree<Integer>(temp.toString(), 4, 128, new IntegerSerDeser(), new IntegerComparator());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            // TODO: other types;
            return null;
        }
        return null;
    }

    public boolean insert(Object[] data){
        if(!check(data)){
            System.out.println("type error in insert");
            return false;
        }

        // check index
        if(!checkSameIndex(data)){
            System.out.println("There exists a row of same index!");
            return false;
        }

        Path dataPath = Paths.get(this.path.toString(), this.name + ".db");
        RowDisk rowDisk = new RowDisk(dataPath.toString(), Prototype.BLOCK_SIZE, Prototype.INFO_SIZE);

        byte[] bytes = Bytes.objectsToBytes(data);
        int value = rowDisk.write(bytes);

        for(int id : this.schema.getIndexes()){
            Object key = data[id];
            String name = this.schema.name(id);
            trees.get(name).insert(key, value);
        }
        return true;
    }

    /**
     * TODO: add condition
     * @return
     */
    public Row select(String idName, Object index){
        Row row = null;
        int position = (int) this.trees.get(idName).find(index);
        if(position > 0) {
            Path dataPath = Paths.get(this.path.toString(), name + ".db");
            RowDisk rowDisk = new RowDisk(dataPath.toString(), Prototype.BLOCK_SIZE, Prototype.INFO_SIZE);

            row = new Row(this, position, rowDisk);
        }
        return row;
    }

    public void delete(String idName, Object index){
        BplusTree tree = this.trees.get(idName);
        int position = (int) tree.find(index);
        // delete data
        Path dataPath = Paths.get(this.path.toString(), name + ".db");
        FileManagerBase deleteFm = new FileManagerBase(dataPath.toString(), Prototype.BLOCK_SIZE);
        BlockDisk.delete(deleteFm, position);
        // delete index
        tree.delete(index);
    }

    public void update(String idName, Object index, Object[] data){
        // TODO: 查重
        this.delete(idName, index);
        this.insert(data);
    }

    public void writeToFile(){
        try {
            OutputStream f = new FileOutputStream(filePath.toString());
            f.write(this.toBytes());
            f.close();
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
        String[] ts = new String[this.schema.columns()];
        for (int i = 0; i < ts.length; ++i){
            ts[i] = this.schema.type(i);
        }
        return ts;
    }

    private boolean check(Object[] objs){
        boolean ans = true;
        assert objs.length == this.schema.columns();
        ArrayList<Class> classes = this.schema.getClasses();
        for(int i = 0; i < objs.length; ++i){
            if(objs[i].getClass() != classes.get(i)){
                ans = false;
                break;
            }
        }
        return ans;
    }

    private boolean checkSameIndex(Object[] objs){
        boolean ans = true;
        for(int id : this.schema.getIndexes()){
            String idName = this.schema.name(id);
            BplusTree tree = this.trees.get(idName);
            Object value = objs[id];
            int position = (int) tree.find(value);
            if(position != 0){
                ans = false;
                break;
            }
        }
        return ans;
    }

    public void deleteTable(){
        for (Map.Entry<String, BplusTree> entry : trees.entrySet()){
            entry.getValue().close();
        }
        deleteDir(this.path.toString());
    }

    public String toString(){
        String s = new String();
        s = "Table " + name + "\n";
        s += this.schema.toString();
        return s;
    }
}
