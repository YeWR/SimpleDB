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

    public Row(Object[] objects){
        this.table = null;

        data = objects.clone();
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

    public void update(ArrayList<Integer> positions, ArrayList<Object> values){
        assert positions.size() == values.size();

        for(int i = 0; i < positions.size(); ++i){
            data[positions.get(i)] = values.get(i);
        }
    }

    public Object[] getData(){
        return this.data;
    }

    public Object getData(int position){
        return this.data[position];
    }

    public int column(){
        return this.data.length;
    }

    public String out(ArrayList<Integer> positions){
        StringBuilder s = new StringBuilder();
        for (int position : positions){
            s.append("\t|\t");
            s.append(this.data[position].toString());
        }
        s.append("\t|\n");
        return s.toString();
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for (Object aData : this.data) {
            s.append("\t|\t");
            s.append(aData.toString());
        }
        s.append("\t|\n");
        return s.toString();
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

    public static String out(ArrayList<Row> rows, ArrayList<Integer> positions){
        StringBuilder s = new StringBuilder();
        if(rows != null) {
            for (Row row : rows) {
                s.append(row.out(positions));
            }
        }

        return s.toString();
    }

    public static String out(Row[] rows, ArrayList<Integer> positions){
        StringBuilder s = new StringBuilder();
        if(rows != null) {
            for (Row row : rows) {
                s.append(row.out(positions));
            }
        }

        return s.toString();
    }
}
