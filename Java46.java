import java.io.*;

class Java46
{
	public static void dispEven(int n)
	{
		int i=1;
		while(i<=n)
		{
			if(i%2==0)
				System.out.print(i+" ");
			i++;
		}
	}
			
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("enter n");
			int n=Integer.parseInt(in.readLine());
			dispEven(n);
		}catch(Exception e){}
	}
}
