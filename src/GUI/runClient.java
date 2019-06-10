package GUI;

import java.util.Scanner;

public class runClient {
    public static void main(String[] args){
        System.out.println("Please input ip: ");
        Scanner console = new Scanner(System.in);
        String ip = console.nextLine();

        System.out.println("Please input port: ");
        int port = console.nextInt();

        Client client = new Client(ip, port);

        client.link();
    }
}
