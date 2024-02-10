import java.io.*; 
class Java34 
{ 
    static long factorial(int num)  
    { 
       if (num == 0 || num == 1)  
        {
            return 1; 
        }  
        else 
        { 
            return num * factorial(num - 1); 
        } 
    }
	public static void main(String args[]) 
	{ 
	    DataInputStream din;
        int n,i;    
	    double sum=0;
        din = new DataInputStream(System.in);
        try 
        {  
            System.out.println("Enter the value of n : "); 
            n=Integer.parseInt(din.readLine()); 
            for (i = 1; i <= n; i++)  
            { 
                sum = sum +  (double) i / factorial(i); 
            } 
            System.out.println("The sum of the series is: " + sum); 
        }
        catch(Exception e) 
        { 
            System.out.println("Error: " + e); 
        } 
    } 
}
