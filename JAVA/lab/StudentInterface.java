import java.io.DataInputStream;
class Student
{	
	int rno;
	public void getRollno(int x)
	{
		rno=x;
	}
	public void putRollno()
	{
		System.out.println("Rollno :"+rno);
	}
}

class Test extends Student
{
	int mark1,mark2;
	public void getMarks(int x,int y)
	{
		mark1=x;
		mark2=y;
	}
	public void putMarks()
	{
		System.out.println("Test mark :"+mark1+" "+mark2);
	}
}

interface Sports
{
 	final float spmarks=6.5f;
	public void putSportMarks();
}

class Score extends Test implements Sports
{
	public void putSportMarks()
	{
		System.out.println("Sports score :"+spmarks);
	}
	public void putTotalMarks()
	{
		System.out.println("Total Marks :"+(mark1+mark2+spmarks));
	}
}

class StudentInterface{
	public static void main(String args[])
	{
		try{
		DataInputStream in=new DataInputStream(System.in);
		Score s=new Score();
		System.out.println("Enter Rollno");
		int rno=Integer.parseInt(in.readLine());
		System.out.println("Enter mark1");
		int m1=Integer.parseInt(in.readLine());
		System.out.println("Enter mark2");
		int m2=Integer.parseInt(in.readLine());
		s.getRollno(rno);
		s.getMarks(m1,m2);
		s.putRollno();
		s.putMarks();
		s.putSportMarks();
		s.putTotalMarks();
		}catch(Exception e){}
	}
}
	