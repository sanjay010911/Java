import java.io.*;
class File3
{
    public static void main(String args[])
    {
        try{
            FileInputStream fin1=new FileInputStream("D:/SanjayJava/MainLab/Serial.java");
            FileInputStream fin2=new FileInputStream("D:/SanjayJava/MainLab/Direc.java");
            FileOutputStream fout=new FileOutputStream("D:/SanjayJava/MainLab/ab.java");
            int ch=fin1.read();
            while(ch!=-1)
            {
                fout.write(ch);
                ch=fin1.read();
            }

            ch=fin2.read();
            while(ch!=-1)
            {
                fout.write(ch);
                ch=fin2.read();
            }
        }catch(Exception e){}
    }
}