import java.io.*;
class Student implements Cloneable
{
     public int rno;
     public String name;
    public Student()
    {
        rno=0;
        name="";
    }
    public Student(int rno,String name)
    {
        this.rno=rno;
        this.name=name;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
 
class ObjectCloneDemo
{
    public static void main(String args[]) throws Exception
    {
       
        Student s=new Student(123,"qwerty");
        Student d=(Student)s.clone();
        d.rno=12;
        System.out.println(s.rno);
        
        // d=(Student)s.clone();
        System.out.println("s hashcode"+s.hashCode());
        System.out.println("d hashcode"+d.hashCode());
    //     }catch(CloneNotSupportedException e){e.printStackTrace();}
     }
}