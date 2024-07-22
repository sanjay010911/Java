import java.io.*;
class Student implements Serializable
{
    transient int rno;
    String sr;
    public Student(int rno,String sr)
    {
        this.rno=rno;
        this.sr=sr;
    }
}
class SerialD
{
    public static void main(String args[])
    {
        ObjectOutputStream out;
        ObjectInputStream in;
        FileOutputStream fout;
        FileInputStream fin;
        try{
            fout=new FileOutputStream("D:/SanjayJava/Programs/Student.txt");
            Student s=new Student(45,"badass");
            out=new ObjectOutputStream(fout);
            out.writeObject(s);


            //
            fin=new FileInputStream("D:/SanjayJava/Programs/Student.txt");
            in=new ObjectInputStream(fin);
            Student b=(Student)in.readObject();
            System.out.println(b.rno);
            System.out.println(b.sr);

        }
        catch(Exception e){}   
    }
}