import java.io.*;
class AgeNotValid extends Exception
{
    public AgeNotValid()
    {
        super();
    }
}

class AgeCheck
{
    public static void main(String args[])
    {
        try{
            throw new AgeNotValid();
        }catch(AgeNotValid e){System.out.println(e);}

    }
}