import java.io.*;
import java.awt.*;
import java.awt.event.*;
class ChDemo extends Frame implements ItemListener
{
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;
    public ChDemo()
    {
        cbg=new CheckboxGroup();
        c1=new Checkbox("ABC",cbg,true);
        c2=new Checkbox("DEF",cbg,false);
        c3=new Checkbox("HIJ",cbg,false);
        setLayout(new FlowLayout());
        add(c1);
        add(c2);
        add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setSize(300,300);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie)
    {

    }
}

class CheckBoxDemo
{
    public static void main(String args[])
    {
        ChDemo p=new ChDemo();
    }
}   
