import java.io.*;
class Java32
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter m");
			int m=Integer.parseInt(in.readLine());
			System.out.println("Enter n");
			int n=Integer.parseInt(in.readLine());
			int i,j;
			if(m<n)
			{
				i=m;
				j=n;
			}
			else
			{
				i=n;
				j=m;
			}
			while(i<=j)
			{
				System.out.print(" "+i);
				i++;
			}
		}catch(Exception e){}
	}
}
			
			
				