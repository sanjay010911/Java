import java.io.*;
class Java24
{
	public static void main(String args[])
	{
		int a[]={};
		int n,temp,i,j;
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
			for(i=0;i<n-1;i++)
				for(j=i+1;j<n;j++)
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
			System.out.println("Sorted array");
			for(i=0;i<n;i++)
			{
				System.out.print(" "+a[i]);
			}
					
					
		}catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}