import java.io.*;
import java.util.Random;
class Th1 extends Thread
{
    public int v;
    public void run()
    {
        try{
            int i=1;
            while(i!=0)
            {
                System.out.println("\n"+"Thread A : ");
                Random rand = new Random();
                int v = rand.nextInt(10);
                System.out.print(v);
                if(v%2==0)
                {
                    Th2 t2=new Th2(v);
                    t2.run();
                }
                else
                {
                    Th3 t3=new Th3(v);
                    t3.run();
                }
                sleep(1000);
            
            }
        }catch(Exception e){}
    }
}

class Th2 extends Thread
{
    int n;
    public Th2(int n)
    {
        this.n=n;
    }
    public void run()
    {
        try{
            System.out.println("\n"+"Thread B : ");
            System.out.print(n*n);
            sleep(1000);
        }
        catch(Exception e){}
    }
}
class Th3 extends Thread
{
    int n;
    public Th3(int n)
    {
        this.n=n;
    }
    public void run()
    {
        try{
            System.out.println("\n"+"Thread C : ");
            System.out.print(n*n*n);
            sleep(1000);
        }
        catch(Exception e){}
    }
}
class Java103
{
    public static void main(String args[])
    {
        
        Th1 t1=new Th1();
        t1.start();
       
    }
}