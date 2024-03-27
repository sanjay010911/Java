import java.io.*;
import java.awt.*;
import java.awt.event.*;
class CardD extends Frame implements ActionListener
{
    
    Button btn1,btn2,btn3,btn4;
    CardLayout crd;
    public CardD()
    {
        btn1=new Button("Left");
        btn2=new Button("Right");
        btn3=new Button("Top");
        btn4=new Button("Down");
        crd=new CardLayout();
        setLayout(crd);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        setSize(300,300);
        setVisible(true);
        // setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    public void actionPerformed(ActionEvent ae)
    {
        crd.next(this);
    }
}
class CardDemo
{
    public static void main(String args[])
    {
        CardD p=new CardD();
    }
}   
