import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SimpleCalcSwing extends JApplet implements ActionListener
{
	JTextField jtf1,jtf2,jtf3;
	JButton jb1,jb2,jb3,jb4;
	JLabel jbl1,jbl2,jbl3;
	double x,y,z;
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(null);

		jbl1= new JLabel("Number 1");
		jbl1.setBounds(10,10,110,70);

		jtf1=new JTextField(10);
		jtf1.setBounds(150,10,90,40);

		jbl2= new JLabel("Number 2");
		jbl2.setBounds(10,70,110,70);

		jtf2=new JTextField(10);
		jtf2.setBounds(150,70,90,40);

		jbl3= new JLabel("Result");
		jbl3.setBounds(10,130,110,70);
		
		jtf3=new JTextField(10);
		jtf3.setBounds(150,130,90,40);

		jb1=new JButton("+");
		jb1.setBounds(20,200,50,50);

		jb2=new JButton("-");
		jb2.setBounds(80,200,50,50);

		jb3=new JButton("*");
		jb3.setBounds(150,200,50,50);

		jb4=new JButton("/");
		jb4.setBounds(220,200,50,50);
		contentPane.add(jbl1);
		contentPane.add(jtf1);
		contentPane.add(jbl2);
		contentPane.add(jtf2);
		contentPane.add(jbl3);
		contentPane.add(jtf3);
		
		
		contentPane.add(jb1);
		contentPane.add(jb2);
		contentPane.add(jb3);
		contentPane.add(jb4);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String op=ae.getActionCommand();
		x=Double.parseDouble(jtf1.getText());
		y=Double.parseDouble(jtf2.getText());
		if(op.equals("+"))
			z=x+y;
		else if(op.equals("-"))
			z=x-y;
		else if(op.equals("*"))
			z=x*y;
		else if(op.equals("/"))
			z=x/y;
		jtf3.setText(String.valueOf(z));
		repaint();
	}
}
		
		
		
		
	