package client;

public class ClientStarter {
    public static void main(String[] args) {
        try{
            int port = 8289;
            String host = "localhost";
            new Thread(new Client(host,port)).start();
        }catch (NumberFormatException e){
            return;
        }
    }
}
//remove-{"n": "selena", "t": "31", "q": "12", "p": "west"}