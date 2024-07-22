import java.awt.*;
import java.awt.event.*;
import java.net.*;
class Check extends Frame implements ItemListener,ActionListener
{
    Checkbox b1,b2;
    CheckboxGroup cbg;
    List l;
    Menu m,c,v;
    MenuBar mbr;
    MenuItem m1,m2;
    public Check()
    {
        cbg=new CheckboxGroup();
        b1=new Checkbox("java",cbg,true);
        b2=new Checkbox("php",cbg,false);
        mbr=new MenuBar();
        m=new Menu("1");
        c=new Menu("2");
        m1=new MenuItem("Options");
        m2=new MenuItem("Help");
        m.add(m1);
        c.add(m2);
        mbr.add(m);
        mbr.add(c);
        setMenuBar(mbr);
        l=new List();
        l.add("apple");
        l.add("orange");
        l.add("grape");
        add(b1);
        add(b2);
        add(l);
        setLayout(new FlowLayout());
        b1.addItemListener(this);
        b2.addItemListener(this);
        l.addItemListener(this);
        l.addActionListener(this);
        setVisible(true);
        setSize(300,300);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(cbg.getSelectedCheckbox()==b1)
        System.out.println("java");
        else{
            try{
             System.out.println("php");
             InetAddress ia=InetAddress.getByName("www.google.com");
             System.out.println(ia.getAddress());
            }catch(Exception e){}
        }
        if(ie.getSource()==l)
        {
            System.out.println(l.getSelectedItem());
        }
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==l)
        {
            System.out.println(l.getSelectedItem());
        }
    }

}   

class Chk{
    public static void main(String args[])
    {
        Check c=new Check();

    }
}