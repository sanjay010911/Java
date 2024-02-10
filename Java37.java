import java.io.*;
class Java37
{
	public static int sum(int n)
	{
		int sum=0;
		int d,temp=n;
		while(temp!=0)
		{
			d=temp%10;
			sum=sum+d;
			temp=temp/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter m");
			int m=Integer.parseInt(in.readLine());
			System.out.println("Sum of digits of "+m+" is : "+sum(m));
		}catch(Exception e){}
	}
}