import java.io.DataInputStream;
class PeriArea
{
 int length,breadth;
 void getData(int l,int b)
 {
  length=l;
  breadth=b;
 }
 int getArea()
 {
  return (length*breadth);
 }
 int getPmtr()
 {
    return (2*(length+breadth));
 }
}


class Rectangle
{
 public static void main(String args[])
 {
  try
  {
  DataInputStream m=new DataInputStream(System.in);
  PeriArea n=new PeriArea();
  System.out.print("enter length");
  int l=Integer.parseInt(m.readLine());
  System.out.print("enter breadth");
  int b=Integer.parseInt(m.readLine());
  n.getData(l,b);
  int c=n.getArea();
  System.out.println("Area is :"+c);
  c=n.getPmtr();
  System.out.print("Perimeter is :"+c);
  }catch(Exception e){}
 }
}
  
  
 