package parse;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Map;
import java.util.Set;

public class SqlParseUtil {
    public static Map<String, Set<String>> getDataBaseTablenameAndOper(String sql) {
        SqlBaseLexer lexer = new SqlBaseLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        MySqlBaseBaseListener mySqlBaseBaseListener = new MySqlBaseBaseListener();

        walker.walk(mySqlBaseBaseListener, parser.statement());

        return mySqlBaseBaseListener.getDataBaseTablenameAndOper();
    }

    public static void main(String[] args) {
        Map<String, Set<String>> result = getDataBaseTablenameAndOper("SELECT * FROM t_user");
        for (Map.Entry<String, Set<String>> entry : result.entrySet()) {
            System.out.println("key = " + entry.getKey());
            System.out.println("---------------------------------------");
            System.out.println("value = " + entry.getValue());
        }
    }
}
