import java.io.DataInputStream;
class ProductMatrix
{
	static int[][] read()
	{
		int a[][]={};
		try{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter the size of matrix");
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
	static int[][] product(int [][]a,int [][]b)
	{
		int c[][]={};
		c=new int[a.length][a.length];
		for(int i=0;i<a.length;i++)        
			for(int j=0;j<b.length;j++) 
			{       
				c[i][j]=0;    
				for(int k=0;k<b.length;k++)        
					c[i][j]+=a[i][k]*b[k][j];    
		        }          
		return c;
	}
	
	static int[][] scalar(int[][] a)
	{
		try{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter the value the value to be multiplied");
		int n=Integer.parseInt(in.readLine());
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length;j++)
				a[i][j]=n*a[i][j];
		}catch(Exception e){}
		return a;
	}

	public static void main(String args[])
	{
		int a[][]={},b[][]={},c[][]={},d[][]={};
		try{
		DataInputStream in=new DataInputStream(System.in);
		a=read();
		b=read();
		System.out.println("product of matrix is :");
		c=product(a,b);
		display(c);
		System.out.println("enter the matrix to be multiplied with a constant 1= Matrix 1 2= Matrix 2");
		int ch=Integer.parseInt(in.readLine());
		if(ch==1)
			d=scalar(a);
		else
			d=scalar(b);
		display(d);
		}catch(Exception e){}
	}
}
			
	