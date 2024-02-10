import java.io.*;
class Java81
{
    int length;
    int width;

    public Java81()
    {
        length=width=0;
    }
    public Java81(int l,int w)
    {
        length=l;
        width=w;
    }
    public int calculatePeri()
    {
        return 2*(length+width);
    }
    public int calculateArea()
    {
        return length*width;
    }
    public int sameArea(Java81 r)
    {
        if(this.calculateArea()==r.calculateArea())
            return 1;
        else
            return 0;
    }
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        try{

            System.out.println("Enter the length and breadth of Java81 s");
            int a=Integer.parseInt(in.readLine());
            int b=Integer.parseInt(in.readLine());
            Java81 r=new Java81(a,b);
            System.out.println("Enter the length and breadth of Java81 r");
            a=Integer.parseInt(in.readLine());
            b=Integer.parseInt(in.readLine());
            Java81 s=new Java81(a,b);
            System.out.println("R perimeter "+r.calculatePeri());
            System.out.println("S perimeter "+s.calculatePeri());
            System.out.println("S Area "+s.calculateArea());
            System.out.println("R Area "+r.calculateArea());
            if(s.sameArea(r)==1)
                System.out.println("Both have Same area");
            else
                System.out.println("Both have different area");
        }
        catch(Exception e)
        {}
    }
}