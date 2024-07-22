import java.io.*;
class Gen
{
    public <T>void Ge(T a)
    {
        System.out.println(a);
    }
}
class GenDemo
{
    public static void main(String args[])
    {
        Gen v=new Gen();
        v.Ge(new String("Hello"));
        
    }
}