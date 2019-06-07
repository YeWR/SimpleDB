package GUI;

public class runServer {
    public static void main(String[] args){
        Server server = new Server(5678);
        server.link();
    }
}
