import java.io.DataInputStream;
class Lower extends Thread
{
	public void run()
	{
		char L='a';
		for(int i=0;i<5;i++)
		{
			try{
			System.out.println(L);
			L++;
			sleep(2000);
			}catch(Exception e){}
		}
		
	}
}

class Upper extends Thread
{
	public void run()
	{
		char U='A';
		for(int i=0;i<5;i++)
		{
			try{
			System.out.println(U);
			U++;
			sleep(2000);
			}catch(Exception e){}
		}
		
	}
}

class LowerUpper
{
	public static void main(String args[])
	{
		try{
		DataInputStream in=new DataInputStream(System.in);
		Lower a=new Lower();
		Upper b=new Upper();
		a.start();
		b.start();
		}catch(Exception e){}
	}
}

	
		