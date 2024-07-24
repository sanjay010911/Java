import java.util.HashSet;

public class Main
{
    public static Node head = null;

    public static class Node
    {
        public int data;
        public Node next;

        public Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    public static void push(int data)
    {
        Node new_node = new Node(data);
        if (head == null)
        {
            head = new_node;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public static void disp(Node t)
    {
        while (t != null)
        {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println(); // to add a newline after printing all nodes
    }

    public static boolean detectloop(Node temp)
    {
        HashSet<Node> s = new HashSet<>();
        while (temp != null)
        {
            if (s.contains(temp))
            {
                return true;
            }
            s.add(temp);
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) 
    {
        push(44);
        push(45);
        push(33);
        push(48);
        disp(head);    
        //head.next.next.next.next = head;

       
        System.out.println(detectloop(head));
    }
}
