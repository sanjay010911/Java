import java.io.*;
import java.net.*;
class UC
{
    public static void main(String args[]) throws Exception
    {
        FileOutputStream fout;
        URL url=new URL("https://www.orimi.com/pdf-test.pdf");
        URLConnection u=url.openConnection();
        System.out.println(u.getContentType());
        System.out.println(u.getExpiration());
        DataInputStream in=new DataInputStream(u.getInputStream());
        fout=new FileOutputStream("pdf-test.pdf");
        int ch=in.read();
        while(ch!=-1)
        {
            fout.write((char)ch);
            ch=in.read();
        }
    }
}