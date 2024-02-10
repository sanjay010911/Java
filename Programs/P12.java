import java.io.*;
class Person
{
    int age;
    String name;
    public Person()
    {
        age=0;
        name="";
    }
    public Person(int a,String b)
    {
        age=a;
        name=b;
    }
    public void disp()
    {
        System.out.println("Name :"+name+" Age :"+age);
    }
}

class Teacher extends Person
{
    String subj;
    public Teacher()
    {
        subj="";
    }
    public Teacher(int n,String a,String s)
    {
        super(n,a);
        subj=s;
    }

    public void disp()
    {
        super.disp();
        System.out.println("Subject :"+subj);
    }
}

class P12
{
    public static void main(String args[])
    {
        Person p;
        Teacher t;
        p=new Person(25,"sss");
        t=new Teacher(35,"ddd","css");
        p.disp();
        t.disp();
    }
}