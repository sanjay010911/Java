import java.awt.*;
import java.applet.*;
public class StarDemo extends Applet
{
	public void paint(Graphics g)
	{
		try{
		int x1[]={50,90,90,50,50};
		int y1[]={50,50,170,170,50},i=0;
		g.drawPolygon(x1,y1,5);
		while(i<5)
		{
			
			g.setColor(Color.red);
			g.fillOval(55,55,30,30);
			Thread.sleep(1200);
			g.setColor(Color.white);
			g.fillOval(55,55,30,30);

			g.setColor(Color.yellow);
			g.fillOval(55,85,30,30);
			Thread.sleep(1200);
			g.setColor(Color.white);
			g.fillOval(55,85,30,30);

			g.setColor(Color.green);
			g.fillOval(55,115,30,30);
			Thread.sleep(1200);
			g.setColor(Color.white);
			g.fillOval(55,115,30,30);
			i++;
		}
		}catch(Exception e){}
		
	}
}