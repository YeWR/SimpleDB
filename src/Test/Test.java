package Test;

import Utils.Bytes;

public class Test {
    static public void main(String[] str){
        byte[] b1 = Bytes.intToBytes(1);
        byte[] b2 = new byte[0];
        byte[] b3 = Bytes.combineBytes(b1, b2);
        System.out.println(Bytes.bytesToInt(b3));


    }
}

class A{
    static public int a = 0;
}

class B extends A{
}