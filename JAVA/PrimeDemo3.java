import pack.CheckPrime;
import java.io.DataInputStream;
class PrimeDemo3
{
	public static void main(String args[])
	{
		try{
		DataInputStream in=new DataInputStream(System.in);
		CheckPrime c=new CheckPrime();
		int digit,rev=0,num;
		System.out.println("enter a number");
		int n=Integer.parseInt(in.readLine());
		if(c.check(n)==1)
		{
			System.out.println("number is prime");
			num=n;
			while(num>0)
			{
				digit=num%10;
				rev=rev*10+digit;
				num=num/10;	
			}
			if(c.check(rev)==1)
				System.out.println("number is mirror prime");
		}
		else
			System.out.println("number is not prime");
		}catch(Exception e){}
	}
}