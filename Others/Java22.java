import java.io.*;
class Java22
{
	public static void main(String args[])
	{
		int n1,n2,n3,min=0;
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter no1");
			n1=Integer.parseInt(in.readLine());
			System.out.println("Enter no2");
			n2=Integer.parseInt(in.readLine());
			System.out.println("Enter no3");
			n3=Integer.parseInt(in.readLine());
			min=Math.min(Math.min(n1,n2),n3);
			System.out.println("Smallest is :"+min);
					
		}catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}