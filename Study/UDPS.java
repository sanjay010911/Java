import java.net.*;
import java.io.*;
class UDPS
{
	public static void main(String args[]) throws Exception,SocketException,IOException
	{
		DatagramSocket ds=new DatagramSocket(1234);
        DatagramPacket dp,reply;
        byte b[]=new byte[1000];
        dp=new DatagramPacket(b,b.length);
        ds.receive(dp);
        System.out.println(dp.getData());
        reply=new DatagramPacket("THis is server".getBytes(),"THis is server".length(),dp.getAddress(),dp.getPort());
        ds.send(reply);
    }
}

