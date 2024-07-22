import java.io.*;
import java.awt.*;
import java.awt.event.*;
class Flow extends Frame implements ActionListener
{
    public Flow()
    {
        Button b1,b2,b3,b4;
        b1=new Button("NORTH");
        b2=new Button("SOUTH");
        b3=new Button("WEST");
        b4=new Button("EAST");
        setLayout(new GridLayout(2,2));
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setSize(300,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        System.exit(0);
    }
}
class FlowDemo
{
    public static void main(String args[])
    {
        Flow f=new Flow();
    }
}