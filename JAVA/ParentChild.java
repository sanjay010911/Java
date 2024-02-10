class parent
{
 int x,y; 
 parent(int x,int y)
 {
  this.x=x;
  this.y=y;
  System.out.print("in parent class constructor");
 }
}

class child extends parent
{
 int z;
 child(int x,int y,int z)
 {
  super(x,y);
  this.z=z;
  System.out.print("in child class constructor");
 }
 
}

class ParentChild
{
 public static void main(String args[])
 {
  child s=new child(12,17,18);
  System.out.println("x= "+s.x+"y= "+s.y+"z= "+s.z);
}
 }

 