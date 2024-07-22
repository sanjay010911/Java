import java.io.*;
class Gen <T1,T2>
{
    T1 a;
    T2 b;

    public Gen(T1 v,T2 c)
    {
        a=v;
        b=c;
    }
    public void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
class GenMain
{
    public static void main(String args[])
    {
        Gen f=new Gen<String,String>("Hiii","Sanjay");
        f.display();
    }
}