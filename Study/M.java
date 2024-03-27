import java.io.*;

class AgeNotValidException extends Exception
{
    String error;
    public AgeNotValidException(String err)
    {
         super(err);
    }
}

class Student
{
    int rno;
    int age;
    String name;
    String crs;

    public Student(int rno,int age,String name,String crs)
    {
        this.rno=rno;
        this.age=age;
        this.name=name;
        this.crs=crs;
    }
    void checkage()
    {
        try{
            if(age<15 || age>21 )
                throw new AgeNotValidException("InvalidAge");
        }catch(AgeNotValidException e){
            System.out.println("Error :"+e);
        }
    }


}
class M
{
    public static void main(String args[])
    {
        try{
            Student s=new Student(34,23,"sdgsdg","cs");
            s.checkage();
        }catch(Exception e){}
    }
}