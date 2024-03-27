import java.io.*;
class Java14
{
	public static void main(String args[])
	{
		int n1,n2,n3,temp=0;
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter no1");
			n1=Integer.parseInt(in.readLine());
			System.out.println("Enter no2");
			n2=Integer.parseInt(in.readLine());
			System.out.println("Before swapping n1 = "+n1+" n2 = "+n2);
			temp=n1;
			n1=n2;
			n2=temp;
			System.out.println("After swapping n1 = "+n1+" n2 = "+n2);
					
		}catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}