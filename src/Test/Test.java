package Test;

import Database.*;
import Utils.Bytes;

public class Test {
    static public void main(String[] str){
        Database db = new Database("testDB", 2048);
//        String[] names = new String[4];
//        String[] types = new String[4];
//
//        for(int i = 0; i < names.length; ++i){
//            names[i] = "attri" + String.valueOf(i);
//            types[i] = "Int";
//        }
//
//        db.createTable("table1", names, types);
        Table table = db.getTable("table1");
        System.out.println(table.toString());
    }
}