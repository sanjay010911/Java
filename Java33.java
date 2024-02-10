import java.io.*; 
class Java33 
{ 
	public static void main(String args[]) 
	{ 
	    DataInputStream din;
        int i = 1,j,sum=0,n;    
        din = new DataInputStream(System.in);
        try 
        {  
            System.out.println("Enter the value of n : "); 
            n=Integer.parseInt(din.readLine()); 
            while (i <= n) 
            { 
                j = 1; 
                int innerSum = 0; 
                while (j <= i) 
                { 
                    innerSum += j; 
                    j++; 
                } 
                sum += innerSum; 
                i++; 
            } 
            System.out.println("The sum of the series is: " + sum); 
        }
        catch(Exception e) 
        { 
            System.out.println("Error: " + e); 
        } 
    } 
}
