import java.net.*;
class DSC
{
    public static void main(String arg[]) throws Exception
    {
        DatagramSocket ds=new DatagramSocket();
        String msg="Hii Server";
        byte b[]=new byte[1024];
        b=msg.getBytes();
        InetAddress ia=InetAddress.getLocalHost();
        DatagramPacket dp=new DatagramPacket(b,b.length,ia,9999);
        ds.send(dp);

        byte b2[]=new byte[1024];
        DatagramPacket dp1=new DatagramPacket(b2,b2.length);
        ds.receive(dp1);
        System.out.println(new String(dp1.getData()));

    }
}