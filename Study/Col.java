import java.util.*;
import java.io.*;
import java.lang.*;
class Col
{
    public static void main(String args[])
    {
        LinkedList <Integer>i1=new LinkedList<Integer>();
        i1.add(1);
        i1.add(5);
        i1.add(2);
        i1.add(7);

        Iterator itr=i1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}