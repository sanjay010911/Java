import java.io.*;
class Th1 implements Runnable
{
    public void run()
    {
        int i=0;
        try{
            while(i<10){
            System.out.println(i++);
            Thread.sleep(1500);
            Thread t=new Thread(new Th2());
            t.start();
            // t.join();
            }
        }catch(Exception e){}
    }
}
class Th2 implements Runnable
{
    public void run()
    {
        char a=97;
        try{
            while(a<105){
             System.out.println(a);
             a++;
                Thread.sleep(1500);
            }
        }catch(Exception e){}
    }
}

class ThMain
{
    public static void main(String args[])
    {
        try{
        Th1 t1=new Th1();
        Thread t=new Thread(t1);
        t.start();

        System.out.println("End of main");
        }catch(Exception e){}
        
    }
}