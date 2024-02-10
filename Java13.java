import java.io.*;
class Java13
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter no1");
			int n1=Integer.parseInt(in.readLine());
			System.out.println("Enter no2");
			int n2=Integer.parseInt(in.readLine());
			System.out.println("Sum of "+n1+" and "+n2+" is "+(n1+n2));
		}catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}
		