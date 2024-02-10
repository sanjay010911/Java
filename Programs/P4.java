import java.io.*;
class Person
{
    int age;
    String name;

    public void setPerson(int a,String h)
    {
        age=a;
        name=h;
    }

    public void dispPerson()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
}
class P4
{
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        Person p,q;
        try{
            p=new Person();
            q=new Person();
            p.setPerson(20,"abcd");
            q.setPerson(30,"efgh");
            p.dispPerson();
            q.dispPerson();
        }
        catch(Exception e)
        {}
        
    }
}