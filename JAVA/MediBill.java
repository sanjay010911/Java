import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MediBill extends JApplet implements ActionListener,ItemListener
{
	JButton jb1;
	JCheckBox jcb1,jcb2,jcb3;
	JTextField jtf1,jtf2,jtf3;
	JLabel jl1,jl2,jl3;
	int amt;
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(null);
		jl1=new JLabel("Patient ID:");
		jl1.setBounds(40,40,60,20);
		jtf1=new JTextField();
		jtf1.setBounds(100,40,185,20);
		
		jl2=new JLabel("Patient Name:");
		jl2.setBounds(40,80,100,20);
		jtf2=new JTextField();
		jtf2.setBounds(120,80,165,20);
		
		jcb1=new JCheckBox("X-ray");
		jcb1.setBounds(40,120,70,20);
		jcb2=new JCheckBox("Bloodtest");
		jcb2.setBounds(110,120,90,20);
		jcb3=new JCheckBox("Ultra Sound");
		jcb3.setBounds(200,120,90,20);

		jb1=new JButton("Bill");
		jb1.setBounds(40,160,55,20);
		
		jl3=new JLabel("Amt:");
		jl3.setBounds(40,200,40,20);
		jtf3=new JTextField();
		jtf3.setBounds(80,200,205,20);
		
		contentPane.add(jl1);
		contentPane.add(jtf1);
		contentPane.add(jl2);
		contentPane.add(jtf2);
		contentPane.add(jcb1);
		contentPane.add(jcb2);
		contentPane.add(jcb3);
		contentPane.add(jb1);
		contentPane.add(jl3);
		contentPane.add(jtf3);
		jb1.addActionListener(this);
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		jcb3.addItemListener(this);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Bill"))
		{
			jtf3.setText(String.valueOf(amt));
			repaint();
		}
	}
		
		
	public void itemStateChanged(ItemEvent ie)
	{
		if((jcb1.isSelected()==true) && (jcb2.isSelected()==true) && 
			(jcb3.isSelected()==true))
			amt=200+300+1000;
		else if((jcb1.isSelected()==true) && (jcb2.isSelected()==true) && 
			(jcb3.isSelected()==false))
			amt=200+300;
		else if((jcb1.isSelected()==true) && (jcb2.isSelected()==false) &&
			(jcb3.isSelected()==true))
			amt=200+1000;
		else if((jcb1.isSelected()==false) && (jcb2.isSelected()==true )&&
			(jcb3.isSelected()==true))
			amt=300+1000;
		else if((jcb1.isSelected()==true) && (jcb2.isSelected()==false)&&
			(jcb3.isSelected()==false))
			amt=200;
		else if((jcb1.isSelected()==false) && (jcb2.isSelected()==true) &&
			(jcb3.isSelected()==false))
			amt=300;
		else if((jcb1.isSelected()==false) && (jcb2.isSelected()==false )&&
			(jcb3.isSelected()==true))
			amt=1000;
	}
}				
		
		
		
		
		
		
	
		