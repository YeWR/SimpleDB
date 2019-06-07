package GUI;

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
                String cmd = console.nextLine();

                out.writeUTF(cmd);
                out.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
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
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(msg);
        }
    }
}
