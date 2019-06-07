package GUI;

public class runClient {
    public static void main(String[] args){
        Client client = new Client("127.0.0.1", 5678);

        client.link();
    }
}
