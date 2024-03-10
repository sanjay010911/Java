import java.io.*;
import java.net.*;
class Client
{
    public static void main(String args[])
    {
        DataInputStream sin;
        DataOutputStream sout;
        ServerSocket ss;
        Socket cs;
        try{
            cs=new Socket("localhost",1234);
            sin=new DataInputStream(cs.getInputStream());
            sout=new DataOutputStream(cs.getOutputStream());
            String s=sin.readUTF();
            System.out.println("Server says :"+s);
            sout.writeUTF("Hii server!!!");

        }
        catch(Exception e){}
    }
}