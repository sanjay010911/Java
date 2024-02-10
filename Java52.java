import java.io.*;
class employee
{
	int eno;
	String ename;
	int esal;

	public void read()
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter the eno");
			eno=Integer.parseInt(in.readLine());
			System.out.println("Enter the name");
			ename=in.readLine();
			System.out.println("Enter the salary");
			esal=Integer.parseInt(in.readLine());
		}catch(Exception e){}
	}
	public void disp()
	{
		
			System.out.println("Employee No :"+eno);
			System.out.println("Employee Name :"+ename);
			System.out.println("Employee Salary :"+esal);
	}
}

class Java52
{
	public static void main(String args[])
	{
		employee emp[];
		int i,flag=0,n;
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter the number of employees");
			n=Integer.parseInt(in.readLine());
			emp=new employee[n];
			for(i=1;i<=n;i++)
			{
				System.out.println("Enter the details of employee "+i);
				emp[i].read();
			}
			System.out.println("Enter the eno to search");
			n=Integer.parseInt(in.readLine());
			for(i=1;i<=n;i++)
			{
				if(emp[i].eno==n)
				{
					flag=1;
					System.out.println("Employee Found");
					emp[i].disp();
					break;
				}
			}
			if(flag==0)
				System.out.println("Employee Not Found");
		}
		catch(Exception e){}
	}
}
		
		
		
		