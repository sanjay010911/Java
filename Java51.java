import java.io.*;
class Teacher
{
	String tdept;
	String tname;
	
	public void display()
	{
		System.out.println("Teacher Dept :"+tdept);
		System.out.println("Teacher Name :"+tname);
	}
}
class Student extends Teacher
{
	String sname;
	int rno;
	public void read()
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter the name of teacher");
			tname=in.readLine();
			System.out.println("Enter the name of department");
			tdept=in.readLine();
			System.out.println("Enter the name of student");
			sname=in.readLine();
			System.out.println("Enter the rollno of student");
			rno=Integer.parseInt(in.readLine());
		}catch(Exception e){}
	}
	public void display()
	{
		System.out.println("Student Name :"+sname);
		System.out.println("Student Rno :"+rno);
	}	
}

class Java51
{
	public static void main(String args[])
	{
		 Student s=new Student();
		 s.read();
		 s.display();
	}
}
		



		