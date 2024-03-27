import java.io.*;
class Java36
{
	public static void reverse(int n)
	{
		int rev=0;
		int d,temp=n;
		while(temp!=0)
		{
			d=temp%10;
			rev=rev*10+d;
			temp=temp/10;
		}
		System.out.println(rev);
	}
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter m");
			int m=Integer.parseInt(in.readLine());
			reverse(m);
		}catch(Exception e){}
	}
}