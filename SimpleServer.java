import java.io.*;
import java.net.*;
import java.util.*;
public class SimpleServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter out;
    private Scanner in;
    public SimpleServer(int port)  {}
    public void acceptClient() {}
    public String receiveMessage() {  return ""; }
    public void sendMessage(String message) {}
    public void close() { }
    public static void main(String[] args) {
    try{
        SimpleServer s = new SimpleServer(9090);
        s.acceptClient();
        while(true){
            s.sendMessage("Hello ");
            String reply= s.receiveMessage();
            System.out.println(reply+ " ");
            if (reply.equals("stop")){
                break;
            }
        }
        }catch(IOException e){

        } // end off try
    }
}


