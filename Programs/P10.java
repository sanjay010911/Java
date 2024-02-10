import java.io.*;
class Person
{
    int age;
    String name;
    public void read()
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
    public void disp()
    {
        System.out.println("Name :"+name+" Age :"+age);
    }
}

class Teacher extends Person
{
    String subj;
    public void read()
    {
        super.read();
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("Enter the subject");
            subj=in.readLine();
        }
        catch(Exception e){}
    }
    public void disp()
    {
        super.disp();
        System.out.println("Subject :"+subj);
    }
}
class P10
{
    public static void main(String args[])
    {
        Person p;
        Teacher t;
        p=new Person();
        t=new Teacher();           
        t.read();
        t.disp();
    }
}  