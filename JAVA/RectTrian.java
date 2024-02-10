import java.io.DataInputStream;
abstract class Figure
{
 int length;
 int breadth;
 int height;
  abstract int area();
 void getData(int b,int h,int l)
 {
  length=l;
  breadth=b;
  height=h;
 }
 void display()
 {
  System.out.println("Length is: "+length);
  System.out.println("Breadth is: "+breadth);
  System.out.println("Height is: "+height);
 }

}

class Rectangle extends Figure
{
 int area()
 {
  return (length*breadth);
 }
}

class Triangle extends Figure
{
 int area()
 {
  return ((breadth*height)/2);
 }
}

class RectTrian
{
 public static void main(String args[])
 {
  try{
 
  DataInputStream in=new DataInputStream(System.in);
  int ch,l,b,h;
  Rectangle r=new Rectangle();
  Triangle t=new Triangle();
  do
  {
  System.out.println("Enter choice 1-Triangle 2-Rectangle 3-Exit");
  ch=Integer.parseInt(in.readLine());
  switch(ch)
  {
   case 1:
   {
   System.out.println("Enter breadth and height :");
   b=Integer.parseInt(in.readLine());
   h=Integer.parseInt(in.readLine());
   t.getData(b,h,0);
   t.display();
   System.out.println("Area of Triangle is :"+t.area());
    break;
   }
   case 2:
   {
    System.out.println("Enter length breadth :");
    l=Integer.parseInt(in.readLine());
    b=Integer.parseInt(in.readLine());
    r.getData(b,0,l);
    r.display();
    System.out.println("Area of Rectangle is :"+r.area());
    break;
   }
   case 3: break;
   default: System.out.println("Invalid Choice");
        
  }
 }while(ch!=3);  
}catch(Exception e){}
}
}
  