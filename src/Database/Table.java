package Database;

import BplusTree.BplusTree;
import FileManager.FileManagerBase;
import Utils.*;
import serialization.*;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        this.initFile();
        this.initIndex();
        this.writeToFile();
    }

    private void initFile(){
        this.path = Paths.get(this.db.getPath().toString(), this.name);
        FileUtils.createDir(path.toString());

        this.filePath = Paths.get(this.path.toString(), this.name + ".table");
        FileUtils.createFile(filePath.toString());

        String dataPath = Paths.get(this.path.toString(), this.name + ".db").toString();
        FileUtils.createFile(dataPath);
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
        else if(indexType.equals("Float")){
            try {
                return new BplusTree<Float>(temp.toString(), 4, 128, new FloatSerDeser(), new FloatComparator());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(indexType.equals("Double")){
            try {
                return new BplusTree<Double>(temp.toString(), 4, 128, new DoubleSerDeser(), new DoubleComparator());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(indexType.equals("Long")){
            try {
                return new BplusTree<Long>(temp.toString(), 4, 128, new LongSerDeser(), new LongComparator());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Undefined Type in Table.newIndex");
        return null;
    }

    public boolean insert(ArrayList<String> atts, ArrayList<Object> values){
        assert atts.size() == values.size();

        Object[] data = new Object[this.schema.columns()];
        // TODO: null
        for (int i = 0; i < data.length; ++i){
            data[i] = null;
        }

        for (int i = 0; i < atts.size(); ++i){
            int index = this.schema.namePos(atts.get(i));
            if(index == -1){
                System.out.println("attribute " + atts.get(i) + " not exists in table " + this.name);
                return false;
            }
            else {
                data[index] = values.get(i);
            }
        }

        return this.insert(data);
    }

    public boolean insert(Object[] data){
        if(!check(data)){
            System.out.println("type error in insert");
            return false;
        }

        // check primary key
        if(!checkPrimaryKey(data)){
            System.out.println("There exists a row of same primary key!");
            return false;
        }

        Path dataPath = Paths.get(this.path.toString(), this.name + ".db");
        RowDisk rowDisk = new RowDisk(dataPath.toString(), Prototype.BLOCK_SIZE, Prototype.INFO_SIZE);

        byte[] bytes = Bytes.objectsToBytes(data);
        int value = rowDisk.write(bytes);
        rowDisk.close();

        for(int id : this.schema.getIndexes()){
            Object key = data[id];
            String name = this.schema.name(id);
            trees.get(name).insert(key, value);
        }
        return true;
    }

    /*
     * select
     */

    public Row[] selectAll(){
        long[] position = this.trees.get(this.schema.primaryKey()).traverse(null, null);
        if(position == null || position.length == 0){
            return null;
        }

        Row[] rows = new Row[position.length];

        Path dataPath = Paths.get(this.path.toString(), name + ".db");

        for (int i = 0; i < position.length; ++i){
            RowDisk rowDisk = new RowDisk(dataPath.toString(), Prototype.BLOCK_SIZE, Prototype.INFO_SIZE);
            rows[i] = new Row(this, (int) position[i], rowDisk);
        }
        return rows;
    }

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

    public ArrayList<Row> select(String att, String relation, Object data){
        ArrayList<Row> rows = new ArrayList<Row>();
        ArrayList keys = new ArrayList();
        SqlCompare compare = new SqlCompare(relation, data, this.getType(att));
        int attPos = this.schema.namePos(att);
        Path dataPath = Paths.get(this.path.toString(), name + ".db");

        if(this.trees.containsKey(att)){
            BplusTree tree = this.trees.get(att);

            long[] positions = tree.traverse(compare, keys);
            if(positions == null || positions.length == 0){
                return null;
            }

            for (long position : positions) {
                RowDisk rowDisk = new RowDisk(dataPath.toString(), Prototype.BLOCK_SIZE, Prototype.INFO_SIZE);
                rows.add(new Row(this, (int) position, rowDisk));
            }
        }
        else {
            BplusTree tree = this.trees.get(this.schema.primaryKey());

            long[] positions = tree.traverse(null, keys);
            if(positions == null || positions.length == 0){
                return null;
            }

            for (long position : positions) {
                RowDisk rowDisk = new RowDisk(dataPath.toString(), Prototype.BLOCK_SIZE, Prototype.INFO_SIZE);
                Row row = new Row(this, (int) position, rowDisk);

                // pick
                if (row.compare(attPos, compare)) {
                    rows.add(row);
                }
            }
        }

        return rows;
    }

    /*
     * delete
     */

    public void deleteAll(){
        Set<String> keys = this.trees.keySet();

        this.close();
        Path dataPath = Paths.get(this.path.toString(), name + ".db");
        deleteDir(dataPath.toString());

        for (String k : keys){
            Path temp = Paths.get(this.path.toString(), name + "_" + k + ".index");
            deleteDir(temp.toString());
        }

        this.trees.clear();
        this.initFile();
        this.initIndex();
    }

    public int delete(String att, String relation, Object data){
        int record = 0;
        for (Map.Entry<String, BplusTree> entry : this.trees.entrySet()){
            BplusTree tree = entry.getValue();
            String indexName = entry.getKey();
            SqlCompare compare = new SqlCompare(relation, data, this.getType(att));
            int attPos = this.schema.namePos(att);

            // the att is the index
            if(indexName.equals(att)){
                ArrayList keys = new ArrayList();
                long[] positions = tree.traverse(compare, keys);
                if(positions == null || positions.length == 0){
                    continue;
                }
                record = positions.length;

                // delete data
                Path dataPath = Paths.get(this.path.toString(), name + ".db");
                FileManagerBase deleteFm = new FileManagerBase(dataPath.toString(), Prototype.BLOCK_SIZE);
                BlockDisk.delete(deleteFm, positions);
                try {
                    deleteFm.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // delete index
                for (Object k : keys){
                    tree.delete(k);
                }
            }
            // not the index
            else {
                record = 0;
                ArrayList keys = new ArrayList();
                long[] position = tree.traverse(null, keys);
                Path dataPath = Paths.get(this.path.toString(), name + ".db");
                FileManagerBase deleteFm = new FileManagerBase(dataPath.toString(), Prototype.BLOCK_SIZE);

                if(position == null || position.length == 0){
                    continue;
                }

                for (int i = 0; i < position.length; ++i){
                    RowDisk rowDisk = new RowDisk(dataPath.toString(), Prototype.BLOCK_SIZE, Prototype.INFO_SIZE);
                    Row row = new Row(this, (int) position[i], rowDisk);

                    // delete
                    if(row.compare(attPos, compare)){
                        BlockDisk.delete(deleteFm, (int) position[i]);
                        tree.delete(keys.get(i));
                        tree.close();
//                        System.out.println(this);
                        record += 1;
                    }
                }

                try {
                    deleteFm.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return record;
    }

    public void delete(String idName, Object index){
        BplusTree tree = this.trees.get(idName);
        int position = (int) tree.find(index);
        // delete data
        Path dataPath = Paths.get(this.path.toString(), name + ".db");
        FileManagerBase deleteFm = new FileManagerBase(dataPath.toString(), Prototype.BLOCK_SIZE);
        BlockDisk.delete(deleteFm, position);
        try {
            deleteFm.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // delete index
        tree.delete(index);
    }

    /*
     * update
     */

    public void update(ArrayList<String> atts, ArrayList<Object> values, String att, String relation, Object data){

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

    public String getType(String name){
        return this.schema.getType(name);
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

    private boolean checkPrimaryKey(Object[] objs){
//        boolean ans = true;
//        for(int id : this.schema.getIndexes()){
//            String idName = this.schema.name(id);
//            BplusTree tree = this.trees.get(idName);
//            Object value = objs[id];
//            int position = (int) tree.find(value);
//            if(position != 0){
//                ans = false;
//                break;
//            }
//        }
        String idName = this.schema.primaryKey();
        BplusTree tree = this.trees.get(idName);
        Object value = objs[this.schema.primaryKeyPos()];
        int position = (int) tree.find(value);
        if(position != 0){
            return false;
        }
        return true;
    }

    public boolean hasAttributes(ArrayList<String> atts){
        return this.schema.hasAttributes(atts);
    }

    public ArrayList<Integer> attributesPos(ArrayList<String> atts){
        return this.schema.attributesPos(atts);
    }

    public void close(){
        if(trees == null){
            return;
        }
        for (Map.Entry<String, BplusTree> entry : trees.entrySet()){
            entry.getValue().close();
        }
    }

    public void deleteTable(){
        close();
        boolean over = deleteDir(this.path.toString());
        if(!over){
            System.out.println("Delete Table Failed!");
        }
    }

    public String show(){
        return this.schema.show();
    }

    public String toString(){
        StringBuilder s;
        s = new StringBuilder("Table " + name + "\n");
        s.append(this.schema.toString());
        Row[] rows = this.selectAll();
        s.append(Row.toStrings(rows));
        return s.toString();
    }
}
