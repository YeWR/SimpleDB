package GUI;

import Utils.FileUtils;
import Utils.Utils;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client{
    private Socket socket;
    private int port;
    private String ip;
    public DataOutputStream out;
    public DataInputStream in;

    public Client(String ip, int port){
        this.ip = ip;
        this.port = port;
    }

    public void link(){
        try {
            this.socket = new Socket(this.ip, this.port);
            System.out.println("succeed to link to the server!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            InputStream is = this.socket.getInputStream();
            OutputStream os = this.socket.getOutputStream();

            out = new DataOutputStream(os);
            in = new DataInputStream(is);

            new Thread(new ReadThread(this)).start();

            Scanner console = new Scanner(System.in);
            while (true){
                System.out.print("sql>");
                String cmd = console.nextLine();
                String[] ss = cmd.split(" |;");

                if(cmd.toLowerCase().equals("exit")){
                    out.writeUTF(cmd);
                    out.flush();
                    return;
                }
                else if(ss[0].toLowerCase().equals("import")){
                    String sql = this.inputSQLFile(ss[1]);
                    out.writeUTF("+" + sql);
                    out.flush();
                }
                else {
                    out.writeUTF(cmd);
                    out.flush();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String inputSQLFile(String fileName){
        String sql = FileUtils.readWholeFile(fileName);
        sql = Utils.replaceBlank(sql);

        return sql;
    }
}

class ReadThread implements Runnable{

    private Client client;

    public ReadThread(Client client){
        this.client = client;
    }

    @Override
    public void run() {
        while (true){
            String msg = null;
            try {
                msg = this.client.in.readUTF();
                if(msg.toLowerCase().equals("exit")){
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(msg);
        }
    }
}
