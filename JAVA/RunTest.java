class RunInterfaceDemo implements Runnable
{
	public void run()
	{
		for(int i=1;i<4;i++)
		{
			System.out.println("Thread X"+i);
			System.out.println("End of Thread X");
		}
	}
}

class RunTest
{
	public static void main(String args[])
	{
		RunInterfaceDemo n=new RunInterfaceDemo();
		Thread x=new Thread(n);
		x.start();
	}
}
		