package GUI;

import Parser.SDBVisitor;
import Parser.SQLiteLexer;
import Parser.SQLiteParser;
import Utils.Utils;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private int port;
    private ServerSocket serverSocket;
    private Socket socket;
    private SDBVisitor visitor;
    private DataInputStream in;
    private DataOutputStream out;

    public Server(int port){
        this.port = port;
        try {
            this.serverSocket = new ServerSocket(this.port);
        } catch (IOException e) {
            e.printStackTrace();
        }

        init();
    }

    private void init(){
        visitor = new SDBVisitor(this);
    }

    public void link() {
        try {
            System.out.println("link a client...");
            this.socket = this.serverSocket.accept();
            System.out.println("link over!");

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String sql = in.readUTF();
                sql = Utils.replaceBlank(sql);
                // TODO: import file
                this.inputSQL(sql);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(String msg){
        try {
            this.out.writeUTF(msg);
            this.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputSQL(String sql){
        SQLiteLexer lexer = new SQLiteLexer(new ANTLRInputStream(sql));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SQLiteParser parser = new SQLiteParser(tokenStream);

        visitor.visit(parser.parse());
    }
}
