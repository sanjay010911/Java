import java.io.*;
class Num
{
    int a;
    

    public void read(int b)
    {
        a=b;
    }

    public Num add(Num s)
    {
        Num n=new Num();
        n.a=a+s.a;
        return n;
    }
    public void disp()
    {
        System.out.println(a);
    }
}
class P5
{
    public static void main(String args[])
    {
       Num a,b,c;
       a=new Num();
       b=new Num();
       c=new Num();
       a.read(4);
       b.read(5);
       c=a.add(b);
       c.disp(); 
    }
}