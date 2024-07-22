import java.io.*;
import java.util.*;
class ArrayListDemo
{
    public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("hiii");
        Iterator i=al.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());

        }

        List l=new ArrayList();
        l.add(new Integer(11));
        l.add(new Float(35.3432));
        i=l.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());

        }
        System.out.println(new ArrayListDemo().toString());
    }

}