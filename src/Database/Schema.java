package Database;

import Utils.Bytes;

import java.util.ArrayList;
import java.util.Arrays;

public class Schema {
    /**
     * for a table
     */

    private static int COLUMNSIZE = 4;

    private ArrayList<String> names;
    private ArrayList<String> types;

    /**
     * for create
     * @param names
     * @param types
     */
    public Schema(String[] names, String[] types){
        assert names.length == types.length;
        this.names = new ArrayList<>(Arrays.asList(names));
        this.types = new ArrayList<>(Arrays.asList(types));
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

        int index = COLUMNSIZE;
        for(int i = 0; i < len; ++i){
            byte[] bs = new byte[Database.STRINGSIZE];
            System.arraycopy(bytes, index, bs, 0, Database.STRINGSIZE);
            String name = Bytes.bytesToString(bs);
            names.add(name);

            index += Database.STRINGSIZE;
        }

        for(int i = 0; i < len; ++i){
            byte[] bs = new byte[4];
            System.arraycopy(bytes, index, bs, 0, 4);
            int b = Bytes.bytesToInt(bs);
            String type = Database.typeToString(b);
            types.add(type);

            index += 4;
        }
    }

    public byte[] toBytes(){
        int len = names.size();
        /**
         * 0-3: how many columns
         * 4-*: total names of columns (stored in string_
         * *-*: total types of columns
         */
        int total = COLUMNSIZE + len * (Database.STRINGSIZE + 4);
        byte[] bytes = new byte[total];

        int index = 0;
        byte[] temp = Bytes.intToBytes(len);
        System.arraycopy(temp, 0, bytes, index, COLUMNSIZE);

        index += COLUMNSIZE;
        for (String name : names){
            byte[] nameBytes = Bytes.stringToBytes(name);
            System.arraycopy(nameBytes, 0, bytes, index, nameBytes.length);

            index += nameBytes.length;
        }

        for (String type : types){
            int T = Database.typeToInt(type);
            byte[] bs = Bytes.intToBytes(T);

            System.arraycopy(bs, 0, bytes, index, bs.length);
            index += bs.length;
        }

        return bytes;
    }

    public ArrayList<String> getTypes(){
        return types;
    }

    public int columns(){
        return this.names.size();
    }

    public String toString(){
        String s = new String();
        s += "--------------------------------------------------------------------\n";
        for (int i = 0; i < this.columns(); ++i){
            s += " | ";
            s += this.names.get(i);
        }
        s += " | \n";
        s += "--------------------------------------------------------------------\n";
        return s;
    }
}
