import java.io.DataInputStream;
class Sum
{
 public static void main(String args[])
 {
  try
  {
   DataInputStream s=new DataInputStream(System.in);
   System.out.print("enter a number");
   int n=Integer.parseInt(s.readLine());
   int m=n,count=1,sum=0,digit;
   do
    {
     digit=m%10;
     sum=sum+digit;
     count++;
     m=m/10;
    }
    while(m>0);
   count--;
   System.out.println("Sum is :"+sum+"count is :"+count);
   }catch(Exception e){}
  
 }
}