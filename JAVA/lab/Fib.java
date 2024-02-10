class Fib{
public static void main(String args[])
{
 int f0=0;
 int f1=1;
 int f3;
 int n=Integer.parseInt(args[0]);
 if(n>1)
 {
  System.out.println(f0);
  System.out.println(f1);
  for(int i=3;i<=n;i++)
   {
    f3=f0+f1;
    System.out.println(f3);
    f0=f1;
    f1=f3;
   }
 }
 else
  System.out.println(f0);  
}
}