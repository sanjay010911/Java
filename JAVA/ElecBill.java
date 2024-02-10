import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ElecBill extends JApplet implements ActionListener,ItemListener
{
	JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6;
	JRadioButton jrb1,jrb2;
	JButton jb1;
	ButtonGroup bg;
	int units,curead,prread,amt;
	String str;
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(null);
		
		jl1=new JLabel("Consumer no:");
		jl1.setBounds(40,40,100,50);
		jtf1=new JTextField();
		jtf1.setBounds(150,50,150,30);
		
		jl2=new JLabel("Consumer name:");
		jl2.setBounds(40,70,100,50);
		jtf2=new JTextField();
		jtf2.setBounds(150,80,150,30);

		jl3=new JLabel("Current reading:");
		jl3.setBounds(40,100,100,50);
		jtf3=new JTextField();
		jtf3.setBounds(150,110,150,30);

		jl4=new JLabel("Previous reading:");
		jl4.setBounds(40,130,100,50);
		jtf4=new JTextField();
		jtf4.setBounds(150,140,150,30);

		bg=new ButtonGroup();
		jrb1=new JRadioButton("Domestic");
		jrb1.setBounds(40,170,100,30);
		jrb2=new JRadioButton("Commercial");
		jrb2.setBounds(140,170,100,30);
		bg.add(jrb1);
		bg.add(jrb2);
		
		jb1=new JButton("Bill");
		jb1.setBounds(150,210,80,30);
		
		jl5=new JLabel("Units:");
		jl5.setBounds(40,260,100,30);
		jtf5=new JTextField();
		jtf5.setBounds(80,260,150,30);

		jl6=new JLabel("Amt:");
		jl6.setBounds(40,300,100,30);
		jtf6=new JTextField();
		jtf6.setBounds(80,300,150,30);
		
		contentPane.add(jl1);
		contentPane.add(jtf1);
		contentPane.add(jl2);
		contentPane.add(jtf2);	
		contentPane.add(jl3);	
		contentPane.add(jtf3);	
		contentPane.add(jl4);
		contentPane.add(jtf4);
		contentPane.add(jrb1);
		contentPane.add(jrb2);
		contentPane.add(jb1);
		contentPane.add(jl5);
		contentPane.add(jtf5);
		contentPane.add(jl6);
		contentPane.add(jtf6);
		
		jb1.addActionListener(this);
		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
		
	}

public void itemStateChanged(ItemEvent ie)
{
	curead=Integer.parseInt(jtf3.getText());
	prread=Integer.parseInt(jtf4.getText());
	units=curead-prread;
	if(jrb1.isSelected()==true)
	{
		if(units<=100)
		{
			amt=units*2;
		}
		else
			amt=100*2+(units-100)*3;
	}
	else if(jrb2.isSelected()==true)
	{
		if(units<=100)
			amt=units*4;
		else
			amt=100*4+(units-100)*8;
	}
}

public void actionPerformed(ActionEvent ae)
{
	String str=ae.getActionCommand();
	if(str.equals("Bill"))
	{
		jtf5.setText(String.valueOf(units));
		jtf6.setText(String.valueOf(amt));
		repaint();
	}
}
}
	
		
		
			
		
		
		
		
		
		