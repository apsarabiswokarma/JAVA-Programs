import java.net.*;
import java.util.*;

class Sender{
    static Scanner scan = new Scanner(System.in);
    public static void main(String [] args) throws Exception{
        DatagramSocket socket = new DatagramSocket();

        //Get Data from the user
        System.out.println("please enter a msg");
        String msg = scan.next();

        //conver the data into an array of bytes
        byte [] byteMsg = msg.getBytes();

        // Get IP address of the receiver
        // we assume that the receiver is running on a localhost
        InetAddress ip = InetAddress.getLocalHost();
        // prepare byte array to be sent over as a datagram packet
        DatagramPacket packetToBeSent = new DatagramPacket(byteMsg,byteMsg.length,ip,5000);
        // send the datagram to via UDP 
        socket.send(packetToBeSent);


        // Lets receive the packet from the server
        // First lets prepare the packet to be recieved. All packets are recieved in byte format.

        byte [] byteReply = new byte[1024]; // size 1024 is arbitrary
        
        DatagramPacket packetToBeReceived = new DatagramPacket(byteReply, byteReply.length);
        // receive packet from datagram socket
        socket.receive(packetToBeReceived);

        //convert the packet to string

        String reply  = new String(packetToBeReceived.getData());

        System.out.println("Msg from the server " + reply);

    }
}