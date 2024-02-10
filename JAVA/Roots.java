import java.io.DataInputStream;
class Roots
{
 public static void main(String args[])
 {
  try{
   DataInputStream r=new DataInputStream(System.in);
   System.out.print("Enter a");
   int a=Integer.parseInt(r.readLine());
   System.out.print("Enter b");
   int b=Integer.parseInt(r.readLine());
   System.out.print("Enter c");
   int c=Integer.parseInt(r.readLine());
   int r1,r2;
   int d=b*b-(4*a*c);
   if(d>0)
   {
    System.out.println("roots are real and unequal");
    r1=(-b-(int)Math.sqrt(d))/(2*a);
    r2=(-b+(int)Math.sqrt(d))/(2*a);
    System.out.print("roots are:"+r1+r2);
   }
   else if(d==0)
   {
    System.out.print("roots are equal");
    r1=b/(2*a);
    r2=b/(2*a);
    System.out.print("roots are:"+r1+r2);
   }
   else 
      System.out.print("roots are imaginary");
  }catch(Exception e){}
 } 
}
   