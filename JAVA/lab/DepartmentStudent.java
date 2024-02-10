import java.io.DataInputStream;
interface Department
{
 	final String deptname="bca";
	final String depthead="joji";
	abstract void showData();	
}

class Hostel
{
	String hname;
	String hloc;
	int noofrooms;
	public void read(String name,String loc,int n)
	{
		hname=name;
		hloc=loc;
		noofrooms=n;
	}
	public void print()
	{
		System.out.println("Hostel Name :"+hname);
		System.out.println("Hostel location :"+hloc);
		System.out.println("No of Rooms"+noofrooms);
	}
}

class Student extends Hostel implements Department
{
	String studname;
	int regno;
	String elesub;
	float avgmark;
	public void showData()
	{
		System.out.println("Department :"+deptname);
		System.out.println("HOD :"+depthead);
	}
	void getData(String name,int n,String s,float m)//,String e,String d)
	{
		studname=name;
		regno=n;
		elesub=s;
		avgmark=m;
		//deptname=e;
		//depthead=d;
	}
	void displayData()
	{
		System.out.println("Student name :"+studname);
		System.out.println("Reg no :"+regno);
		System.out.println("Elective subject :"+elesub);
		System.out.println("Average mark :"+avgmark);
	}
}

class DepartmentStudent
{
	public static void main(String args[])
	{
		try{
		DataInputStream in=new DataInputStream(System.in);
		Student s=new Student();
		System.out.println("Enter student name : ");
		String studname=in.readLine();
		System.out.println("Reg no: ");
		int n=Integer.parseInt(in.readLine());
		System.out.println("enter department");
		String deptname=in.readLine();
		System.out.println("enter department head");
		String depthead=in.readLine();
		System.out.println("Enter elective subject : ");
		String elesub=in.readLine();
		System.out.println("Avg mark: ");
		int avg=Integer.parseInt(in.readLine());
		s.getData(studname,n,elesub,avg);//,deptname,depthead);
		System.out.println("enter hostel name: ");
		String hname=in.readLine();
		System.out.println("enter hostel location: ");
		String hloc=in.readLine();
		System.out.println("enter no of rooms: ");
		int noofrooms=Integer.parseInt(in.readLine());
		s.read(hname,hloc,noofrooms);
		

		s.displayData();
		s.showData();
		s.print();
		}catch(Exception e){}
	}
}
		
		
		
		