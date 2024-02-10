import java.io.*;
class P2
{
    public static void main(String args[])
    {
        int n1,n2;
        DataInputStream in=new DataInputStream(System.in);
        try{
            n1=Integer.parseInt(in.readLine());
            n2=Integer.parseInt(in.readLine());
            System.out.println("Sum of "+n1+"and "+n2+" is :"+(n1+n2));
        }catch(Exception e)
        {}
    }
}

