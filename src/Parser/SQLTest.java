package Parser;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class SQLTest {
    public static void main(String[] args) throws IOException {
        String code = "SELECT  attrName1, attrName2 FROM  tableName WHERE attrName1 = \"\";";
        SQLiteLexer lexer = new SQLiteLexer(new ANTLRInputStream(code));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SQLiteParser parser = new SQLiteParser(tokenStream);
        SDBVisitor visitor = new SDBVisitor();
        visitor.setDatabase("testDB");
        visitor.visit(parser.parse());
    }
}
