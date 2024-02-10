import java.io.DataInputStream;
class Sum
{
 int a,b;
 void getNum(int c,int d)
 {
  a=c;
  b=d;
 }
 int getSum()
 {
  return (a+b);
 }
}

class SumOfTwo
{
 public static void main(String args[])
 {
  try{
  DataInputStream in=new DataInputStream(System.in);
  Sum n=new Sum();
  System.out.print("enter two numbers:");
  int a=Integer.parseInt(in.readLine());
  int b=Integer.parseInt(in.readLine());
  n.getNum(a,b);
  System.out.println("Sum is :"+n.getSum());
  }catch(Exception e){}
 }
}
  