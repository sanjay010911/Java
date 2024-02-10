import java.io.*;
class QuadRoot
{
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("Enter a,b,c");
            int a=Integer.parseInt(in.readLine());
            int b=Integer.parseInt(in.readLine());
            int c=Integer.parseInt(in.readLine());
            int det=b*b-4*a*c;
            if(det>0)
            {
                double r1=(-b+Math.sqrt(det))/(2*a);
                double r2=(-b-Math.sqrt(det))/(2*a);
                System.out.println("The Real Roots = "+r1+" "+r2);
            }
            else if(det==0)
            {
                double r=-b/(2*a);
                System.out.println("Roots are equal : "+r);
            }
            else if(det<0)
            {
                System.out.println("Roots are imaginary");
            }
        }
        catch(Exception e){}
    }
}