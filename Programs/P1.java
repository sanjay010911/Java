import java.io.*;
class P1
{
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        String name;
        int age;
        String s;
        try{
            System.out.println("Enter your name");
            name=in.readLine();
            System.out.println("Enter your age");
            age=Integer.parseInt(in.readLine());
            System.out.println("Name :"+name);
            System.out.println("Age :"+age);
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
}