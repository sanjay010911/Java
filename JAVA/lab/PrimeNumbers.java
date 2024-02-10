class PrimeNumbers{
 public static void main(String args[])
 {
  int m=Integer.parseInt(args[0]);
  int n=Integer.parseInt(args[1]);
  for(int i=m;i<=n;i++)
  {
   int k=(int)Math.sqrt(i);
   int flag=0;
   for(int j=2;j<=k;j++)
   {
     if(i%j==0)
     {
      flag=1;
      break;
     }
   }
   if(flag==0)
   System.out.println(i);
  }
}
}