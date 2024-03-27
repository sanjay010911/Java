import java.io.*;
import java.net.*;
class Server
{
    public static void main(String args[])
    {
        Socket cs;
        ServerSocket ss;
        DataInputStream sin;
        DataOutputStream sout;
        try{
            ss=new ServerSocket(1234);
            cs=ss.accept();
            sin=new DataInputStream(cs.getInputStream());
            sout=new DataOutputStream(cs.getOutputStream());
            String data = sin.readUTF();
            System.out.println("Client says: " + data);
            sout.writeUTF("Hi Client!!!");
        }
        catch(Exception e){}
    }
}