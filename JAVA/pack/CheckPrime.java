package pack;
public class CheckPrime
{
	public int check(int n)
	{
		int flag=1;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==0)
			return 0;
		else
			return 1;
	}
}

		