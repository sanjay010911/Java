import java.io.*;
class Java31
{
	public static int reverse(int n)
	{
		int temp=n;
		int rev=0,d;
		while(temp!=0)
		{
			d=temp%10;
			rev=(rev*10)+d;
			temp=temp/10;
		}
		return rev;
	}
	public static int palindrome(int n)
	{
		if(n==reverse(n))
			return 1;
		else
			return 0;
	}
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter a number");
			int a=Integer.parseInt(in.readLine());
			if(palindrome(a)==1)
				System.out.println("Integer is palindrome");
			else
				System.out.println("Integer is not palindrome");
		}catch(Exception e){}
	}
}
		
