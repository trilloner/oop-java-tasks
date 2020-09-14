
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public static void main(String[] args) throws IOException {
        int port = 2020;

        try{
        ServerSocket ss = new ServerSocket(port);
        System.out.println("Server is running...");

        Socket socket = ss.accept();
        System.out.println("We have a client");

            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            DataInputStream dstream = new DataInputStream(in);
            DataOutputStream dout = new DataOutputStream(out);
            String result = dstream.readLine();
            System.out.println(result);



        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
