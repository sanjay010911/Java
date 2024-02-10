import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class LargestOfTwoNum extends JApplet implements ActionListener
{
	JButton jb1;
	JTextField jtf1,jtf2,jtf3;
	JLabel jl1,jl2,jl3;
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(null);
		
		jl1=new JLabel("Enter Number1");
		jl1.setBounds(40,40,100,50);
		jtf1=new JTextField();
		jtf1.setBounds(150,50,150,30);

		jl2=new JLabel("Enter Number2");
		jl2.setBounds(40,80,100,50);
		jtf2=new JTextField();
		jtf2.setBounds(150,90,150,30);

		jb1=new JButton("Find");
		jb1.setBounds(50,130,80,20);
		
		jl3=new JLabel("Largest is: ");
		jl3.setBounds(40,150,100,50);
		jtf3=new JTextField();
		jtf3.setBounds(150,160,150,30);
		
		contentPane.add(jl1);
		contentPane.add(jtf1);
		contentPane.add(jl2);
		contentPane.add(jtf2);
		contentPane.add(jb1);
		contentPane.add(jl3);
		contentPane.add(jtf3);
		
		jb1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		String str=ae.getActionCommand();
		int n1=Integer.parseInt(jtf1.getText());
		int n2=Integer.parseInt(jtf2.getText());
		if(str.equals("Find"))
		{
			if(n1>n2)
				jtf3.setText(String.valueOf(n1));
			else
				jtf3.setText(String.valueOf(n2));
		}
	}
}