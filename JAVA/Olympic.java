import java.applet.Applet;
import java.awt.*;
public class Olympic extends Applet
{
	public void paint(Graphics g)
	{	
		g.setColor(Color.blue);
		g.fillOval(40,40,100,100);
		g.setColor(Color.white);
		g.fillOval(50,50,80,80);
		g.setColor(Color.black);
		g.fillOval(150,40,100,100);
		g.setColor(Color.white);
		g.fillOval(160,50,80,80);
		g.setColor(Color.red);
		g.fillOval(260,40,100,100);
		g.setColor(Color.white);
		g.fillOval(270,50,80,80);
		g.setColor(Color.yellow);
		g.fillOval(97,80,100,100);
		g.setColor(Color.white);
		g.fillOval(107,90,80,80);
		g.setColor(Color.green);
		g.fillOval(207,80,100,100);
		g.setColor(Color.white);
		g.fillOval(217,90,80,80);	
	}
}