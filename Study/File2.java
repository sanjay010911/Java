import java.io.*;
class File2
{
    public static void main(String args[])
    {
        FileInputStream fin;
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("enter the name of the file");
            String name=in.readLine();
            fin=new FileInputStream(name);
            int ch;
            ch=fin.read();
            while(ch!=-1)
            {
                System.out.println((char)ch);
                ch=fin.read();
            }
           
        fin.close();
        }catch(Exception e){}
    }
}