import java.applet.Applet;
import java.awt.*;
public class Flag extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.orange);
		int x1[]={25,150,150,25,25};
		int y1[]={25,25,50,50,25};
		int n1=5;
		g.fillPolygon(x1,y1,n1);
			
		
		g.setColor(Color.green);
		int x2[]={25,150,150,25,25};
		int y2[]={75,75,100,100,75};
		g.fillPolygon(x2,y2,n1);

		g.setColor(Color.blue);
		g.drawOval(75,49,25,25);
		g.drawLine(87,49,87,74);	
		g.drawLine(75,61,100,61);
		g.drawLine(80,53,95,70);
		g.drawLine(95,53,80,70);
		
		g.setColor(Color.black);
		int x3[]={25,20,20,25,25};
		int y3[]={25,25,200,200,25};
		g.fillPolygon(x3,y3,n1);
		
		
		
	}
}