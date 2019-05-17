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

    public Schema(String[] names, String[] types){
        assert names.length == types.length;
        this.names = new ArrayList<>(Arrays.asList(names));
        this.types = new ArrayList<>(Arrays.asList(types));
    }

    public byte[] toBytes(){
        int len = names.size();
        /**
         * 0-3: how many columns
         * 4-*: total names of columns (stored in string_
         * *-*: total types of columns
         */
        int total = COLUMNSIZE + len * (Database.STRINGSIZE + 1);
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
}
