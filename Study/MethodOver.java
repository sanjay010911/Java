import java.io.*;
class Student
{
	String name;
	int rollno;
	
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

class Teacher extends Student
{
	String subject;
	public void read()
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("enter the subject");
			this.subject=in.readLine();
		}catch(Exception e){}
	}
	public void disp()
	{
		System.out.println("Subject : "+subject);
	}
}

class MethodOver
{
	public static void main(String args[])
	{
		Student p=new Student();
		Teacher t=new Teacher();
		p.read();
		//p.disp();
		t.read();
		t.disp();
	}
}