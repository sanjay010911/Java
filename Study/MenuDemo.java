import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
class M extends Frame implements ActionListener,ItemListener
{
    List l;
    Choice c;
    Button b1,b2;
    String s;
    public M()
    {
        setLayout(new FlowLayout());
        l=new List(4);
        l.add("one");
        l.add("two");
        l.add("three");
        b1=new Button(">>");
        b2=new Button("<<");
        c=new Choice();
        add(l);
        add(b1);
        add(b2);
        add(c);
        b1.addActionListener(this);
        b2.addActionListener(this);
        l.addActionListener(this);
        c.addItemListener(this);
       
        setSize(400,400);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
            s=l.getSelectedItem();
        if(ae.getActionCommand().equals(">>"))
            c.add(s);
        else if(ae.getActionCommand().equals("<<"))
            l.add(s);
    }
    public void itemStateChanged(ItemEvent ie){
        s=c.getSelectedItem();

    }
}
class MenuDemo
{
    public static void main(String args[])
    {
        M m=new M();
    }
}