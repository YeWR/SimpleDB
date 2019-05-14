package Database;

public class Schema {
    /**
     * for a table
     */

    private String[] types;

    Schema(int column){
        types = new String[column];
    }


    public String[] getTypes(){
        return types;
    }
}
