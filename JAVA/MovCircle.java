import java.applet.Applet;
import java.awt.*;
public class MovCircle extends Applet
{
		public void paint(Graphics g)
		{	
			int i=0;
			try{
			while(i<7)
			{
				g.setColor(Color.red);
				g.drawOval(80,50,60,60);
				Thread.sleep(100);
				g.setColor(Color.white);
				g.drawOval(80,50,60,60);

				g.setColor(Color.red);
				g.drawOval(90,50,60,60);
				Thread.sleep(100);
				g.setColor(Color.white);
				g.drawOval(90,50,60,60);
				
				g.setColor(Color.red);
				g.drawOval(100,50,60,60);
				Thread.sleep(100);
				g.setColor(Color.white);
				g.drawOval(100,50,60,60);

				g.setColor(Color.red);
				g.drawOval(110,50,60,60);
				Thread.sleep(100);
				g.setColor(Color.white);
				g.drawOval(110,50,60,60);
				i++;
			}
			}catch(Exception e){}
		}
}	
				