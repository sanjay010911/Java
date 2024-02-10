import java.io.DataInputStream;
class Exception1
{
	static void excep() throws IllegalArgumentException
	{
		throw new IllegalArgumentException("Answer is zero");
	}
	public static void main(String args[])
	{
		try{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter two numbers");
		int n1=Integer.parseInt(in.readLine());
		int n2=Integer.parseInt(in.readLine());	
		if((n1==0)||(n2==0))
			excep();
		else
		{
			int prod=n1*n2;
			System.out.println("Product is : "+prod);
		}
		}catch(IllegalArgumentException e)
		{
		System.out.println("Exception caught:"+e);
		}
		catch(Exception e){}
		
	}
}