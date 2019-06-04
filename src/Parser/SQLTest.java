package Parser;


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
        String dropTable = "DROP TABLE tableName;";
        String showTable = "SHOW TABLE tableName;";
        String select1 = "SELECT  attrName1, attrName2 FROM  tableName WHERE attrName1 = '';";
        String select2 = "SELECT tableName1.AttrName1, tableName1.AttrName2 tableName2.AttrName1, tableName2.AttrName2 FROM tableName1 JOIN tableName2 ON tableName1.attrName1 = tableName2.attrName2 WHERE  attrName1 = attrValue;";
        String insert1 = "INSERT INTO person VALUES ('Bob', 15)";
        String insert2 = "INSERT INTO person(name) VALUES ('Bob');";
        String delete = "DELETE FROM tableName WHERE attrName = attValue;";
        String update = "UPDATE  tableName  SET  attrName = attrValue  WHERE  attrName = attrValue;";


        String code = createDB + useDB + createTable1 + insert1;
        SQLiteLexer lexer = new SQLiteLexer(new ANTLRInputStream(code));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SQLiteParser parser = new SQLiteParser(tokenStream);
        SDBVisitor visitor = new SDBVisitor();
        visitor.visit(parser.parse());
    }
}
