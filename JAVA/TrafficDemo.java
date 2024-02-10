import java.applet.Applet;
import java.awt.*;
public class TrafficDemo extends Applet
{
		public void paint(Graphics g)
		{	
			int i=0;
			try{
			g.setColor(Color.orange);
			int x1[]={40,100,100,40,40};
			int y1[]={40,40,190,190,40};
			int n1=5;
			g.drawPolygon(x1,y1,n1);
			g.fillPolygon(x1,y1,n1);
			
			while(i<3)
			{
				g.setColor(Color.red);
				g.drawOval(55,50,30,30);
				g.fillOval(55,50,30,30);
				Thread.sleep(2000);
				g.setColor(Color.white);
				g.drawOval(55,50,30,30);
				g.fillOval(55,50,30,30);
			
				g.setColor(Color.yellow);
				g.drawOval(55,100,30,30);
				g.fillOval(55,100,30,30);
				Thread.sleep(2000);
				g.setColor(Color.white);
				g.drawOval(55,100,30,30);
				g.fillOval(55,100,30,30);

				g.setColor(Color.green);
				g.drawOval(55,150,30,30);
				g.fillOval(55,150,30,30);
				Thread.sleep(2000);
				g.setColor(Color.white);
				g.drawOval(55,150,30,30);
				g.fillOval(55,150,30,30);
				i++;
			}
			}catch(Exception e){}
			
		}
	
}


