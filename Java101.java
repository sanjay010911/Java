import java.io.*;
class Thread1 extends Thread
{
    public void run()
    {
        int i;
        for(i=1;i<=100;i++)
        {
            if(i%2!=0)
                System.out.println(i);
        }
    }
} 
class Thread2 extends Thread
{
    public void run()
    {
        int i;
        for(i=1;i<=100;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
    }
} 
class Java101
{
    public static void main(String args[])
    {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        System.out.println("Thread 1 : ");
        t1.run();
        System.out.println("Thread 2 : ");
        t2.run();
    }
} 