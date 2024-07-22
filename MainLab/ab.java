import java.io.*;
class Student implements Serializable
{
     transient int a;
   String name;
    public Student(int a,String s)
    {
        this.a=a;
        this.name=s;
    }
    public void display()
    {
        System.out.println(a);
    }
}

class Serial
{
    public static void main(String args[])
    {
        try{
            Student s=new Student(56,"sanjay");
            FileOutputStream fout=new FileOutputStream("D:/SanjayJava/MainLab/abc.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s);

            //Deserial
            Student b;
            FileInputStream fin=new FileInputStream("D:/SanjayJava/MainLab/abc.txt");
            ObjectInputStream oin=new ObjectInputStream(fin);
            b=(Student)oin.readObject();


            System.out.println(b.name+" "+b.a);
        }catch(Exception e){}
    }
}
import java.util.*;
import java.io.*;
class Direc
{
    public static void dCall(String b)
    {
        
        File f=new File(b);
        String s[];
        s=f.list();
        for(int i=0;i<s.length;i++)
        {
            File d=new File(b+s[i]+"/");
            if(d.isDirectory())
                dCall(b+s[i]+"/");

            else
                System.out.println(b+s[i]+"/");
        }
    }
    public static void main(String args[])
    {
        dCall("D:/SanjayJava/");
    }
}