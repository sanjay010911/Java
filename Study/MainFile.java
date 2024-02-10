import java.io.*;
class A extends Thread
{
    char a='a';
    public void run()
    {
            try{
            for(int i=1;i<=5;i++)
            {
                System.out.println(a);
                a++;
                sleep(2000);
            }
           } catch(Exception e){}
        
    }
}
class B extends Thread
{
    char a='A';
    public void run()
    {
            try{
            for(int i=1;i<=5;i++)
            {
                System.out.println(a);
                a++;
                sleep(2000);
            }
            }catch(Exception e){}
        
            
    }
}

class MainFile
{
    public static void main (String args[])
    {
        A a=new A();
        B b=new B();
        a.run();
        b.run();
    }
}