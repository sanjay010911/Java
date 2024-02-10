import java.io.DataInputStream;
class AgeNotWithinRangeException extends Exception
{
	public AgeNotWithinRangeException()
	{
		super();
	}
}
class NameNotValidException extends Exception
{
	public NameNotValidException()
	{
		super();
	}
}

class Student
{
	
	public static void checkAge(int age) throws AgeNotWithinRangeException
	{
		try{
		if((age<15)||(age>20))
			throw new AgeNotWithinRangeException();
		}catch(AgeNotWithinRangeException e)
		{
			System.out.println("Age is not within limit :"+e);
			System.exit(0);
		}
	}
	public static void checkName(String name) throws NameNotValidException
	{
		try{
		for(int i=0;i<name.length();i++)
		{
			if(Character.isLetter(name.charAt(i))==false)
				throw new NameNotValidException();
		}
		}
		catch(NameNotValidException e)
		{
			System.out.println("Name not valid :"+e);
			System.exit(0);
		}
	}
	public static void main(String args[])
	{	
		try{
		DataInputStream in= new DataInputStream(System.in);
		System.out.println("enter the name");
		String name=in.readLine();
		checkName(name);
		System.out.println("enter the rollno");
		int rl=Integer.parseInt(in.readLine());
		System.out.println("enter the age");
		int age=Integer.parseInt(in.readLine());
		checkAge(age);
		System.out.println("enter the course");
		String crs=in.readLine();
		}catch(Exception e)
		{}
	}
}
		
		
		
		
			
			
	
			
			