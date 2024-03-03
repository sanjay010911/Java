import java.io.*;
class DeSerialDemo
{
    public static void main(String args[]) throws Exception
    {
        Student s=null;
        FileInputStream fin=new FileInputStream("a.txt");
        ObjectInputStream obj=new ObjectInputStream(fin);
        s=(Student)obj.readObject();
        System.out.println("Name :"+s.name);
        System.out.println("age :"+s.age);

    }
}
