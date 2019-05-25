package Test;

import BplusTree.*;
import Database.*;
import Utils.Bytes;

public class Test {

    static Table createTable(Database db, String tableName){
        String[] names = new String[4];
        String[] types = new String[4];
        String[] indexes = new String[1];
        Object[] data = new Object[4];
        Object[] data2 = new Object[4];

        for(int i = 0; i < data.length; ++i){
            names[i] = "attri" + String.valueOf(i);
            types[i] = "String";
            data[i] = String.valueOf(i);
            data2[i] = String.valueOf(i * 2);
        }
        indexes[0] = "attri0";


        Table table = db.createTable(tableName, names, types, indexes);
        table.insert(data);
        table.insert(data2);

        return table;
    }

    static void selectTest(Table table){
        Row row = table.select("attri0", "0");
        System.out.println(row);
    }

    static void deleteTest(Table table){
        table.delete("attri0", "0");
    }

    static public void main(String[] str){
        Database db = new Database("testDB", 2048, 20);//

//        Table table = createTest(db, "table1");
//        selectTest(table);
        Table table = db.getTable("table1");
        selectTest(table);
    }
}