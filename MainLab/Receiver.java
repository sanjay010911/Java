import java.io.*;
import java.net.*;
class Receiver
{
    public static void main(String args[])
    {
        Socket cs;

        try{
            cs=new Socket("localhost",1234);
            DataInputStream sin=new DataInputStream(cs.getInputStream());
            DataOutputStream sout=new DataOutputStream(cs.getOutputStream());
            System.out.println(sin.readUTF());
            sout.writeUTF("Hii Server");
            

        }catch(Exception e){}
    }
}