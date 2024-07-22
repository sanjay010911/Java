class Outer
{
    // private int j;
    // public Outer(int u)
    // {
    //     j=u;
    // }

    class Inner
    {
        public void disp()
        {
            System.out.println("Within inner class");
        }
    }
}
class OuterD
{
    public static void main(String args[])
    {
        Outer o=new Outer();
        Outer.Inner g=o.new Inner();
        g.disp();
    }
}