package Database;

import java.util.ArrayList;

public class Table{
    /**
     * @param TYPE_SIZE: type的存储byte大小
     * =========================================
     */
    private Database db;
    private Schema schema;
    private String name;

    public Table(Database db, String name, Schema schema){
        this.db = db;
        this.schema = schema;
        this.name = name;
    }



    /**
     * TODO:
     * @return the column number of the table
     */
    public int column(){
        return 1;
    }

    /**
     * TODO:
     * @return the types of the schema
     */
    public ArrayList<String> types(){
        return schema.getTypes();
    }
}
