import pack.CheckPrime;
import java.io.DataInputStream;
class PrimeDemo
{
	public static void main(String args[])
	{
		try{
		DataInputStream in=new DataInputStream(System.in);
		CheckPrime c=new CheckPrime();
		int sum=0,i=0;
		System.out.println("enter a number");
		int n=Integer.parseInt(in.readLine());
		if(c.check(n)==1)
		{
			System.out.println("enter the order of matrix");
			int o=Integer.parseInt(in.readLine());
			int a[][]=new int[o][o];
			System.out.println("enter the matrix");
			for(i=0;i<o;i++)
				for(int j=0;j<o;j++)
					a[i][j]=Integer.parseInt(in.readLine());
			for(i=0;i<o;i++)
				sum=sum+a[i][i];
			if(c.check(sum)==1)
				System.out.println("Sum is "+sum+" sum of diagonal is prime");
			else
				System.out.println("Sum is "+sum+" sum of diagonal is not prime");
		}
		else
			System.out.println("Number is not Prime");
		}catch(Exception e){}
	}
}
			
		
				
				
			
			
		