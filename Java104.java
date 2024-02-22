import java.io.*;
class CThread implements Runnable
{
    public void run()
    {
        try{
            System.out.println(Thread.currentThread().getName()+"is running");
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+"has finished ");
        }
        catch(Exception e){ }
    }
}

class Java104
{
    public static void main(String args[])
    {
        int no=5,i;
        Thread threads[]=new Thread[no];
        for(i=0;i<no;i++)
        {
            CThread th=new CThread();
            threads[i]=new Thread(th);
            threads[i].start();
        } 

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread has finished.");
    }
}