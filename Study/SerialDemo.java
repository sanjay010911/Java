import java.io.*;
class Student implements Serializable
{
    transient String name;
    transient int age;
    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

}

class SerialDemo
{
    public static void main(String args[])
    {
        try{
        Student s=new Student("blaze",40);
        FileOutputStream fout=new FileOutputStream("abcd.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(s);


        FileInputStream fin=new FileInputStream("abcd.txt");
        ObjectInputStream in=new ObjectInputStream(fin);
        Student b=(Student)in.readObject();
        System.out.println(b.name);
        System.out.println(b.age);
        }catch(Exception e){}
    }
}