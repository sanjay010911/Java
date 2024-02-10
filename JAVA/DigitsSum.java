import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class DigitsSum extends JApplet implements ActionListener
{
	JButton jb1;
	JTextField jtf1,jtf2;
	JLabel jl1,jl2;
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(null);
		
		jl1=new JLabel("Enter Number");
		jl1.setBounds(40,40,100,50);
		jtf1=new JTextField();
		jtf1.setBounds(150,50,150,30);
		
		jb1=new JButton("Sum");
		jb1.setBounds(50,90,80,20);
		
		jl2=new JLabel("Sum Of Digits is: ");
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
		int num=Integer.parseInt(jtf1.getText());
		int d=0,s=0,n=num;
		if(str.equals("Sum"))
		{
			while(n!=0)
			{
				d=n%10;
				s=s+d;
				n=n/10;
			}
			jtf2.setText(String.valueOf(s));
			repaint();
		
		}
	}
}
	