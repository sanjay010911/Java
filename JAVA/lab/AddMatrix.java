import java.io.DataInputStream;
class AddMatrix
{
	static int[][] read()
	{
		int a[][]={};
		try{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter the matrix size");
		int n=Integer.parseInt(in.readLine());
		System.out.println("enter the matrix");
		a=new int[n][n];
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
				System.out.print(" "+a[i][j]);
		System.out.println();
		}
	}

	static int[][] sum(int [][]a,int [][]b)
	{
		int c[][]={};
		c=new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length;j++)
				c[i][j]=a[i][j]+b[i][j];
		return c;
	}
	
	public static void main(String args[])
	{
		int a[][]={},b[][]={},c[][]={};
		a=read();
		b=read();
		System.out.println("sum of matrix is :");
		c=sum(a,b);
		display(c);
	}

}
		
			