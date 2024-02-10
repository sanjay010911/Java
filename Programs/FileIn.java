import java.io.*;
class FileIn
{
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("Enter the file name");
            String fname=in.readLine();
            FileInputStream fin=new FileInputStream(fname);
            int ch=fin.read();
            while(ch!=-1)
            {
                System.out.println((char)ch);
                ch=fin.read();
            }
            fin.close();
        }catch(Exception e){}
    }
}