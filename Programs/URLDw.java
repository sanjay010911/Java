import java.io.*;
import java.net.*;
class URLDw
{
    public static void main(String args[]) throws Exception
    {
        URL u=new URL("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf");
        URLConnection uc=u.openConnection();
        DataInputStream in=new DataInputStream(uc.getInputStream());
        FileOutputStream fout=new FileOutputStream("abc.pdf");
        int ch=in.read();
        while(ch!=-1)
        {
            fout.write(ch);
            ch=in.read();
        }
    }
}