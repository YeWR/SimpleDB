package Parser;

import Database.Database;
import Database.Table;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;

public class SDBVisitor extends SQLiteBaseVisitor {

    private HashMap<String, Database> maps;
    private Database db;

    public SDBVisitor(){
        super();
        this.maps = new HashMap<String, Database>();
    }

    public void setDatabase(String dbName) {
        // check db exist
        if(!Database.existDB(dbName)){
            System.out.println("DB " + dbName + " not exists!");
        }

        if(this.maps.containsKey(dbName)){
            this.db = this.maps.get(dbName);
        }
        else {
            db = new Database(dbName, 2048, 20);
            maps.put(dbName, db);
        }
    }

    public Object visitSql_stmt(SQLiteParser.Sql_stmtContext ctx){
        return visitChildren(ctx);
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

            // where
            // TODO: where
        }
        else if(type == 2){
            // TODO: join
        }



        return null;
    }

}
