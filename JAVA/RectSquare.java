import java.io.DataInputStream;
class Rectangle
{
 int length;
 int breadth;
 void getData(int l,int b)
 {
  this.length=l;
  this.breadth=b;
 }
 void getData(int l)
 {
   this.length=l;
 }
 int getArea(int l,int b)
 {
  return (length*breadth);
 }
 int getArea(int l)
 {
  return (length*length);
 }
}

class RectSquare{
public static void main(String args[])
{
 int ch=0;
 
 try
 {
  Rectangle s=new Rectangle();
  DataInputStream in=new DataInputStream(System.in);
 
  do
  {
   System.out.println("Enter choice:");
   System.out.println("1=Square,2=Rectangle,3=Exit");
   ch=Integer.parseInt(in.readLine());
   switch(ch)
   {
    case 1:
    {
     System.out.print("Enter the length");
     int l=Integer.parseInt(in.readLine());
     s.getData(l);
     int a=s.getArea(l);
     System.out.print("Area is: "+a);
     break;
    }
    case 2:
    {
     System.out.print("Enter the length and breadth");
     int l=Integer.parseInt(in.readLine());
     int b=Integer.parseInt(in.readLine());
     s.getData(l,b);
     int a=s.getArea(l,b);
     System.out.print("Area of rectangle is: "+a);
     break;
    }
    case 3:
    {
     break;
    }
    default: 
       {
        System.out.println("Invalid choice");
        break;
       }
   }    
  }while(ch!=3);
 }catch(Exception e){}   
} 
}   
 
 