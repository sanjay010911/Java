import java.io.*;
import java.net.*;
class Client
{
    public static void main(String args[])
    {
        Socket cs;
        DataInputStream sin;
        DataOutputStream sout;
        try{
            cs=new Socket("localhost",1234);
            sin=new DataInputStream(cs.getInputStream());
            sout=new DataOutputStream(cs.getOutputStream());
            sout.writeUTF("Hi Server!!!");
            String data = sin.readUTF();
            System.out.println("Server says: " + data);
        }
        catch(Exception e){}
    }
}