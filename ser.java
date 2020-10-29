package networking_java;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ser {

    public static void main(String[] args) throws IOException {

        ServerSocket s1 = new ServerSocket(1342);
        Socket ss = s1.accept();
        Scanner sc = new Scanner(ss.getInputStream());
        int number = sc.nextInt();

        int temp = number * 2;

        PrintStream p = new PrintStream(ss.getOutputStream());
        p.println(temp);

     }
}
