import pack.Math;
import java.io.DataInputStream;
class Calculator
{
  public static void main(String args[])
  { 
    try{
    DataInputStream in=new DataInputStream(System.in);
    int ch;
    Math s=new Math();
    do
    {
	System.out.println("enter the choice 1-Addition 2-Substraction 3-Multiply 4-Divide 5-Remainder 6-Exit");
	ch=Integer.parseInt(in.readLine());
	System.out.println("enter two numbers");
	int n1=Integer.parseInt(in.readLine());
	int n2=Integer.parseInt(in.readLine());
	if(ch==1)
	 System.out.println("sum is"+s.add(n1,n2));
	else
	 if(ch==2)
	 System.out.println("difference is"+s.sub(n1,n2));
 	else
	 if(ch==3)
	 System.out.println("product is"+s.mul(n1,n2));
	else
	 if(ch==4)
	 System.out.println("quotient is"+s.div(n1,n2));
	else
	 if(ch==5)
	   System.out.println("remainder is"+s.mod(n1,n2));
   }while(ch!=6); 
 }catch(Exception e){}
}
}