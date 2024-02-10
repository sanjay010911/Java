import java.io.DataInputStream;
import pack.Sum2;
class SumDemo
{
public static void main(String args[])
{
	try{
	DataInputStream in=new DataInputStream(System.in);
	Sum2 s=new Sum2();
	System.out.println("enter two number");
	int a=Integer.parseInt(in.readLine());
	int b=Integer.parseInt(in.readLine());
	System.out.println(s.sum(a,b));
	}catch(Exception e){}
}
}