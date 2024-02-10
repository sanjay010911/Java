import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SimpleCalculatorDemo1 extends JApplet implements ActionListener
{
	JButton jb1,jb2,jb3,jb4;
	JTextField jtf1,jtf2,jtf3;
	JLabel jl1,jl2,jl3;
	double num1,num2,result;
	String str;	
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(null);
		
		jl1=new JLabel("Number 1 :");
		jl1.setBounds(40,40,100,50);
		jtf1=new JTextField();
		jtf1.setBounds(150,50,150,30);
		
		jl2=new JLabel("Number 2 :");
		jl2.setBounds(40,70,100,50);
		jtf2=new JTextField();
		jtf2.setBounds(150,80,150,30);

		jl3=new JLabel("Answer :");
		jl3.setBounds(40,100,100,50);
		jtf3=new JTextField();
		jtf3.setBounds(150,110,150,30);

		jb1=new JButton("ADD");
		jb1.setBounds(40,160,100,20);
		jb2=new JButton("SUBTRACT");
		jb2.setBounds(150,160,100,20);
		jb3=new JButton("MULTIPLY");
		jb3.setBounds(260,160,100,20);
		jb4=new JButton("DIVIDE");
		jb4.setBounds(370,160,100,20);

		contentPane.add(jl1);
		contentPane.add(jtf1);
		contentPane.add(jl2);
		contentPane.add(jtf2);
		contentPane.add(jl3);
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
		num1=Double.parseDouble(jtf1.getText());
		num2=Double.parseDouble(jtf2.getText());
		str=ae.getActionCommand();
		if(str.equals("ADD"))
			result=num1+num2;
		else if(str.equals("SUBTRACT"))
			result=num1-num2;
		else if(str.equals("MULTIPLY"))
			result=num1*num2;
		else if(str.equals("DIVIDE"))
			result=num1/num2;
		jtf3.setText(String.valueOf(result));
		repaint();
	}
}