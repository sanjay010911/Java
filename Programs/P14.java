import java.io.*;
interface i1
{
    public void disp();
    public void print();
}

class c1 implements i1
{
    public void disp()
    {
        System.out.println("Interface disp");
    }
    public void print()
    {
        draw();
        System.out.println("interface print");
    }
    public void draw()
    {
        System.out.println("Draw not in Interface");
    }
}

class P14
{
    public static void main(String args[])
    {
        c1 obj=new c1();
        obj.disp();
        obj.print();
    }
}