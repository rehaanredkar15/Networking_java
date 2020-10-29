package networking_java;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class datagramser {

    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(2000);
        byte [] b = new byte[100];

        DatagramPacket dp = new DatagramPacket(b,b.length);

        ds.receive(dp);  // everything else is same for both

        String msg = new String(b);

        System.out.println("Received " +msg);
    }








}
