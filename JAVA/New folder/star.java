import java.applet.Applet;
import java.awt.*;
public class star extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		int x1[]={40,110,40,75,100,40};
		int y1[]={40,40,80,15,80,40};
		int n1=6;
		g.drawPolygon(x1,y1,n1);
		g.fillPolygon(x1,y1,n1);
	}
}