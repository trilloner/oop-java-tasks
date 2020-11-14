import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int port = 2020;
        String adress = "127.0.0.1";
        User u1 = new User("akar", 15,false);
        ObjectInputStream ois = null;
        try {
            InetAddress ipAdress = InetAddress.getByName(adress);
            Socket socket = new Socket(ipAdress,port);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            DataOutputStream dstream = new DataOutputStream(out);
            //DataInputStream dinput = new DataInputStream(in);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String message = u1.toJSON();
            dstream.writeBytes(message);
            ois = new ObjectInputStream(socket.getInputStream());
            String result = (String) ois.readObject();
            System.out.println("Message: " + result);
//            String response = reader.readLine();
//            System.out.println(response);




            dstream.close();
            out.close();
            socket.close();

        }catch (Exception e){
            System.out.println("No connect");
        }
    }
}
