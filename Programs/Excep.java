import java.io.*;
class MyEx extends Exception
{
    public MyEx()
    {
        super();
    }


}

class Excep
{
    public static void main(String args[])
    {
        try{
            throw new MyEx();

        }catch(MyEx e)
        {
            System.out.println("Exception MyEx Caught: "+e);
        }
    }
}