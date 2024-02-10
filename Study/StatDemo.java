import java.io.*;
class Student
{
	static String name;
	static int rollno;
	
    static{
        name="NULL";
        rollno=0;
    }
	public void read()
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("enter the name and rollno");
			this.name=in.readLine();
			this.rollno=Integer.parseInt(in.readLine());
		}catch(Exception e){}
	}
	public void disp()
	{
		System.out.println("Name : "+name+" rollno: "+rollno);
	}
}
class StatDemo
{
    public static void main(String args[])
    {
        Student a=new Student();
        a.disp();
        a.read();
        a.disp();
    }
}