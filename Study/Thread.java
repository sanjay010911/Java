import java.io.*;
class CThread extends Thread
{
    int n;
    public CThread(int a)
    {
        n=a;
    }
    public void run()
    {
        int i;
        for(i=1;i<=n;i++)
        {
            System.out.println("if i= "+i);
        }
    }
}
class Thread
{
    public static void main(String args[])
    {
        CThread t1,t2;
        t1=new CThread(100);
        t2=new CThread(150);
        System.out.println("B4 Thread");
        t1.run();
        System.out.println("Between Thread");
        t2.run();
        System.out.println("After Thread");
    }
}