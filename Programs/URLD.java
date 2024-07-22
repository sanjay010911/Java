import java.net.*;
import java.io.*;
class ABC<T1,T2>
{
    T1 a;
    T2 b;
    public ABC(T1 c,T2 d)
    {
        this.a=c;
        this.b=d;
    }
}
class URLD
{
    public static void main(String args[]) throws Exception
    {
        
       ABC<String,Integer> s=new ABC<String,Integer>("hello",45);
       System.out.println(s.a);
    }
}