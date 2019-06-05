package Test;


import Parser.SDBVisitor;
import Parser.SQLiteLexer;
import Parser.SQLiteParser;
import Utils.Utils;
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

        String createTable1 = "create table avengers\n" +
                "\t(id\t\t\tint not null, \n" +
                "\t name\t\t\tstring(32) not null, \n" +
                "\t power\tint not null,\n" +
                "\t weight     float,\n" +
                "\t primary key (ID)\n" +
                "\t);drop table avengers;" + "create table avengers\n" +
                "\t(id\t\t\tint not null, \n" +
                "\t name\t\t\tstring(32) not null, \n" +
                "\t power\tint not null,\n" +
                "\t weight     float,\n" +
                "\t height     double,\n" +
                "\t primary key (ID)\n" +
                "\t);";
        createTable1 = Utils.replaceBlank(createTable1);

        String createTable2 = "create table villain\n" +
                "\t(id\t\t\tint not null, \n" +
                "\t name\t\t\tstring(32) not null, \n" +
                "\t power\tint not null,\n" +
                "\t primary key (ID)\n" +
                "\t);";
        createTable2 = Utils.replaceBlank(createTable2);

        String showTable1 = "SHOW TABLE avengers;";
        String showTable2 = "SHOW TABLE villain;";

        String insert1 = "INSERT INTO avengers VALUES (10, 'Captain', 50, 78.1, 1.85);\n" +
                "INSERT INTO avengers VALUES (3, 'Thor', 90, 92.1, 1.89);\n" +
                "INSERT INTO avengers VALUES (7, 'IronMan', 85, 82.1, 1.76);\n" +
                "INSERT INTO avengers VALUES (4, 'rocket', 40, 42.1, 0.76);\n" +
                "INSERT INTO avengers VALUES (5, 'Groot', 10, 182.1, 2.76);";
        insert1 = Utils.replaceBlank(insert1);

        String insert2 = "INSERT INTO villain VALUES (1, 'Thanos', 100);\n" +
                "INSERT INTO villain VALUES (2, 'Red Skull', 40);\n" +
                "INSERT INTO villain VALUES (3, 'Hella', 90);\n" +
                "INSERT INTO villain VALUES (4, 'monster', 10);";
        insert2 = Utils.replaceBlank(insert2);

        String selectAll1 = "SELECT * FROM avengers;";
        String selectAll2 = "SELECT * FROM villain;";

        String delete1 = "DELETE FROM avengers WHERE name = 'Groot';";
        String update1 = "UPDATE avengers SET power = 100 WHERE name = 'Captain';";

        String select1 = "select id, name from avengers where id = 4;";

//        String select1 = "SELECT ID FROM person WHERE name = 'Ted';";
//        String select2 = "SELECT tableName1.AttrName1, tableName1.AttrName2 tableName2.AttrName1, tableName2.AttrName2 FROM tableName1 JOIN tableName2 ON tableName1.attrName1 = tableName2.attrName2 WHERE  attrName1 = attrValue;";
//        String insert1 = "INSERT INTO person VALUES ('Bob', 15)";
//        String insert2 = "INSERT INTO person(name, ID) VALUES ('Tom', 13);";
//        String insert3 = "INSERT INTO person(name, ID) VALUES ('Ted', 14);";
//        String insert4 = "INSERT INTO person(name, ID) VALUES ('Tom', 12);";
//        String insert5 = "INSERT INTO person(name, ID) VALUES ('Ted', 11);";
//        String delete = "DELETE FROM person WHERE name = Tom;";
//        String delete3 = "DELETE FROM person WHERE name = Bob;";
//        String delete1 = "DELETE FROM person WHERE ID = 15;";
//        String delete2 = "DELETE FROM person WHERE ID = 13;";
//        String deleteAll = "DELETE FROM person;";
//        String update = "UPDATE  person  SET  name = gg  WHERE  ID = 13;";


        String code = useDB + select1;
//        String code = createDB + useDB + select1 + showTable;
        SQLiteLexer lexer = new SQLiteLexer(new ANTLRInputStream(code));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SQLiteParser parser = new SQLiteParser(tokenStream);
        SDBVisitor visitor = new SDBVisitor();
        visitor.visit(parser.parse());
    }
}
