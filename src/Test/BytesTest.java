package Test;

import Utils.Bytes;

public class BytesTest {
    public static void main(String[] args){
        Double d = 1.22;
        byte[] bytes = Bytes.doubleToBytes(d);
        Double dd = Bytes.bytesToDouble(bytes);
        System.out.println(dd);
    }
}
