import java.io.*;
class Person
{
    int age;
    String name;
    public void readp()
    {
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("Enter the name and age");
            name=in.readLine();
            age=Integer.parseInt(in.readLine());
        }
        catch(Exception e)
        {}
    }
    public void dispp()
    {
        System.out.println("Name :"+name+" Age :"+age);
    }
}

class Teacher extends Person
{
    String subj;
    public void readt()
    {
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("Enter the subject");
            subj=in.readLine();
        }
        catch(Exception e){}
    }
    public void dispt()
    {
        System.out.println("Subject :"+subj);
    }
}
class P8
{
    public static void main(String args[])
    {
        Person p,q;
        Teacher t;
        p=new Person();
        t=new Teacher();
        p.readp();
        t.readp();
        t.readt();
        p.dispp();
        t.dispp();
        t.dispt();
    }
}