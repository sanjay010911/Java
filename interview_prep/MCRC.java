/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.HashSet;
import java.util.Set;
public class Main
{
	public static void main(String[] args) {
	    int max=0,temp;
	    char t=' ';
		String a="aaaabbcbbb";
		for(int i=0;i<a.length();i++)
		{
		    temp=0;
		    for(int j=i+1;j<a.length();j++)
		    {
		        if(a.charAt(i)!=a.charAt(j))
		            break;
		        temp++;
		    }
		    if(temp>max)
		    {
		        max=temp;
		        t=a.charAt(i);
		    }
		}
		
		System.out.println("Longest character : "+t);
	}
}
