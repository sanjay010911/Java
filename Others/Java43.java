import java.io.*;
class Java43
{
	public static void n_to_1(int n)
	{
		if(n>=1)
		{
			System.out.print(" "+n);
			n--;
			n_to_1(n);
		}
	}
	public static void one_to_n(int n)
	{
		int temp=n;
		if(n!=1)
		{
			temp--;
			one_to_n(temp);
		}
			System.out.println(n);	
	}
	public static void main(String args[])
	{
		n_to_1(5);
		System.out.println();
		one_to_n(5);
	}
}