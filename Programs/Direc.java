import java.util.*;
import java.io.*;
public class Direc
{
    public static void disp(String s)
    {
        try{
        File f=new File(s);
        String b[];
        b=f.list();
        int i;
        for(i=0;i<b.length;i++)
        {
            File d=new File(s+b[i]+"/");
            if(d.isDirectory())
                disp(s+b[i]+"/");
            else
                System.out.println(b[i]);
        }
        }catch(Exception e){}
    }
	public static void main(String[] args) {
        
        disp("F:/");
		
	}
}