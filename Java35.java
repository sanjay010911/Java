import java.io.*;
class Java35
{
	public static void area()
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			System.out.println("Enter the radius");
			int r=Integer.parseInt(in.readLine());
			System.out.println("Area of Circle is :"+(3.14*r*r));
		}catch(Exception e){}
	}
	public static void main(String args[])
	{
		area();
	}
}