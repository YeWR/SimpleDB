package Database;

import Utils.SqlCompare;
import Utils.Utils;

import java.util.ArrayList;

public class View {
    /**
     * temp table (for join on)
     */
    private Database db;
    private Schema schema;
    private Table table1;
    private Table table2;

    public View(Table table1, Table table2){
        assert table1 != null;
        assert table2 != null;
        assert table1.getDbName().equals(table2.getDbName());

        this.table1 = table1;
        this.table2 = table2;
        this.db = table1.getDb();

        this.init();
    }

    private void init(){
        this.initSchema();
    }

    private void initSchema(){
        String[] names = new String[table1.column() + table2.column()];
        String[] types = new String[table1.column() + table2.column()];
        Integer[] indexes = new Integer[table1.getIndexes().size() + table2.getIndexes().size()];

        ArrayList names1 = table1.getNames();
        ArrayList names2 = table2.getNames();

        ArrayList indexes1 = table1.getIndexes();
        ArrayList indexes2 = table2.getIndexes();

        for(int i = 0; i < names1.size(); ++i){
            names[i] = table1.getName() + "." + names1.get(i);
            types[i] = table1.getType(i);
        }

        for(int i = 0; i < names2.size(); ++i){
            names[i + names1.size()] = table2.getName() + "." + names2.get(i);
            types[i + names1.size()] = table2.getType(i);
        }

        for (int i = 0; i < indexes1.size(); ++i){
            indexes[i] = (Integer) indexes1.get(i);
        }

        for (int i = 0; i < indexes2.size(); ++i){
            indexes[i + indexes1.size()] = (Integer) indexes2.get(i);
        }

        this.schema = new Schema(names, types, indexes);
    }


    public ArrayList<Row> select(String pattern1, String relation, String pattern2, String att, String relationWhere, Object data){
        String att1, att2;

        String[] p1 = pattern1.split("\\.");
        String[] p2 = pattern2.split("\\.");

        if(p1[0].equals(table1.getName())){
            att1 = p1[1];
            assert p2[1].equals(table2.getName());

            att2 = p2[1];
        }
        else if(p1[0].equals(table2.getName())) {
            att1 = p2[1];
            assert p2[1].equals(table1.getName());

            att2 = p1[1];
        }
        else {
            System.out.println("condition of table(not found) error in join on");
            return null;
        }

        SqlCompare compare = null;
        if(att != null && relationWhere != null && data != null){
            compare = new SqlCompare(relationWhere, data, this.schema.getType(att));
        }

        ArrayList<Row> rows = new ArrayList<Row>();

        Row[] rows1 = table1.selectAll();
        if(rows1 == null || rows1.length == 0){
            return null;
        }
        else {
            for (Row row1 : rows1){
                int position = table1.namePos(att1);
                Object value = row1.getData(position);

                ArrayList<Row> rows2 = table2.select(att2, relation, value);
                for (Row row2 : rows2){
                    Object[] objects = Utils.combineObj(row1.getData(), row2.getData());
                    Row row = new Row(objects);

                    if(compare == null) {
                        rows.add(row);
                    }
                    else {
                        int pos = this.schema.namePos(att);
                        if(compare.compare(row.getData(pos))){
                            rows.add(row);
                        }
                    }
                }
            }
        }

        return rows;
    }

    public ArrayList<Integer> getPositions(ArrayList<String> attributes){
        return this.schema.attributesPos(attributes);
    }

    public String out(ArrayList<Integer> positions){
        return this.schema.out(positions);
    }

    public String getType(String name){
        return this.schema.getType(name);
    }
}
