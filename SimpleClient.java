import java.io.*;
import java.net.*;
import java.util.*;
public class SimpleClient {
    private Socket socket;
    private PrintWriter out;
    private Scanner in;
    public SimpleClient(String ip, int port) {}
    public void sendMessage(String message) {}
    public String receiveMessage() { return null; }
    public void close() {}
  public static void main(String[] args) throws IOException {
        SimpleClient s = new SimpleClient("127.0.0.1", 9090);
          while(true){
            s.sendMessage("Client");
            String reply= s.receiveMessage();
            System.out.println(reply+ " ");
            if (reply.equals("stop")){
                break;
            }

        }


    }

}


