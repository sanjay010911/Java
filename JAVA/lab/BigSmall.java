import java.io.DataInputStream;
class BigSmall
{
	public static void main(String args[])
	{
		try{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter the number of elements");
		int n=Integer.parseInt(in.readLine());
		int a[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(in.readLine());
		}
		int big=a[0];
		int small=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>big)
				big=a[i];
			if(a[i]<small)
				small=a[i];
		}
		System.out.println("Biggest is :"+big);
		System.out.println("Smallest is :"+small);
		}catch(Exception e){}
	}
}	