package Test;

import Utils.Bytes;

public class BytesTest {
    public static void main(String[] args){
        Object[] objects = new Object[3];
        objects[0] = null;
        objects[1] = 1;
        objects[2] = "12";

        String[] types = new String[3];
        types[0] = "Int";
        types[1] = "Int";
        types[2] = "String";

        byte[] bytes = Bytes.objectsToBytes(objects, types);

    }
}
