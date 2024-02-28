import java.io.*;
class FileInput
{
    public static void main(String args[]) throws Exception
    {
        DataInputStream in=new DataInputStream(System.in);
        FileInputStream fin;
        System.out.println("enter the path");
        String path=in.readLine();
        byte c[]=new byte[5];
        fin=new FileInputStream(path);
        byte b[]=new byte[5];
        int ch;
       String s;
        while((ch=fin.read(b))!=-1)
        {
            s=s+(String) b;
            System.out.println(s);
        } 
        //System.out.println(s);
        //FileOutputStream fout=new FileOutputStream("D:/SanjayJava/Study/F.txt");
        //fout.write(b);
    }
}