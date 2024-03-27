import java.io.*;
interface i1
{
	public void disp();
}

class c1 implements i1
{
	public void disp()
	{
		System.out.println("In c1 disp");
	}
}

class c2 implements i1
{
	public void disp()
	{
		System.out.println("In c2 disp");
	}
}

class Main
{
	public static void main(String args[])
	{
		i1 obj[]=new i1[3];
		obj[0]=new c1();
		obj[1]=new c2();
		obj[2]=new c1();
		for(int i=0;i<3;i++)
		{
			
				obj[i].disp();
			
		}
	}
}
				
		
		