package GUI;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private int port;
    private String ip;
    private DataInputStream dataInputStream;

    public Client(String ip, int port){
        this.ip = ip;
        this.port = port;
    }

    public void link(){
        try {
            this.socket = new Socket(this.ip, this.port);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            InputStream is = this.socket.getInputStream();
            OutputStream os = this.socket.getOutputStream();

            DataOutputStream out = new DataOutputStream(os);
            DataInputStream in = new DataInputStream(is);

            Scanner console = new Scanner(System.in);
            while (true){
                String cmd = console.nextLine();

                out.writeUTF(cmd);
                out.flush();

                String msg = in.readUTF();
                System.out.println(msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
