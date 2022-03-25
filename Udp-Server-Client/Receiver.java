 //UDP Server that recieves a data from a sender and sends a reply


 import java.net.*;

 class Receiver{
     public static void main(String [] args) throws Exception{
         // Open a socket for UDP communication
         // bind the socket to port 5000 (arbitrary)
         DatagramSocket socket = new DatagramSocket(5000);

         System.out.println("waiting for packets");
         // Lets prepare a byte array for the message that is to be received
         byte [] byteReceived = new byte[1024];
         // prepare datagram packet for received data
         DatagramPacket packetToBeReceived = new DatagramPacket(byteReceived, byteReceived.length);
         // lets receive the udp packet from the server
         socket.receive(packetToBeReceived);

         //get the message frm the packet
         String msg = new String(packetToBeReceived.getData());
         System.out.println("Recieved msg " + msg);

         String reply ="Thanks for the message"; // you can ask user to enter a msg
         // convert to byte
         byte [] byteReply = reply.getBytes();

         // lets get the port number of the sender, where we intend to send the packet
         int port = packetToBeReceived.getPort();
         // lets get the IP address of the sender in the similar way
         InetAddress senderIp = packetToBeReceived.getAddress();

         //lets prepare the packet
         DatagramPacket packetToBeSent = new DatagramPacket(byteReply, byteReply.length,senderIp,port);
         //send the packet over the n/w

         socket.send(packetToBeSent);
         socket.close();
     }
 }