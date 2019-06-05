package Database;

import Utils.*;

import java.util.ArrayList;

public class Row {
    /**
     * abstract row in a table
     */

    private Table table;
    private RowDisk rowDisk;
    private int position;
    private Object[] data;

    /**
     * create a row
     * @param table
     * @param position
     */
    public Row(Table table, int position, RowDisk rowDisk){
        this.table = table;
        this.position = position;
        this.rowDisk = rowDisk;
        this.data = out();
    }

    private Object[] out(){
        byte[] bytes = rowDisk.read(position);
        int num = table.column();

        Object[] row = new Object[num];
        String[] types = table.types();

        int index = 0;
        for (int i = 0; i < num; ++i){
            int typeSize = Database.getTypeSize(types[i]);
            byte[] bs = new byte[typeSize];
            System.arraycopy(bytes, index, bs, 0, typeSize);

            index += typeSize;
            row[i] = Utils.byteToObject(bs, types[i]);
        }
        rowDisk.close();
        return row;
    }

    public boolean compare(int pos, SqlCompare sqlCompare){
        Object o1 = this.data[pos];
        return sqlCompare.compare(o1);
    }

    public String toString(){
        String s = new String();
        for (int i = 0; i < this.data.length; ++i){
            s += "\t|\t";
            s += this.data[i].toString();
        }
        s += "\t|\n";
        return s;
    }

    public static String toStrings(Row[] rows){
        StringBuilder s = new StringBuilder();
        if(rows != null) {
            for (Row row : rows) {
                s.append(row.toString());
            }
        }

        return s.toString();
    }

    public static String toStrings(ArrayList<Row> rows){
        StringBuilder s = new StringBuilder();
        if(rows != null) {
            for (Row row : rows) {
                s.append(row.toString());
            }
        }

        return s.toString();
    }
}
