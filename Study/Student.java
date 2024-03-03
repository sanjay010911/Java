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