 import java.net.*;
import java.util.Scanner;

public class UClient {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
       try{
        DatagramSocket socket=new DatagramSocket();

        System.out.println("Enter a number to be sent:");
        int msg=scan.nextInt();
        String num=String.valueOf(msg);

        byte [] byteMsg=num.getBytes();

        InetAddress ip=InetAddress.getLocalHost();
        System.out.println("Server address="+ip);

        DatagramPacket packetToBeSent=new DatagramPacket(byteMsg,byteMsg.length,ip,5000);
       
        socket.send(packetToBeSent);

        byte [] byteReply=new byte[1024];

        DatagramPacket packetToBeReceived=new DatagramPacket(byteReply, byteReply.length);

        socket.receive(packetToBeReceived);

        String reply=new String(packetToBeReceived.getData());
        System.out.println("Server reply="+ reply);

        socket.close();
       }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}