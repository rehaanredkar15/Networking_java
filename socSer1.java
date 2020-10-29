package networking_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class socSer1 {
    public static void main(String[] args) throws IOException {
           //now here the server socket will be created
        System.out.println("server is started");
        ServerSocket ss = new ServerSocket(1342);

        System.out.println("Server is waiting for client request");
        Socket s = ss.accept();
        System.out.println("Client Connected ");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str1 = br.readLine();
        System.out.println("Client Data :" + str1);




    }
}
