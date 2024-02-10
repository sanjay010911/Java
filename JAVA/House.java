import java.applet.Applet;
import java.awt.*;
public class House extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.magenta);
		int x1[]={40,80,80,40,40};
		int y1[]={40,40,80,80,40};
		int n1=5;
		g.drawPolygon(x1,y1,n1);
		g.fillPolygon(x1,y1,n1);
		
		g.setColor(Color.black);
		int x2[]={55,55,65,65,55};
		int y2[]={80,60,60,80,80};
		g.drawPolygon(x2,y2,n1);
		g.fillPolygon(x2,y2,n1);

		g.setColor(Color.yellow);
		g.drawOval(55,70,2,2);
		g.fillOval(55,70,2,2);

		g.setColor(Color.orange);
		int x3[]={35,60,85,35};
		int y3[]={40,20,40,40};
		int n2=4;
		g.drawPolygon(x3,y3,n2);
		g.fillPolygon(x3,y3,n2);

		g.setColor(Color.orange);
		int x4[]={120,125,125,120,120};
		int y4[]={40,40,80,80,40};
		g.drawPolygon(x4,y4,n1);
		g.fillPolygon(x4,y4,n1);

		g.setColor(Color.green);
		g.drawOval(108,20,30,30);
		g.fillOval(108,20,30,30);

		g.setColor(Color.red);
		g.drawOval(113,30,2,2);
		g.fillOval(113,30,2,2);
		//g.setColor(Color.red);
		g.drawOval(115,40,2,2);
		g.fillOval(115,40,2,2);
		//g.setColor(Color.red);
		g.drawOval(118,23,2,2);
		g.fillOval(118,23,2,2);
		//g.setColor(Color.red);
		g.drawOval(125,36,2,2);
		g.fillOval(125,36,2,2);
		//g.setColor(Color.red);
		g.drawOval(130,30,2,2);
		g.fillOval(130,30,2,2);	
	}
}

	