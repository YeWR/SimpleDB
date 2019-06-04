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
    // indexes[0] -> primary key
    private ArrayList<Integer> indexes;

    /**
     * for create
     * @param names
     * @param types
     */
    public Schema(String[] names, String[] types, String[] indexNames){
        assert names.length == types.length;
        this.names = new ArrayList<>(Arrays.asList(names));
        this.types = new ArrayList<>(Arrays.asList(types));

        this.indexes = new ArrayList<Integer>(indexNames.length);
        for (String index : indexNames) {
            int id = this.names.indexOf(index);
            assert id >= 0;
            this.indexes.add(id);
        }
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
        id += 4;

        int indexNum = Bytes.bytesToInt(temp1);
        this.indexes = new ArrayList<Integer>(indexNum);
        for (int i = 0; i < indexNum; ++i){
            byte[] bs = new byte[4];
            System.arraycopy(bytes, id, bs, 0, 4);
            int b = Bytes.bytesToInt(bs);
            this.indexes.add(b);
        }
    }

    public byte[] toBytes(){
        int len = names.size();
        /**
         * 0-3: how many columns
         * 4-*: total names of columns (stored in string_
         * *-*: total types of columns
         * *-*: index
         */
        int total = COLUMNSIZE + len * (Database.STRINGSIZE + 4) + INDEXSIZE + indexes.size() * INDEXSIZE;
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

        byte[] temp1 = Bytes.intToBytes(this.indexes.size());
        System.arraycopy(temp1, 0, bytes, id, temp1.length);
        id += temp1.length;

        for(int i : this.indexes){
            byte[] bs = Bytes.intToBytes(i);
            System.arraycopy(bs, 0, bytes, id, bs.length);

            id += bs.length;
        }
        return bytes;
    }

    public String name(int index){
        return this.names.get(index);
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

    public ArrayList<Integer> getIndexes(){
        return this.indexes;
    }

    public String primaryKey(){
        return this.name(this.indexes.get(0));
    }

    public boolean hasAttributes(ArrayList<String> atts){
        for(String att : atts){
            if(!this.names.contains(att)){
                return false;
            }
        }
        return true;
    }

    public String show(){
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < this.columns(); ++i){
            s.append("\t|\t");
            s.append(this.names.get(i));
            s.append(":(").append(this.types.get(i)).append(")");
            int id = this.indexes.indexOf(i);
            if(id == 0){
                s.append("(*)");
            }
            else if(id != -1){
                s.append("(+)");
            }
        }
        s.append("\t|");
        return s.toString();
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("--------------------------------------------------------------------\n");
        for (int i = 0; i < this.columns(); ++i){
            s.append("\t|\t");
            s.append(this.names.get(i));
            int id = this.indexes.indexOf(i);
            if(id == 0){
                s.append("(*)");
            }
            else if(id != -1){
                s.append("(+)");
            }
        }
        s.append("\t|\n");
        s.append("--------------------------------------------------------------------\n");
        return s.toString();
    }
}
