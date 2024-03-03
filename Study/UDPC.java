import java.net.*;
import java.io.*;

class UDPC
{
	public static void main(String args[]) throws Exception,SocketException,IOException
	{
		DatagramSocket ds=null;
		DatagramPacket dp=null,reply=null;
		InetAddress shost=InetAddress.getByName("localhost");
		dp=new DatagramPacket("This is client".getBytes(),"This is client".length(),shost,1234);
		ds.send(dp);
		byte b[]=new byte[1000];
		reply=new DatagramPacket(b,b.length);
		ds.receive(reply);
		System.out.println(reply.getData());
	}
}