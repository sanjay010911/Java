import java.io.*;
import java.net.*;
import java.util.*;
class Server
{
    public static void main(String args[])
    {
        DataInputStream sin;
        DataOutputStream sout;
        Scanner s;
        ServerSocket ss;
        Socket as;
        String str1;
        String str;
        try{
            ss=new ServerSocket(1234);
            as=ss.accept();
            sin=new DataInputStream(as.getInputStream());
            sout=new DataOutputStream(as.getOutputStream());
            s=new Scanner(System.in);
            str1=" ";
            while(!str1.equals("quit"))
            {
                str1=s.nextLine();
                sout.writeUTF(str1);
                str=sin.readUTF();
                System.out.println("Client says :"+str);
            }
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}