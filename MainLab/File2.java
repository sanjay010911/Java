import java.io.*;
class File2
{
    public static void main(String args[])
    {
        try{
            FileInputStream fin=new FileInputStream("D:/SanjayJava/MainLab/Serial.java");
            byte b[]=new byte[fin.available()];
            fin.read(b);
            FileOutputStream fout=new FileOutputStream("D:/SanjayJava/MainLab/ab.java");
            fout.write(b);
        }catch(Exception e){}
    }
}