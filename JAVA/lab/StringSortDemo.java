import java.io.DataInputStream;
class StringSortDemo{
	public static void main(String args[])
	{
		try{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter how many strings");
		int n=Integer.parseInt(in.readLine());
		String cars[]=new String[n];
		System.out.println("enter "+n+" car names :");
		for(int i=0;i<n;i++)
			cars[i]=in.readLine();

		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
			{
				if(cars[j].compareTo(cars[i])<0)
				{
					String t=cars[i];
					cars[i]=cars[j];
					cars[j]=t;
				}
			}
		System.out.println("Sorted cars");
		for(int i=0;i<n;i++)
			System.out.println(cars[i]);
		}catch(Exception e){}
	}
}

/*enter how many strings
5
enter 5 car names :
porsche
lamborghini
tesla
bmw
volkswagon
Sorted cars
bmw
lamborghini
porsche
tesla
volkswagon */