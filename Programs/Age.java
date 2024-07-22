import java.io.*;
class AgeNotValidException extends Exception
{
    public AgeNotValidException()
    {
        super();
    }
}

class Age
{
    public static void main(String args[])
    {
        try{
        throw new AgeNotValidException();
        }catch(AgeNotValidException e)
        {
            System.out.println("Exception Caught:"+e);
        }
    }
}