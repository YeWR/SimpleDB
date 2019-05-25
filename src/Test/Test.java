package Test;

import BplusTree.*;
import Database.*;
import Utils.Bytes;

public class Test {
    static public void main(String[] str){
        Database db = new Database("testDB", 2048, 20);
        String[] names = new String[4];
        String[] types = new String[4];
        String[] indexes = new String[1];
        Object[] data = new Object[4];
        Object[] data2 = new Object[4];

        for(int i = 0; i < names.length; ++i){
            names[i] = "attri" + String.valueOf(i);
            types[i] = "String";
            data[i] = String.valueOf(i);
            data2[i] = String.valueOf(i * 2);
        }

        indexes[0] = "attri0";

        db.createTable("table1", names, types, indexes);
        Table table = db.getTable("table1");
        System.out.println(table.toString());


        table.insert(data);
        table.insert(data2);
        Row row = table.select("attri0", data[0]);
        System.out.println(row);


//        BplusTree tree = new BplusTree("./data/testDB/table1.db", 1024);
//        int rootID = tree.getRoot();
//        for (int i = 1; i < 160; ++i) {
//            tree.insert(i, i);
//        }
//        System.out.println(BplusTree.getOrder());
//        LeafNode ans = tree.get(6, rootID);
//        System.out.println(ans.get(1));
    }
}