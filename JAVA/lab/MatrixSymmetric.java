import java.io.DataInputStream;
class MatrixSymmetric
{
	static int[][] readMatrix()
	{
		int a[][]={};
		try{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter the size of matrix");
		int n=Integer.parseInt(in.readLine());
		a=new int[n][n];
		System.out.println("enter the matrix");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=Integer.parseInt(in.readLine());
		}catch(Exception e){}
		return a;
	}
	
	static void display(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
				System.out.print(a[i][j]);
		 System.out.println();
		}
	}
	
	static void Symmetric(int [][]a)
	{
		int flag=0;
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length;j++)
				if(a[i][j]!=a[j][i])
				{
					flag=1;
					break;
				}
		if(flag==1)
			System.out.println("matrix is not symmetric");
		else
			System.out.println("matrix is symmetric");
	}
	public static void main(String args[])
	{
		int a[][]=readMatrix();
		System.out.println("matrix is :");
		display(a);
		Symmetric(a);
	}
}
	 
