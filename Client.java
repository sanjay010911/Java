import java.io.*;
import java.net.*;
import java.util.*;
class Client
{
    public static void main(String args[])
    {
        Socket cs;
        DataInputStream sin;
        Scanner s;
        DataOutputStream sout;
        String str1;
        String str;
        try{
            cs=new Socket("localhost",1234);
            sin=new DataInputStream(cs.getInputStream());
            sout=new DataOutputStream(cs.getOutputStream());
            s=new Scanner(System.in);
            str1=" ";
            while(!str1.equals("quit"))
            {
                str=sin.readUTF();
                System.out.println("Server says :"+str);
                str1=s.nextLine();
                sout.writeUTF(str1);
                
            }
            System.in.read();
        }
    
        catch(Exception e){}
    }
}