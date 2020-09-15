import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        int port = 2020;
        String adress = "127.0.0.1";
        User u1 = new User("akar", 16,false);

        try {
            InetAddress ipAdress = InetAddress.getByName(adress);
            Socket socket = new Socket(ipAdress,port);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            DataOutputStream dstream = new DataOutputStream(out);
            DataInputStream dinput = new DataInputStream(in);

            String message = u1.toJSON();
            dstream.writeBytes(message);






            dstream.close();
            out.close();
            socket.close();

        }catch (Exception e){
            System.out.println("No connect");
        }
    }
}
