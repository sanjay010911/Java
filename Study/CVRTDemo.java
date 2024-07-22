import java.io.*;
class Parent
{
    public Object show()
    {
        System.out.println("Inside parent method");
        return new Object();
    }
}

class Child extends Parent
{
    public Child show()
    {
        System.out.println("Inside child method");
        return new Child();
    }
}

class CVRTDemo
{
    public static void main(String args[])
    {
        Child c=new Child();
        c.show();
    }
}