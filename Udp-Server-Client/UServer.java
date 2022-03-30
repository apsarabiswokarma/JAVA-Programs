//UDP to find the number sent by client is even or odd
import java.net.*;

public class UServer {
    public static void main(String[] args) {
        try{
        //initialize socket
        DatagramSocket socket=new DatagramSocket(5000);
        System.out.println("Waiting for Message...");
        byte [] byteReceived=new byte[1024];

        DatagramPacket packetToBeReceived=new DatagramPacket(byteReceived, byteReceived.length);

        socket.receive(packetToBeReceived);

        String msg=new String(packetToBeReceived.getData(),0,packetToBeReceived.getLength());
        
        int num=Integer.parseInt(msg);
        System.out.println("Message from client:"+ num);


        InetAddress cIP=packetToBeReceived.getAddress();//ip address of client
        int cPort=packetToBeReceived.getPort();//port number of client
        String reply=new String();
        if(num %2==0){
            reply="Number is even";
        }
        else{
            reply="Number is odd";
        }
        
        byte [] byteReply=reply.getBytes();
        DatagramPacket packetToBeSent=new DatagramPacket(byteReply, byteReply.length ,cIP,cPort);

        socket.send(packetToBeSent);
        

        socket.close();
        
        }catch(Exception e){

        }
    }
}