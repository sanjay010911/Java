import java.io.DataInputStream;
class Student
{
	int rno,att;
	String name,crs;
	public void readValue(int x,int y,String a,String b)
	{
  		rno=x;
		att=y;
		name=a;
		crs=b;
	}
	public void getValue() 
	{ 
		System.out.println("NAME : "+name);
		System.out.println("Roll No :"+rno);
		System.out.println("Attendance :"+att); 
	}
}

interface Department
{ 
 	//String course;
 	public void get();
}

class exam extends Student implements Department
{
 
 	public void get()
	{
		//course=crs;
		System.out.println("Course :"+crs);
	}
	public float calcAtt()
	{
		float attpercent=((float)att/200)*100;
		return attpercent;
	}
 
	public void boolEligible()
	{
		if(calcAtt()>=70)
			System.out.println("Eligible");
		else
			System.out.println("Not Eligible");
	}

}
 

class Eligible
{
	public static void main(String args[])
	{
		try{
   		DataInputStream in=new DataInputStream(System.in);
   		exam e= new exam();
   		System.out.println("Enter the name");
   		String s=in.readLine();
   		System.out.println("enter the rollno");
   		int rn=Integer.parseInt(in.readLine());
   		System.out.println("enter the attendance");  
   		int at= Integer.parseInt(in.readLine());
   		System.out.println("Enter the course");
   		String c=in.readLine();
   		e.readValue(rn,at,s,c);
  		e.getValue();
		e.get();
   		e.boolEligible();
  		}catch(Exception e){}
 	}
}