import java.io.*;
import java.awt.*;
import java.applet.*;

/*
<applet code=ImgD.class width="300" height="300"></applet>
*/
class ImgD extends Applet
{
    Image img;
    Label l;

    public void init()
    {
        l=new Label();
        img=getImage(getCodeBase(),"C:/Users/sanja/OneDrive/Pictures/Sanjay.jpg");

    }
    public void paint(Graphics g)
    {
        g.drawString("skdjskd",20,20);
    }
}