import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
class P extends Frame implements ActionListener
{
    TextField tf;
    Panel p;
    Panel k;
    Button b[]=new Button[10];

    public P()
    {
    p=new Panel();
    p.setLayout(new FlowLayout());
    tf=new TextField(10);
    p.add(tf);
    int i=0;
    k=new Panel();
    k.setLayout(new GridLayout(4,4));
    while(i<=9)
    {
        b[i]=new Button(String.valueOf(i));
        k.add(b[i]);
        b[i].addActionListener(this);
        i++;
    }
    add(k);
    add(p);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {

    }
}
class PanelDemo
{
    public static void main(String args[])
    {
        P l=new P();
    }
}
