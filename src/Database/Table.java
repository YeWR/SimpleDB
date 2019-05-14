package Database;

public class Table {

    public static final int INT = 1;
    public static final int LONG = 2;
    public static final int FLOAT = 3;
    public static final int DOUBLE = 4;
    public static final int STRING = 5;
    /**
     * =========================================
     */
    private static int TYPE_SIZE;

    private Schema schema;

    public static int getTypeSize(){
        return TYPE_SIZE;
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
    public String[] types(){
        return schema.getTypes();
    }
}
