import java.io.*;
class Java25
{
	public static void main(String args[])
	{
		int a[][]={};
		int n,temp,i,j,sumr,b[]={};
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter the size of array");
			n=Integer.parseInt(in.readLine());
			a=new int[n][n];
			b=new int[n];
			System.out.println("Enter the array");
			for(i=0;i<n;i++)
				b[i]=0;
			for(i=0;i<n;i++)
				for(j=0;j<n;j++)
				{
					a[i][j]=Integer.parseInt(in.readLine());
					b[j]=b[j]+a[i][j];
				}
			
			System.out.println("2D Matrix");
			for(i=0;i<n;i++)
			{
				sumr=0;
				for(j=0;j<n;j++)
				{
					System.out.print(a[i][j]+" ");
					sumr=sumr+a[i][j];
				}
				System.out.print(" |"+sumr);
				System.out.println();
			}	
			for(j=0;j<n;j++)
				System.out.print(" "+b[j]);		
					
		}catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}