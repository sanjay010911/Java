import java.awt.*;
import java.awt.event.*;
class MenuDemo extends Frame implements ActionListener
{
    public MenuDemo()
    {
        MenuBar mb;
        Menu f,h;
        MenuItem n,o,s,spt;
        setLayout(new FlowLayout());
        mb=new MenuBar();
        f=new Menu("File");
        h=new Menu("Help");
        n=new MenuItem("New File");
        o=new MenuItem("Open File");
        s=new MenuItem("About");
        spt=new MenuItem("Support");
        mb.add(f);
        mb.add(h);
        f.add(n);
        f.add(o);
        h.add(s);
        h.add(spt);
        spt.addActionListener(this);
        setMenuBar(mb);
        setSize(300,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        System.exit(0);
    }
}
class MenuDemo1
{
    public static void main(String args[])
    {
        MenuDemo n=new MenuDemo();
    }
}