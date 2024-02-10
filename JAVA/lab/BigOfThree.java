class BigOfThree
{
 public static void main(String args[])
 {
  int a=Integer.parseInt(args[0]);
  int b=Integer.parseInt(args[1]);
  int c=Integer.parseInt(args[2]);
  int big=a;
  if(b>big)
   big=b;
  else
  if(c>big)
   big=c;
  System.out.println("Biggest is:"+big);
 }
}
  