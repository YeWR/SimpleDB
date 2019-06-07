package Parser;

import Database.*;
import GUI.Server;
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
    private Server server;

    public SDBVisitor(Server server){
        super();
        this.maps = new HashMap<String, Database>();
        this.server = server;
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
            out("DB " + dbName + " not exists!");
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
            out("DB exists!");
            return null;
        }

        Database db = new Database(dbNode.getText().toLowerCase(), BLOCKSIZE, INFOSIZE);
        this.maps.put(dbNode.getText(), db);

        out("create database " + db.getName() + " over!");
        return null;
    }

    /*
     * use database
     */
    public Object visitUse_database_stmt(SQLiteParser.Use_database_stmtContext ctx) {
        ParseTree dbNode = ctx.getChild(2);
        this.setDatabase(dbNode.getText().toLowerCase());

        out("Database " + this.db.getName() + " is in use.");
        return null;
    }

    /*
     * drop database
     */
    public Object visitDrop_database_stmt(SQLiteParser.Drop_database_stmtContext ctx){
        ParseTree dbNode = ctx.getChild(2);
        String dbName = dbNode.getText().toLowerCase();
        if(!Database.existDB(dbName)){
            out("DB " + dbName + " not exist!");
            return null;
        }

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

        out("drop database " + dbName + " over!");
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
            out("database not set!");
            return null;
        }
        String tableName = ctx.getChild(2).getText().toLowerCase();

        if(this.db.tableIsExist(tableName)){
            out("Table " + tableName + " exists");
            return null;
        }

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> types = new ArrayList<>();
        ArrayList<String> indexes = new ArrayList<>();
        ArrayList<String> notNullAtts = new ArrayList<>();

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

                if(columnType.kind != 0){
                    notNullAtts.add(columnType.name);
                }
            }
        }
        if(indexes.size() == 0){
            String primaryKey = tableName + "_ID";
            String primaryType = "Int";
            names.add(0, primaryKey);
            types.add(0, primaryType);
            indexes.add(0, primaryKey);
        }
        this.db.createTable(tableName, Utils.toStrings(names), Utils.toStrings(types), Utils.toStrings(indexes), Utils.toStrings(notNullAtts));

        out("Table " + tableName + " is created over!");
        return null;
    }

    public Object visitColumn_def(SQLiteParser.Column_defContext ctx){
        String name = ctx.getChild(0).getText().toLowerCase();
        ColumnType type = null;

        for (int i = 1; i < ctx.children.size(); ++i){
            ParseTree child = ctx.getChild(i);
            if(child.getClass() == SQLiteParser.Type_nameContext.class){
                type = (ColumnType) visit(child);
            }
            else if(child.getClass() == SQLiteParser.Column_constraintContext.class){
                if(child.getText().toLowerCase().equals("notnull")){
                    type.kind = 1;
                }
            }
        }

        if(type.kind == 2 && name.equals("primary")){
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
            res.name = nc1.getText().split("\\(|\\)")[1].toLowerCase();
        }

        return res;
    }

    /*
     * drop table
     */
    public Object visitDrop_table_stmt(SQLiteParser.Drop_table_stmtContext ctx){
        if(this.db == null){
            out("database not set!");
            return null;
        }

        String tableName = ctx.getChild(2).getText();
        this.db.deleteTable(tableName);

        out("Drop table " + tableName + " over!");
        return null;
    }

    /*
     * show table
     */
    public Object visitShow_table_stmt(SQLiteParser.Show_table_stmtContext ctx){
        if(this.db == null){
            out("database not set!");
            return null;
        }

        String tableName = ctx.getChild(2).getText();
        out(this.db.getTable(tableName).show());
        return null;
    }

    /*
     * select
     */
    public Object visitSelect_core(SQLiteParser.Select_coreContext ctx){
        if(this.db == null){
            out("database not set!");
            return null;
        }

        ArrayList<ParseTree> attributesNode = new ArrayList<>();
        JoinContent joinContent = null;
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
                joinContent = (JoinContent) visit(child);
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
                out("table " + tableNode.getText() + " not exists!");
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
                out("atts not exist!");
                // TODO: process
                return null;
            }

            ArrayList<Integer> attsPos = table.attributesPos(atts);

            // where
            if(whereExpr != null){
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
            // select all
            else {
                Row[] rows = table.selectAll();
                this.out(table.out(attsPos) + Row.out(rows, attsPos));
            }
        }
        else if(type == 2){
            String tableName1 = joinContent.tableName1;
            String tableName2 = joinContent.tableName2;

            // check table exist
            if(!this.db.tableIsExist(tableName1)){
                out("table " + tableName1 + " not exists!");
                return null;
            }
            Table table1 = this.db.getTable(tableName1);

            if(!this.db.tableIsExist(tableName2)){
                out("table " + tableName2 + " not exists!");
                return null;
            }
            Table table2 = this.db.getTable(tableName2);

            ArrayList<String> atts = new ArrayList<>();
            for (ParseTree p : attributesNode){
                atts.add(p.getText());
            }

            // check
            for (String att : atts){
                String[] res = att.split("\\.");
                boolean hasAtt = this.db.hasAttributeInTable(res[0], res[1]);
                if(!hasAtt){
                    out("Table " + res[0] + " has no attribute named " + res[1] + " !");
                    return null;
                }
            }

            View view = new View(table1, table2);

            ArrayList<Integer> attsPos = view.getPositions(atts);
            JoinConstraint constraint = joinContent.constraint;

            String att = null, relation = null, value = null;
            Object cnt = null;
            if(whereExpr != null ){
                att = whereExpr.getChild(0).getText();
                relation = whereExpr.getChild(1).getText();
                value = whereExpr.getChild(2).getText();
                if(value.charAt(0) == '\''){
                    value = value.substring(1, value.length() - 1);
                }

                cnt = Utils.stringToObject(value, view.getType(att));
            }
            ArrayList<Row> rows = view.select(constraint.pattern1, constraint.relation, constraint.pattern2, att, relation, cnt);

            this.out(view.out(attsPos) + Row.out(rows, attsPos));
        }

        return null;
    }

    public Object visitJoin_clause(SQLiteParser.Join_clauseContext ctx){
        JoinContent content = new JoinContent();

        String table1 = null;
        String table2 = null;
        for (ParseTree child : ctx.children){
            if(child.getClass() == SQLiteParser.Table_or_subqueryContext.class){
                if(table1 == null){
                    table1 = child.getText();
                }
                else {
                    table2 = child.getText();
                }
            }
            else if(child.getClass() == SQLiteParser.Join_constraintContext.class){
                JoinConstraint constraint = (JoinConstraint) visit(child);
                content.constraint = constraint;
            }
        }

        content.tableName1 = table1;
        content.tableName2 = table2;

        return content;
    }

    public Object visitJoin_constraint(SQLiteParser.Join_constraintContext ctx){
        ParseTree expr = ctx.getChild(1);
        JoinConstraint constraint = new JoinConstraint();

        constraint.pattern1 = expr.getChild(0).getText();
        constraint.relation = expr.getChild(1).getText();
        constraint.pattern2 = expr.getChild(2).getText();

        return constraint;
    }

    public void out(String string){
        if(this.server != null){
            this.server.sendMsg(string);
        }
        else {
            out(string);
        }
    }

    /*
     * insert
     */
    public Object visitInsert_stmt(SQLiteParser.Insert_stmtContext ctx){
        if(this.db == null){
            out("database not set!");
            return null;
        }
        String tableName = ctx.getChild(2).getText();

        // check table exist
        if(!this.db.tableIsExist(tableName)){
            out("table " + tableName + " not exists!");
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

            for (int i = index; i < types.length; ++i){
                Object cnt = Utils.stringToObject(null, types[i]);
            }

            // insert
            boolean ok = table.insert(values.toArray());
            if(ok){
                this.out("insert over!");
            }
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
            boolean ok = table.insert(atts, values);
            if(ok){
                this.out("insert over!");
            }
        }

        return null;
    }

    /*
     * delete
     */
    public Object visitDelete_stmt(SQLiteParser.Delete_stmtContext ctx){
        if(this.db == null){
            out("database not set!");
            return null;
        }
        String tableName = ctx.getChild(2).getText();

        // check table exist
        if(!this.db.tableIsExist(tableName)){
            out("table " + tableName + " not exists!");
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
            int num = table.delete(att, relation, cnt);
            out(num + " rows deleted!");
        }
        else {
            table.deleteAll();
            out("All deleted!");
        }

        return null;
    }

    /*
     * update
     */
    public Object visitUpdate_stmt(SQLiteParser.Update_stmtContext ctx){
        if(this.db == null){
            out("database not set!");
            return null;
        }
        String tableName = ctx.getChild(1).getText();

        // check table exist
        if(!this.db.tableIsExist(tableName)){
            out("table " + tableName + " not exists!");
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
        int num = table.update(atts, values, att, relation, cnt);
        out(num + " rows updated!");

        return null;
    }


}

class JoinContent{
    public String tableName1;
    public String tableName2;

    public JoinConstraint constraint;
}

class JoinConstraint{
    public String pattern1;
    public String relation;
    public String pattern2;
}

class ColumnType{
    /**
     * kind:
     * 0 -> normal
     * 1 -> not null
     * 2 -> primary key
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
