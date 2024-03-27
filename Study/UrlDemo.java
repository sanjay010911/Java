import java.io.*;
import java.net.*;
class UrlDemo
{
    public static void main(String agrs[])
    {
        DataInputStream din;
        DataInputStream in;
        try{
            URL ur=new URL("https://www.orimi.com/pdf-test.pdf");
            URLConnection u=ur.openConnection();
            din=new DataInputStream(u.getInputStream());
            in=new DataInputStream(System.in);
            System.out.println("Enter the path");
            String name=in.readLine();
            FileOutputStream fout=new FileOutputStream(name);
            int ch=din.read();
            while(ch!=-1)
            {
                fout.write((char)ch);
                ch=din.read();
            }

        }catch(Exception e){}
    }
}