/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.HashSet;
import java.util.Set;
public class LCSWR
{
	public static void main(String[] args) {
		String s="geeksforgeeks";
		int c=0;
		Set<Character> set=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
		    if(set.contains(s.charAt(i)))
		    {
		        continue;
		    }
		  
		    else
		    {
		        set.add(s.charAt(i));
		        c++;
		        
		    }
		        
		}
		
		System.out.println("Longest is :"+c);
	}
}
