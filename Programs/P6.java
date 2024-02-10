import java.io.*;
class Complex
{
	int r;
	int i;
	public void read(int r,int i)
	{
		this.r=r;
		this.i=i;
	}
	public void display()
	{
		System.out.println(r+"+"+i+"i");
	}
	public Complex add(Complex x)
	{
		Complex f=new Complex();;
		f.r=r+x.r;
		f.i=i+x.i;
		return f;
	}
	public Complex mul(Complex x)
	{
		Complex f=new Complex();
		f.r=r*x.r-i*x.i;
		f.i=r*x.i+i*x.r;
		return f;
	}
}

class P6
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		try{
			Complex c1=new Complex();
			Complex c2=new Complex();
			Complex c3=new Complex();
			System.out.println("enter the complex 1");
			System.out.println("enter the real part");
			int r=Integer.parseInt(in.readLine());
			int i=Integer.parseInt(in.readLine());
			c1.read(r,i);

			System.out.println("enter the complex 2");
			System.out.println("enter the real part");
			r=Integer.parseInt(in.readLine());
			i=Integer.parseInt(in.readLine());
			c2.read(r,i);

			System.out.print("Complex 1 is : ");
			c1.display();
			System.out.print("Complex 2 is : ");
			c2.display();
			c3=c1.add(c2);
			System.out.print("Added Complex is : ");
			c3.display();
			c3=c1.mul(c2);
			System.out.print("Multiplied Complex is : ");
			c3.display();
			
		}catch(Exception e){}
	}
}