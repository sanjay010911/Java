import java.io.DataInputStream;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try{
			System.out.println(i);
			sleep(1200);
			}catch(Exception e){}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try{
			System.out.println(i*i);
			sleep(1200);
			}catch(Exception e){}
		}
	}
}
class C extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try{
			System.out.println(i*i*i);
			sleep(1200);
			}catch(Exception e){}
		}
	}
}

class Threadx
{
	public static void main(String args[])
	{
		A obja= new A();
		B objb= new B();
		C objc= new C();
		obja.start();
		objb.start();
		objc.start();
	}
}