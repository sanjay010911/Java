import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class EventSumDemo extends Applet implements ActionListener
{
	
	Button b1,b2,b3;
	String msg="";
	public void init()
	{
		b1=new Button("ok");
		b2=new Button("cancel");
		b3=new Button("save");
		add(b1);
		add(b2);
		add(b3);
		
 		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("ok"))
		msg="you pressed ok";
		else if(str.equals("cancel"))
		msg="you pressed cancel";
		else if(str.equals("save"))
		msg="you pressed save";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,6,140);
			
		
	}	
	
}	