import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class JListDemo1 extends JApplet implements ActionListener,ListSelectionListener
{
	JButton jb1;
	JTextField jtf1,jtf2,jtf3;
	JList jl;
	String test[]={"X-ray","Bloodtest","Ultra-sound"};
	JLabel jl1,jl2,jl3;
	int amt;
	int items[];
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(null);
		
		jl1=new JLabel("Patient ID :");
		jl1.setBounds(40,40,60,20);
		jtf1=new JTextField();
		jtf1.setBounds(100,40,185,20);
		
		jl2=new JLabel("Patient Name :");
		jl2.setBounds(40,80,100,20);
		jtf2=new JTextField();
		jtf2.setBounds(120,80,165,20);
		
		jl=new JList(test);
		jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		jl.setBounds(40,120,100,20);
		
		jb1=new JButton("Bill");
		jb1.setBounds(150,160,55,20);
		
		jl3=new JLabel("Amt");
		jl3.setBounds(40,250,40,20);
		jtf3=new JTextField();
		jtf3.setBounds(80,250,205,20);
		
		contentPane.add(jl1);
		contentPane.add(jtf1);
		contentPane.add(jl2);
		contentPane.add(jtf2);
		contentPane.add(jl);
		contentPane.add(jb1);
		contentPane.add(jl3);
		contentPane.add(jtf3);
		
		jb1.addActionListener(this);
		jl.addListSelectionListener(this);
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
	
	public void valueChanged(ListSelectionEvent le)
	{
		amt=0;
		items=jl.getSelectedIndices();
		for(int i=0;i<items.length;i++)
		{
			if(items[i]==0)
				amt=amt+200;
			if(items[i]==1)
				amt=amt+300;
			if(items[i]==2)
				amt=amt+1000;
		}
		
	}
}
