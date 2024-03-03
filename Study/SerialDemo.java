import java.io.*;
class Student implements Serializable
{
    String name;
    int age;
    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

}

class SerialDemo
{
    public static void main(String args[]) throws Exception
    {
        Student s=new Student("blaze",23);
        FileOutputStream fout=new FileOutputStream("a.txt");
        ObjectOutputStream obj=new ObjectOutputStream(fout);
        obj.writeObject(s);
    }
}
