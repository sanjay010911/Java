class Parent
{
 void disp()
 {
  System.out.println("In parent class method");
 }
}

class Child extends Parent
{
 void disp()
 {
  System.out.println("In child class method");
 }
}

class MethodOverride
{
 public static void main(String args[])
 {
  Child c=new Child();
  c.disp();
 }
}
