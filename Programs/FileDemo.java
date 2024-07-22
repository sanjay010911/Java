import java.io.*;
import java.util.*;
class FileDemo
{
    public static void main(String args[])
    {
        FileInputStream fin;
        FileOutputStream fout;
        DataInputStream in;
        try{
            in=new DataInputStream(System.in);
            System.out.println("Enter the filename");
            String s=in.readLine();
            fin=new FileInputStream(s);
            byte b[]=new byte[fin.available()];
            fin.read(b);
            System.out.println("Enter the file2");
            s=in.readLine();
            fout=new FileOutputStream(s);
            fout.write(b);
        }
        catch(Exception e){}
    }
}