import java.net.*;
class DSS
{
    public static void main(String arg[]) throws Exception
    {
        DatagramSocket ds=new DatagramSocket(9999);
        byte b[]=new byte[1024];
       
        DatagramPacket dp=new DatagramPacket(b,b.length);
        ds.receive(dp);
        System.out.println(new String(dp.getData()));


        byte b2[]=new byte[1024];
        InetAddress ia=dp.getAddress();

        b="Hii client".getBytes();
        DatagramPacket dp1=new DatagramPacket(b2,b2.length,ia,dp.getPort());
        ds.send(dp1);
    }
}