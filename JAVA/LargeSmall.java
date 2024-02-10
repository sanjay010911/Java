import java.io.DataInputStream;
class LargeSmall
{
 public static void main(String args[])
 {
  try{
   DataInputStream in=new DataInputream(System.in);
   System.out.println("enter n");
   int n=Integer.parseInt(in.readLine());
   int a[]=new int[n];
   System.out.println("enter the array");
   for(int i=0;i<n;i++) 
   {
     a[i]=Integer.parseInt(in.readLine());
   }
   int large=a[0];
   int small=a[0];
   for(i=0;i<n;i++)
   {
    if(a[i]>large)
      large=a[i];
    if(a[i]<small)
      small=a[i];
   }
  
   System.out.println("Large ="+large+"Small ="+small);
  }catch(Exception e){}    
 }
}  
