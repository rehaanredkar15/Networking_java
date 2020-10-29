package networking_java;


import java.io.IOException;
import java.net.*;

/*  A datagram is an independent, self-contained message sent over the network whose arrival
, arrival time, and content are not guaranteed.
  Java implements datagrams on top of the UDP (User Datagram Protocol) protocol by using two classes:

DatagramPacket object is the data container.
DatagramSocket is the mechanism used to send or receive the DatagramPackets.*/
public class datagram1client
{

    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();   //so we created
        byte [] b = "Risk hai toh Ishq".getBytes();//bytes array is used to store the streams
        //in datagram the data is converted to byte
        InetAddress ip = InetAddress.getByName("localhost"); //this is for fetching the ip and using it
        int port = 1000;

        DatagramPacket dp = new DatagramPacket(b,b.length,ip,2000); //the packet is used to send data in udp and to send it the info of port no etc is required

        ds.send(dp);//sending the packet to udp server

    }
}
