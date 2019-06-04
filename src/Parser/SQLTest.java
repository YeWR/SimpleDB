package Parser;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class SQLTest {
    public static void main(String[] args) throws IOException {
        String createDB = "Create database testDB;";
        String useDB = "Use database testDB;";
        String dropDB = "Drop database testDB";
        String showAllDB = "Show databases;";
        String showDB = "Show database testDB";
        String select = "SELECT  attrName1, attrName2 FROM  tableName WHERE attrName1 = \"\";";


        String code = createDB + showDB;
        SQLiteLexer lexer = new SQLiteLexer(new ANTLRInputStream(code));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SQLiteParser parser = new SQLiteParser(tokenStream);
        SDBVisitor visitor = new SDBVisitor();
        visitor.visit(parser.parse());
    }
}
