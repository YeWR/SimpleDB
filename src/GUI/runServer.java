package GUI;

import java.util.Scanner;

public class runServer {
    public static void main(String[] args){
        System.out.println("Please input the port.");
        Scanner console = new Scanner(System.in);
        int port = console.nextInt();

        Server server = new Server(port);
        server.link();
    }
}
