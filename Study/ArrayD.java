import java.util.*;
class ArrayD
{
    public static void main(String args[])
    {
        LinkedList<Integer> i1=new LinkedList<Integer>();
        i1.add(34);
        i1.add(56);
        i1.add(89);
        Iterator itr=i1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(i1);
    }
}