package Database;

import Utils.Utils;

public class Row {
    /**
     * abstract row in a table
     */
    private static int BLOCK_SIZE = 4096, INFO_SIZE = 12;
    private int column;
    private String fileName;

    private Table table;
    private RowDisk rowDisk;
    private int index;
    private int position;

    public Row(Table table){
        this.table = table;
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
        return row;
    }

    private void setPosition(){

    }
}
