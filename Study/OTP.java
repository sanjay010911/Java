import java.io.*;
import java.util.*;
class OTP
{
    public static void main(String args[])
    {
        String s="";
        int i=0;
        Integer n;
        Random r=new Random();
        while(i<5)
        {
            n=r.nextInt(10);
            s=s+n.toString();
            i++;
        }
        System.out.println(s);

    }
}