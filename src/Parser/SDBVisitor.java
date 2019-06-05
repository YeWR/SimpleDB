package Parser;

import Database.*;
import Utils.Utils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.ArrayList;
import java.util.HashMap;

public class SDBVisitor extends SQLiteBaseVisitor {

    private final static int BLOCKSIZE = 2048;
    private final static int INFOSIZE = 20;
    private HashMap<String, Database> maps;
    private Database db;

    public SDBVisitor(){
        super();
        this.maps = new HashMap<String, Database>();
    }

    public Database getDatabase(String dbName){
        if(this.maps.containsKey(dbName)){
            return this.maps.get(dbName);
        }
        else {
            return new Database(dbName, BLOCKSIZE, INFOSIZE);
        }
    }

    public void setDatabase(String dbName) {
        // check db exist
        if(!Database.existDB(dbName)){
            System.out.println("DB " + dbName + " not exists!");
            return;
        }

        if(this.maps.containsKey(dbName)){
            this.db = this.maps.get(dbName);
        }
        else {
            this.db = new Database(dbName, BLOCKSIZE, INFOSIZE);
            maps.put(dbName, db);
        }
    }

    /*
     * create database
     */
    public Object visitCreate_database_stmt(SQLiteParser.Create_database_stmtContext ctx) {
        ParseTree dbNode = ctx.getChild(2);
        if(Database.existDB(dbNode.getText())){
            System.out.println("DB exists!");
            return null;
        }
        Database db = new Database(dbNode.getText(), BLOCKSIZE, INFOSIZE);
        this.maps.put(dbNode.getText(), db);

        return null;
    }

    /*
     * use database
     */
    public Object visitUse_database_stmt(SQLiteParser.Use_database_stmtContext ctx) {
        ParseTree dbNode = ctx.getChild(2);
        this.setDatabase(dbNode.getText());
        return null;
    }

    /*
     * drop database
     */
    public Object visitDrop_database_stmt(SQLiteParser.Drop_database_stmtContext ctx){
        ParseTree dbNode = ctx.getChild(2);
        String dbName = dbNode.getText();
        if(this.maps.containsKey(dbName)){
            if(this.db.getName().equals(dbName)){
                this.db = null;
            }
            Database db = this.maps.remove(dbName);
            db.deleteDB();
        }
        else {
            Database db = new Database(dbName, BLOCKSIZE, INFOSIZE);
            db.deleteDB();
        }
        return null;
    }

    /*
     * show database
     */
    public Object visitShow_databases_stmt(SQLiteParser.Show_databases_stmtContext ctx) {
        String cnt = Database.showAllDB();
        out(cnt);
        return null;
    }

    public Object visitShow_database_stmt(SQLiteParser.Show_database_stmtContext ctx){
        ParseTree dbNode = ctx.getChild(2);
        Database db = getDatabase(dbNode.getText());

        String cnt = db.showTables();
        out(cnt);
        return null;
    }

    /*
     * create table
     */
    public Object visitCreate_table_stmt(SQLiteParser.Create_table_stmtContext ctx){
        if(this.db == null){
            System.out.println("database not set!");
            return null;
        }

        String tableName = ctx.getChild(2).getText();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> types = new ArrayList<>();
        ArrayList<String> indexes = new ArrayList<>();

        for (ParseTree tree : ctx.children){
            if(tree.getClass() == SQLiteParser.Column_defContext.class){
                ColumnType columnType = (ColumnType) visit(tree);
                // not primary key
                if(columnType.kind != 2){
                    names.add(columnType.name);
                    types.add(Database.classToType(columnType.type));
                }
                else {
                    indexes.add(columnType.name);
                }

            }
        }
        if(indexes.size() == 0){
            //TODO: not same
            String primaryKey = tableName + "_ID";
            String primaryType = "Int";
            names.add(0, primaryKey);
            types.add(0, primaryType);
            indexes.add(0, primaryKey);
        }
        this.db.createTable(tableName, Utils.toStrings(names), Utils.toStrings(types), Utils.toStrings(indexes));

        return null;
    }

    public Object visitColumn_def(SQLiteParser.Column_defContext ctx){
        String name = ctx.getChild(0).getText();
        ColumnType type = (ColumnType) visitChildren(ctx);
        if(type.kind == 2 && name.toLowerCase().equals("primary")){
            //
        }
        else {
            type.name = name;
        }

        return type;
    }

    public Object visitType_name(SQLiteParser.Type_nameContext ctx){
        String type = ctx.getChild(0).getText();
        int number = -1;
        ParseTree nc1 = null, nc2 = null;

        for (int i = 1; i < ctx.children.size(); ++i){
            ParseTree child = ctx.getChild(i);
            if(child.getClass() == SQLiteParser.Signed_numberContext.class){
                number = Integer.valueOf(child.getText());
            }
            else if(child.getClass() == SQLiteParser.NameContext.class){
                if(nc1 == null){
                    nc1 = child;
                }
                else if(nc2 == null){
                    nc2 = child;
                }
            }
        }

        ColumnType res = new ColumnType();
        res.type = ColumnType.toType(type);
        res.len = number;

        // normal
        if(nc1 == null && nc2 == null){
            res.kind = 0;
        }
        // not null
        else if(nc1.getText().toLowerCase().equals("not") && nc2.getText().toLowerCase().equals("null")) {
            res.kind = 1;
        }
        else if(type.toLowerCase().equals("key")){
            res.type = null;
            res.kind = 2;
            res.name = nc1.getText().split("\\(|\\)")[1];
        }

        return res;
    }

    /*
     * drop table
     */
    public Object visitDrop_table_stmt(SQLiteParser.Drop_table_stmtContext ctx){
        if(this.db == null){
            System.out.println("database not set!");
            return null;
        }

        String tableName = ctx.getChild(2).getText();
        this.db.deleteTable(tableName);

        return null;
    }

    /*
     * show table
     */
    public Object visitShow_table_stmt(SQLiteParser.Show_table_stmtContext ctx){
        if(this.db == null){
            System.out.println("database not set!");
            return null;
        }

        String tableName = ctx.getChild(2).getText();
        out(this.db.getTable(tableName).show());
        System.out.println(this.db.getTable(tableName));

        return null;
    }

    /*
     * select
     */
    public Object visitSelect_core(SQLiteParser.Select_coreContext ctx){
        if(this.db == null){
            System.out.println("database not set!");
            return null;
        }

        ArrayList<ParseTree> attributesNode = new ArrayList<>();
        ParseTree tableNode = null;
        ParseTree whereExpr = null;
        int type = 0;

        // get the attributes
        for (int i = 1; i < ctx.getChildCount(); ++i){
            ParseTree child = ctx.getChild(i);
            if(child.getClass() == SQLiteParser.Result_columnContext.class){
                attributesNode.add(child);
            }
            else if(child.getClass() == SQLiteParser.Table_or_subqueryContext.class){
                tableNode = child;
                type = 1;
            }
            else if(child.getClass() == SQLiteParser.Join_clauseContext.class){
                tableNode = child;
                type = 2;
            }
            else if(child.getClass() == SQLiteParser.ExprContext.class){
                whereExpr = child;
            }
        }

        // only table
        if(type == 1){
            // check table exist
            if(!this.db.tableIsExist(tableNode.getText())){
                System.out.println("table " + tableNode.getText() + " not exists!");
                // TODO: process
                return null;
            }
            Table table = this.db.getTable(tableNode.getText());

            ArrayList<String> atts = new ArrayList<>();
            for (ParseTree p : attributesNode){
                atts.add(p.getText());
            }

            // check atts
            if(!table.hasAttributes(atts)){
                System.out.println("atts not exist!");
                // TODO: process
                return null;
            }

            ArrayList<Integer> attsPos = table.attributesPos(atts);

            // where
            String att = whereExpr.getChild(0).getText();
            String relation = whereExpr.getChild(1).getText();
            String value = whereExpr.getChild(2).getText();
            if(value.charAt(0) == '\''){
                value = value.substring(1, value.length() - 1);
            }
            Object cnt = Utils.stringToObject(value, table.getType(att));

            ArrayList<Row> rows = table.select(att, relation, cnt);
            this.out(table.out(attsPos) + Row.out(rows, attsPos));
        }
        else if(type == 2){
            // TODO: join
        }



        return null;
    }

    public void out(String string){
        // TODO: server + cline
        System.out.println(string);
    }

    /*
     * insert
     */
    public Object visitInsert_stmt(SQLiteParser.Insert_stmtContext ctx){
        if(this.db == null){
            System.out.println("database not set!");
            return null;
        }
        String tableName = ctx.getChild(2).getText();

        // check table exist
        if(!this.db.tableIsExist(tableName)){
            System.out.println("table " + tableName + " not exists!");
            // TODO: process
            return null;
        }
        Table table = this.db.getTable(tableName);
        String[] types = table.types();

        // insert into table values (...)
        if(ctx.getChild(3).getText().toLowerCase().equals("values")){
            int index = 0;
            ArrayList<Object> values = new ArrayList<>();
            for (int i = 4; i < ctx.children.size(); ++i){
                ParseTree child = ctx.getChild(i);
                if(child.getClass() == SQLiteParser.ExprContext.class){
                    String text = child.getText();
                    if(text.charAt(0) == '\''){
                        text = text.substring(1, text.length() - 1);
                    }
                    Object cnt = Utils.stringToObject(text, types[index]);
                    values.add(cnt);

                    index += 1;
                }
            }

            // TODO: null
            for (int i = index; i < types.length; ++i){
                Object cnt = Utils.stringToObject(null, types[i]);
            }

            // insert
            table.insert(values.toArray());
        }
        // insert into table(attris...) values (...)
        else{
            int index = 0;
            ArrayList<String> atts = new ArrayList<>();
            ArrayList<Object> values = new ArrayList<>();

            for (int i = 4; i < ctx.children.size(); ++i){
                ParseTree child = ctx.getChild(i);
                if(child.getClass() == SQLiteParser.Column_nameContext.class){
                    atts.add(child.getText());
                }
                else if(child.getClass() == SQLiteParser.ExprContext.class){
                    String text = child.getText();
                    if(text.charAt(0) == '\''){
                        text = text.substring(1, text.length() - 1);
                    }

                    Object cnt = Utils.stringToObject(text, table.getType(atts.get(index)));
                    values.add(cnt);

                    index += 1;
                }
            }

            // insert
            table.insert(atts, values);
        }

        return null;
    }

    /*
     * delete
     */
    public Object visitDelete_stmt(SQLiteParser.Delete_stmtContext ctx){
        if(this.db == null){
            System.out.println("database not set!");
            return null;
        }
        String tableName = ctx.getChild(2).getText();

        // check table exist
        if(!this.db.tableIsExist(tableName)){
            System.out.println("table " + tableName + " not exists!");
            // TODO: process
            return null;
        }
        Table table = this.db.getTable(tableName);

        boolean hasWhere = false;
        String att = null, relation = null, value = null;
        Object cnt = null;
        for (int i = 3; i < ctx.children.size(); ++i){
            ParseTree tree = ctx.getChild(i);
            if(tree.getClass() == TerminalNodeImpl.class && tree.getText().toLowerCase().equals("where")){
                hasWhere = true;
            }
            else if(tree.getClass() == SQLiteParser.ExprContext.class) {
                att = tree.getChild(0).getText();
                relation = tree.getChild(1).getText();
                value = tree.getChild(2).getText();
                if(value.charAt(0) == '\''){
                    value = value.substring(1, value.length() - 1);
                }
                cnt = Utils.stringToObject(value, table.getType(att));
            }
        }

        // has where
        if(hasWhere) {
            table.delete(att, relation, cnt);
        }
        else {
            table.deleteAll();
        }

        return null;
    }

    /*
     * update
     */
    public Object visitUpdate_stmt(SQLiteParser.Update_stmtContext ctx){
        if(this.db == null){
            System.out.println("database not set!");
            return null;
        }
        String tableName = ctx.getChild(1).getText();

        // check table exist
        if(!this.db.tableIsExist(tableName)){
            System.out.println("table " + tableName + " not exists!");
            // TODO: process
            return null;
        }
        Table table = this.db.getTable(tableName);

        ArrayList<String> atts = new ArrayList<>();
        ArrayList<Object> values = new ArrayList<>();
        // where
        String att = null, relation = null, value = null;
        Object cnt = null;
        boolean afterWhere = false;
        int index = 0;

        for (int i = 3; i < ctx.children.size(); ++i){
            ParseTree tree = ctx.getChild(i);
            if(tree.getClass() == TerminalNodeImpl.class && tree.getText().toLowerCase().equals("where")){
                afterWhere = true;
            }

            if(afterWhere){
                if(tree.getClass() == SQLiteParser.ExprContext.class){
                    att = tree.getChild(0).getText();
                    relation = tree.getChild(1).getText();
                    value = tree.getChild(2).getText();
                    if(value.charAt(0) == '\''){
                        value = value.substring(1, value.length() - 1);
                    }
                    cnt = Utils.stringToObject(value, table.getType(att));
                }
            }
            else {
                if(tree.getClass() == SQLiteParser.Column_nameContext.class){
                    atts.add(tree.getText());

                }
                else if(tree.getClass() == SQLiteParser.ExprContext.class){
                    String temp = tree.getText();
                    if(temp.charAt(0) == '\''){
                        temp = temp.substring(1, temp.length() - 1);
                    }
                    values.add(Utils.stringToObject(temp, table.getType(atts.get(index))));

                    index += 1;
                }
            }
        }
        // update
        table.update(atts, values, att, relation, cnt);

        return null;
    }


}

class ColumnType{
    /**
     * kind:
     * 0 -> normal
     * 1 -> not null
     * 2 -> key id
     */
    public String name;
    public int kind;
    public Class type;
    public int len;

    static Class toType(String str){
        String s = str.toLowerCase();
        switch (s){
            case "string":
                return String.class;
            case "int":
                return Integer.class;
            case "float":
                return Float.class;
            case "double":
                return Double.class;
            case "long":
                return Long.class;
            default:
                return null;
        }
    }
}
