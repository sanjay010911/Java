import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CircleAreaDemo1 extends JApplet implements ActionListener
{
	JButton jb1;
	JTextField jtf1,jtf2;
	JLabel jl1,jl2;
	double area;
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(null);
		
		jl1=new JLabel("Enter Radius: ");
		jl1.setBounds(40,40,100,50);
		jtf1=new JTextField();
		jtf1.setBounds(150,50,150,30);
		
		jb1=new JButton("Area");
		jb1.setBounds(150,85,80,20);
		
		jl2=new JLabel("Area is: ");
		jl2.setBounds(40,100,100,50);
		jtf2=new JTextField();
		jtf2.setBounds(150,110,150,30);
		
		contentPane.add(jl1);
		contentPane.add(jtf1);
		contentPane.add(jb1);
		contentPane.add(jl2);
		contentPane.add(jtf2);
		
		jb1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		String str=ae.getActionCommand();
		double rad=Double.parseDouble(jtf1.getText());
		if(str.equals("Area"))
		{
			area=(22.0*rad*rad)/7;
			jtf2.setText(String.valueOf(area));
		}
	}

}
