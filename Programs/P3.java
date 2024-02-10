import java.io.*;
class P3
{
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        try{
            int a[],n;
            System.out.println("Enter n");
            n=Integer.parseInt(in.readLine());
            a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(in.readLine());
            }

            for(int i=0;i<n;i++)
                System.out.println("a["+i+"]"+" = "+a[i]);
            
        }catch(Exception e) 
        {}
    }
}