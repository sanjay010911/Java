import java.io.*;
class Java111
{
    public static void main(String args[])
    {
        FileInputStream fin1;
        FileInputStream fin2;
        FileOutputStream fout;
        int ch;
        DataInputStream in=new DataInputStream(System.in);
        byte b[];
        try{
            System.out.println("Enter the file1");
            String s1=in.readLine();
            System.out.println("Enter the file2");
            String s2=in.readLine();
            fin1=new FileInputStream(s1);
            fin2=new FileInputStream(s2);
            System.out.println("enter the file3");
            String s3=in.readLine();
            fout=new FileOutputStream(s3);
            b=new byte[1024];
            // fin1.read(b);

            while((ch=fin1.read(b))!=-1)
            {
                fout.write(b,0,ch);
            }
            b=new byte[1024];
           while((ch=fin2.read(b))!=-1)
            {
                fout.write(b,0,ch);
            }
            fout.write(b);
            fin1.close();
            fin2.close();
            fout.close();
        }
        catch(Exception e){}
    }
}