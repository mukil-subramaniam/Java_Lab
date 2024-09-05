import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
public static void main(String[] args) throws IOException{
    DatagramSocket DatagramSocket=new DatagramSocket();
    String msg="Hii Client";
    InetAddress ip=InetAddress.getByName("localhost");
    DatagramPacket datagramPacket=new DatagramPacket(msg.getBytes(),msg.length(),ip,9999);
     DatagramSocket.send(datagramPacket);
     DatagramSocket.close();

}
    
}