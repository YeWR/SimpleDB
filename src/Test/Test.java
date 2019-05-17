package Test;

import Database.*;
import Utils.Bytes;

public class Test {
    static public void main(String[] str){
        Database db = new Database();
        String[] types = new String[2];
        types[0] = "Int";
        types[1] = "String";
        Table table = new Table(db,"test", types);


    }
}