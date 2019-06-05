package Test;


import Parser.SDBVisitor;
import Parser.SQLiteLexer;
import Parser.SQLiteParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class SQLTest {
    public static void main(String[] args) throws IOException {
        String createDB = "Create database testDB;";
        String useDB = "Use database testDB;";  // over
        String dropDB = "Drop database testDB"; // over
        String showAllDB = "Show databases;";   // over
        String showDB = "Show database testDB";

        String createTable1 = "CREATE TABLE person (name String(256), ID Int not null, PRIMARY KEY(ID));";
        String createTable2 = "CREATE TABLE tableName(attrName1 String, attrName2 Long, attrNameN Int NOT NULL);";
        String dropTable = "DROP TABLE person;";
        String showTable = "SHOW TABLE person;";
        String select1 = "SELECT  name, ID FROM person WHERE name = 'Ted';";
        String select2 = "SELECT tableName1.AttrName1, tableName1.AttrName2 tableName2.AttrName1, tableName2.AttrName2 FROM tableName1 JOIN tableName2 ON tableName1.attrName1 = tableName2.attrName2 WHERE  attrName1 = attrValue;";
        String insert1 = "INSERT INTO person VALUES ('Bob', 15)";
        String insert2 = "INSERT INTO person(name, ID) VALUES ('Tom', 13);";
        String insert3 = "INSERT INTO person(name, ID) VALUES ('Ted', 14);";
        String delete = "DELETE FROM person WHERE name = Tom;";
        String delete3 = "DELETE FROM person WHERE name = Bob;";
        String delete1 = "DELETE FROM person WHERE ID = 15;";
        String delete2 = "DELETE FROM person WHERE ID = 13;";
        String deleteAll = "DELETE FROM person;";
        String update = "UPDATE  person  SET  name = gg  WHERE  ID = 13;";


//        String code = createDB + useDB + dropTable + createTable1 + insert1 + insert2 + insert3 + showTable;
        String code = createDB + useDB + showTable;
        SQLiteLexer lexer = new SQLiteLexer(new ANTLRInputStream(code));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SQLiteParser parser = new SQLiteParser(tokenStream);
        SDBVisitor visitor = new SDBVisitor();
        visitor.visit(parser.parse());
    }
}
