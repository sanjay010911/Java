import java.io.*;
class Java41
{
	public static int fact(int n)
	{
		if(n>=1)
			return n*fact(n-1);
		else	
			return 1;
	}
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("enter a number");
			int n=Integer.parseInt(in.readLine());
			int f=fact(n);
			System.out.println("Factorial of "+n+" is :"+f);
		}catch(Exception e){}
	}
}