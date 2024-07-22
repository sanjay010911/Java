import java.io.*;
class Th1 extends Thread
{
    public void run()
    {
        try{
            for(int i=0;i<10;i++)
            {
                System.out.println(i);
                sleep(1500);
                new Th2().start();
            }
        }catch(Exception e){}
    }
}

class Th2 extends Thread{
    pubic void run()
    {
        try{
            for(char a=97;a<=105;a++)
            {
                System.out.println(a);
                sleep(1500);
            }
        }catch(Exception e){}
    }
}
class ThMain
{
    public static void main(String args[])
    {
        Th1 t=new Th1();
        t.start();
    }
}