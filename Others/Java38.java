import java.io.*;
class Java38
{
	public static void sum()
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter n");
			int n=Integer.parseInt(in.readLine());
			int sum=0,i=1,c=0; 
			while(c<n)
			{
				if(i%2==0)
				{
					sum=sum+i;
					c++;
				}
				i++;
			}
			System.out.println("Sum of "+n+" even numbers is : "+sum);
		}catch(Exception e){}
	}
	public static void main(String args[])
	{
		sum();
	}
}