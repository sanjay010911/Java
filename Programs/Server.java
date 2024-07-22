import java.io.*;
import java.net.*;
class Server
{
    public static void main(String args[])
    {
        ServerSocket ss;
        Socket cs;
        try{
            ss=new ServerSocket(1234);
            cs=ss.accept();
            DataInputStream sin=new DataInputStream(cs.getInputStream());
            DataOutputStream sout=new DataOutputStream(cs.getOutputStream());
            sout.writeUTF("Hii Client");
            System.out.println(sin.readUTF());
            
        }
        catch(Exception e){}
    }
}