class MulTwo extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{
			System.out.println("2*"+i+"="+2*i);
			sleep(1500);
			}catch(Exception e){}
		}
	}
}

class MulFive extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{
			System.out.println("5*"+i+"="+5*i);
			sleep(1500);
			}catch(Exception e){}
		}
	}
}

class MulSeven extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{
			System.out.println("7*"+i+"="+7*i);
			sleep(1500);
			}catch(Exception e){}
		}
	}
}

class MulTable
{
	public static void main(String args[])
	{
		MulTwo a=new MulTwo();
		MulFive b=new MulFive();
		MulSeven c=new MulSeven();
		a.start();
		b.start();
		c.start();
	}
}

	
	