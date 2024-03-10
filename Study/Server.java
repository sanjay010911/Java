import java.io.*;
import java.net.*;
class Server
{
    public static void main(String args[])
    {
        DataInputStream sin;
        DataOutputStream sout;
        ServerSocket ss;
        Socket cs;
        try{
            ss=new ServerSocket(1234);
            cs=ss.accept();
            sin=new DataInputStream(cs.getInputStream());
            sout=new DataOutputStream(cs.getOutputStream());
            sout.writeUTF("Hii Client!!!");
            String s=sin.readUTF();
            System.out.println("Client Say :"+s);

        }
        catch(Exception e){}
    }
}