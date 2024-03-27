import java.io.*;
import java.awt.*;
import java.awt.event.*;
class M extends Frame implements MouseMotionListener,ActionListener,WindowListener
{
    TextField tf;
    Button btn;
    public M()
    {
        tf=new TextField(10);
        btn=new Button("Click me");
        setLayout(new FlowLayout());
        add(tf);
        add(btn);
        btn.addActionListener(this);
        addMouseMotionListener(this);
        addWindowListener(this);
        setSize(300,300);
        setVisible(true);
    }
    public void windowClosed(WindowEvent we)
    {
        
    }
    public void windowActivated(WindowEvent we)
    {
        
    }
    public void windowDeactivated(WindowEvent we)
    {
        
    }
    public void windowDeiconified(WindowEvent we)
    {
         
    }
    public void windowIconified(WindowEvent we)
    {
       
    }
     public void windowClosing(WindowEvent we)
    {
         System.exit(0);
    }
     public void windowOpened(WindowEvent we)
    {
        
       
    }
    public void mouseMoved(MouseEvent me)
    {
        tf.setText("Mouse Moved");
    }
     public void mouseDragged(MouseEvent me)
    {
        tf.setText("Mouse Dragged");
    }
    public void actionPerformed(ActionEvent ae)
    {
        tf.setText("Mouse Clicked");
    }
}
class MouseEventDemo
{
    public static void main(String args[])
    {
        M m=new M();
        
    }
}