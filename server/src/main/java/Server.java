
import com.google.gson.Gson;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static User fromJSON(String result) {
        Gson json = new Gson();
        User u2 = json.fromJson(result, User.class);
        return u2;
    }

    public static void main(String[] args) throws IOException {
        int port = 2020;

        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Server is running...");
            while (true) {
                Socket socket = ss.accept();
                System.out.println("We have a client");

                InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream();
                DataInputStream dstream = new DataInputStream(in);
                DataOutputStream dout = new DataOutputStream(out);
                String result = dstream.readLine();
                System.out.println(result);

                User c1 = fromJSON(result);
                String getResult = c1.toString();
                System.out.println(getResult);
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                //write object to Socket
                oos.writeObject("Hi Client "+getResult);
                //close resources
                oos.close();
//                OutputStreamWriter writer = new OutputStreamWriter(out);
//
//                writer.write(getResult);
//                writer.flush();
//                writer.close();
                socket.close();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
