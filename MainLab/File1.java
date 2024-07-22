import java.io.*;
class File1
{
    public static void main(String args[])
    {
        int i=0;
        try{
            BufferedReader b=new BufferedReader(new FileReader("D:/SanjayJava/MainLab/Serial.java"));
            String s=b.readLine();
            while(s!=null)
            {
                i++;
                System.out.println(String.valueOf(i)+s);
                s=b.readLine();
            }
            System.out.println("Number of lines : "+i);

        }catch(Exception e){}
    }
}