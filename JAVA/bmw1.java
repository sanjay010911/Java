import java.applet.Applet;
import java.awt.*;
public class bmw1 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.drawOval(25,25,100,100);
		g.drawOval(45,45,61,61);
		Color c1=new Color(10,150,200);
		g.setColor(c1);
		g.fillArc(45,45,62,62,90,90);
		g.setColor(c1);
		g.fillArc(45,45,62,62,270,90);
	}
}

		
