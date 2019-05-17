package Database;

import Utils.Bytes;

import java.util.ArrayList;
import java.util.Arrays;

public class Schema {
    /**
     * for a table
     */

    private static int COLUMNSIZE = 4, INDEXSIZE = 4;

    private ArrayList<String> names;
    private ArrayList<String> types;
    private int index;

    /**
     * for create
     * @param names
     * @param types
     */
    public Schema(String[] names, String[] types, String indexName){
        assert names.length == types.length;
        this.names = new ArrayList<>(Arrays.asList(names));
        this.types = new ArrayList<>(Arrays.asList(types));

        this.index = this.names.indexOf(indexName);
        assert this.index >= 0;
    }

    /**
     * for read
     * @param bytes
     */
    public Schema(byte[] bytes){
        byte[] temp = new byte[COLUMNSIZE];
        System.arraycopy(bytes, 0, temp, 0, COLUMNSIZE);

        int len = Bytes.bytesToInt(temp);
        names = new ArrayList<>();
        types = new ArrayList<>();

        int id = COLUMNSIZE;
        for(int i = 0; i < len; ++i){
            byte[] bs = new byte[Database.STRINGSIZE];
            System.arraycopy(bytes, id, bs, 0, Database.STRINGSIZE);
            String name = Bytes.bytesToString(bs);
            names.add(name);

            id += Database.STRINGSIZE;
        }

        for(int i = 0; i < len; ++i){
            byte[] bs = new byte[4];
            System.arraycopy(bytes, id, bs, 0, 4);
            int b = Bytes.bytesToInt(bs);
            String type = Database.typeToString(b);
            types.add(type);

            id += 4;
        }

        byte[] temp1 = new byte[4];
        System.arraycopy(bytes, id, temp1, 0, temp1.length);
        this.index = Bytes.bytesToInt(temp1);
    }

    public byte[] toBytes(){
        int len = names.size();
        /**
         * 0-3: how many columns
         * 4-*: total names of columns (stored in string_
         * *-*: total types of columns
         * *-*: index
         */
        int total = COLUMNSIZE + len * (Database.STRINGSIZE + 4) + INDEXSIZE;
        byte[] bytes = new byte[total];

        int id = 0;
        byte[] temp = Bytes.intToBytes(len);
        System.arraycopy(temp, 0, bytes, id, COLUMNSIZE);

        id += COLUMNSIZE;
        for (String name : names){
            byte[] nameBytes = Bytes.stringToBytes(name);
            System.arraycopy(nameBytes, 0, bytes, id, nameBytes.length);

            id += nameBytes.length;
        }

        for (String type : types){
            int T = Database.typeToInt(type);
            byte[] bs = Bytes.intToBytes(T);

            System.arraycopy(bs, 0, bytes, id, bs.length);
            id += bs.length;
        }

        byte[] temp1 = Bytes.intToBytes(this.index);
        System.arraycopy(temp1, 0, bytes, id, temp1.length);

        return bytes;
    }

    public String type(int index){
        return this.types.get(index);
    }

    public ArrayList<String> getTypes(){
        return types;
    }

    public ArrayList<Class> getClasses(){
        ArrayList<Class> classes = new ArrayList<>();
        for(String type : this.types){
            classes.add(Database.typeToClass(type));
        }
        return classes;
    }

    public int columns(){
        return this.names.size();
    }

    public int getIndex(){
        return this.index;
    }

    public String toString(){
        String s = new String();
        s += "--------------------------------------------------------------------\n";
        for (int i = 0; i < this.columns(); ++i){
            s += " | ";
            s += this.names.get(i);
            if(i == this.index){
                s += "(*)";
            }
        }
        s += " | \n";
        s += "--------------------------------------------------------------------\n";
        return s;
    }
}
