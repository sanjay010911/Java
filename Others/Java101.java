import java.io.*;
import java.util.Random;
class Thread1 extends Thread
{
    public void run()
    {
        int i;
        try{
            Random rand = new Random();
            i=rand.nextInt(10);
            do{
                System.out.println(i);
                if(i%2==0)
                {
                    Thread2 t2=new Thread2(i);
                    t2.run();
                }
                else
                {
                    Thread3 t3=new Thread3(i);
                    t3.run();
                }
                 sleep(1000); 
                i=rand.nextInt(10);
            }while(i!=5);
             
        }catch(Exception e){}
    }

       
} 
class Thread2 extends Thread
{
    int v;
    public Thread2(int i)
    {
        v=i;
    }
    public void run()
    {
       System.out.println("Square : "+v*v);
    }
} 

class Thread3 extends Thread
{
    int v;
    public Thread3(int i)
    {
        v=i;
    }
    public void run()
    {
       System.out.println("Cube : "+v*v*v);
    }
}

class Java101
{
    public static void main(String args[])
    {
        Thread1 t1=new Thread1();
        System.out.println("Thread 1 : ");
        t1.run();
    }
    
} 