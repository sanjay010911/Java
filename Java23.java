import java.io.*;
class Java23
{
	public static void main(String args[])
	{
		int a[]={};
		int n,s,i,flag=0;
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter the size of array");
			n=Integer.parseInt(in.readLine());
			a=new int[n];
			System.out.println("Enter the array");
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(in.readLine());
			}
			System.out.println("Enter the value to search");
			s=Integer.parseInt(in.readLine());
			for(i=0;i<n;i++)
			{
				if(a[i]==s)
				{
					System.out.println("Element found at "+i+" position");
					flag=1;	
					break;
				}
			}
			if(flag==0)
				System.out.println("Element not found");
					
		}catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}