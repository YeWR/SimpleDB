package Database;

import Utils.Bytes;

import java.util.ArrayList;
import java.util.Arrays;

public class Schema {
    /**
     * for a table
     */

    private static int COLUMNSIZE = 4, INDEXSIZE = 4, CANBENULLSIZE = 1, TYPESIZE = 4;

    private ArrayList<String> names;
    private ArrayList<String> types;
    // indexes[0] -> primary key
    private ArrayList<Integer> indexes;
    private ArrayList<Boolean> canBeNull;
    private ArrayList<Integer> typeSizes;

    /**
     * for create
     * @param names
     * @param types
     * @param typeSizes
     */
    public Schema(String[] names, String[] types, String[] indexNames, String[] notNullAtts, Integer[] typeSizes){
        assert names.length == types.length;
        this.names = new ArrayList<>(Arrays.asList(names));
        this.types = new ArrayList<>(Arrays.asList(types));
        this.typeSizes = new ArrayList<>(Arrays.asList(typeSizes));

        this.indexes = new ArrayList<>(indexNames.length);
        this.canBeNull = new ArrayList<>(names.length);

        for (String index : indexNames) {
            int id = this.names.indexOf(index);
            assert id >= 0;
            this.indexes.add(id);
        }

        for (int i = 0; i < names.length; ++i){
            canBeNull.add(true);
        }
        for (int i = 0; i < notNullAtts.length; ++i){
            int pos = this.namePos(notNullAtts[i]);
            canBeNull.set(pos, false);
        }
    }

    public Schema(String[] names, String[] types, Integer[] indexes){
        assert names.length == types.length;
        this.names = new ArrayList<>(Arrays.asList(names));
        this.types = new ArrayList<>(Arrays.asList(types));
        this.indexes = new ArrayList<>(Arrays.asList(indexes));
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

        // index
        byte[] temp1 = new byte[4];
        System.arraycopy(bytes, id, temp1, 0, temp1.length);
        id += 4;

        int indexNum = Bytes.bytesToInt(temp1);
        this.indexes = new ArrayList<Integer>();
        for (int i = 0; i < indexNum; ++i){
            byte[] bs = new byte[4];
            System.arraycopy(bytes, id, bs, 0, 4);
            int b = Bytes.bytesToInt(bs);
            indexes.add(b);

            id += 4;
        }

        // can be null
        temp1 = new byte[4];
        System.arraycopy(bytes, id, temp1, 0, temp1.length);
        id += 4;

        int nullNum = Bytes.bytesToInt(temp1);
        this.canBeNull = new ArrayList<>();
        for (int i = 0; i < nullNum; ++i){
            byte b = bytes[id];
            boolean nb = Bytes.byteToBoolean(b);
            canBeNull.add(nb);

            id += 1;
        }

        // type size
        temp1 = new byte[4];
        System.arraycopy(bytes, id, temp1, 0, temp1.length);
        id += 4;

        int typeSizeNum = Bytes.bytesToInt(temp1);
        this.typeSizes = new ArrayList<>();
        for (int i = 0; i < typeSizeNum; ++i){
            byte[] bs = new byte[4];
            System.arraycopy(bytes, id, bs, 0, 4);
            int b = Bytes.bytesToInt(bs);
            typeSizes.add(b);

            id += 4;
        }
    }

    public byte[] toBytes(){
        int len = names.size();
        /**
         * 0-3: how many columns
         * 4-*: total names of columns (stored in string_
         * *-*: total types of columns
         * *-*: index
         * *-*: can be null
         * *-*: type size
         */
        int total = COLUMNSIZE +
                len * (Database.STRINGSIZE + 4) +
                (4 + indexes.size() * INDEXSIZE) +
                (4 + this.canBeNull.size() * CANBENULLSIZE) +
                (4 + this.typeSizes.size() * TYPESIZE);
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

        // index
        byte[] temp1 = Bytes.intToBytes(this.indexes.size());
        System.arraycopy(temp1, 0, bytes, id, temp1.length);
        id += temp1.length;

        for(int i : this.indexes){
            byte[] bs = Bytes.intToBytes(i);
            System.arraycopy(bs, 0, bytes, id, bs.length);

            id += bs.length;
        }

        // can be null
        temp1 = Bytes.intToBytes(this.canBeNull.size());
        System.arraycopy(temp1, 0, bytes, id, temp1.length);
        id += temp1.length;

        for (boolean i : this.canBeNull){
            byte b = Bytes.booleanToByte(i);
            bytes[id] = b;

            id += 1;
        }

        // type size
        temp1 = Bytes.intToBytes(this.typeSizes.size());
        System.arraycopy(temp1, 0, bytes, id, temp1.length);
        id += temp1.length;

        for (Integer i : this.typeSizes){
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

    public ArrayList<String> getNames(){return names;}

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

    public Integer getTypeSize(int index){
        return this.typeSizes.get(index);
    }

    public int columns(){
        return this.names.size();
    }

    public int namePos(String name){
        return this.names.indexOf(name);
    }

    public String getType(String name){
        int pos = this.namePos(name);
        if(pos == -1){
            return null;
        }

        return this.type(pos);
    }

    public ArrayList<Integer> getIndexes(){
        return this.indexes;
    }

    public String primaryKey(){
        return this.name(this.indexes.get(0));
    }

    public int primaryKeyPos(){
        return this.indexes.get(0);
    }

    public boolean hasAttribute(String att){
        return this.names.contains(att);
    }

    public boolean hasAttributes(ArrayList<String> atts){
        if(atts.size() == 1 && atts.get(0).equals("*")){
            return true;
        }

        for(String att : atts){
            if(!this.names.contains(att)){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> attributesPos(ArrayList<String> atts){
        ArrayList<Integer> list = new ArrayList<>();
        if(atts.size() == 1 && atts.get(0).equals("*")){
            for (int i = 0; i < this.columns(); ++i){
                list.add(i);
            }
        }
        else {
            for (String att : atts){
                int pos = this.namePos(att);
                list.add(pos);
            }
        }

        return list;
    }

    public ArrayList<Boolean> getCanBeNull(){
        return this.canBeNull;
    }

    public Boolean canBeNull(int pos){
        return this.canBeNull.get(pos);
    }

    public String out(ArrayList<Integer> positions){
        StringBuilder s = new StringBuilder();
        for (int position : positions){
            s.append("\t|\t");
            s.append(this.names.get(position));
        }
        s.append("\t|\n");
        return s.toString();
    }

    public String show(){
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < this.columns(); ++i){
            s.append("\t|\t");
            s.append(this.names.get(i));
            if(this.types.get(i).equals("String")) {
                s.append(":(").append(this.types.get(i)).append(" ").append(this.typeSizes.get(i)).append(")");
            }
            else {
                s.append(":(").append(this.types.get(i)).append(")");
            }
            int id = this.indexes.indexOf(i);
            if(id == 0){
                s.append("(*)");
            }
            else if(id != -1){
                s.append("(+)");
            }

            if(!this.canBeNull.get(i)){
                s.append("-- not null");
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
