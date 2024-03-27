import java.io.*;
import java.awt.*;
import java.awt.event.*;
class Cal extends Frame implements ActionListener
{
    Button b[]=new Button[14];
    TextField tf; 
    public Cal()
    {
        int i=0;
        tf=new TextField(20);
        add(tf);
        setLayout(new GridLayout(5,5));
        while(i<=9)
        {
            b[i]=new Button(String.valueOf(i));
            i++;
        }
        i=1;
        while(i<=9)
        {
            add(b[i]);
            i++;
        }
        i=1;
        while(i<=9)
        {
            b[i].addActionListener(this);
            i++;
        }
        b[10]=new Button("CE");
        add(b[10]);
        b[10].addActionListener(this);
        b[11]=new Button("+");
        add(b[11]);
        b[11].addActionListener(this);
        b[12]=new Button("-");
        add(b[12]);
        b[12].addActionListener(this);
        b[13]=new Button("=");
        add(b[13]);
        b[13].addActionListener(this);
        
        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();
        if(!str.equals("="))
        {
            String t=tf.getText()+str;
            tf.setText(t);
        }
        else
        {
            int i=str.indexOf("+");
            int r;
            i=str.indexOf("-");
            if(str.charAt(i)=='+')
            {
                int l=str.length();
                r=Integer.parseInt(str.substring(0,i-1))+Integer.parseInt(str.substring(i+1,l-1));
                tf.setText(String.valueOf(r));
            }
            else  if(str.charAt(i)=='-')
            {
                int l=str.length();
                r=Integer.parseInt(str.substring(0,i-1))-Integer.parseInt(str.substring(i+1,l));
                tf.setText(String.valueOf(r));
            }

        }
            
       
    }
    
}
class Calculator
{
    public static void main(String args[])
    {
        Cal c=new Cal();
    }
}