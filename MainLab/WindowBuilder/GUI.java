// * This code was generated with love by Window Builder VS Code extension. * //

import javax.swing.*;
import java.awt.*;


public class GUI {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Window builder!");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);
    
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    // Fill the layout with placeholders
    for (int row = 0; row < 20; row++) {
        for (int col = 0; col < 15; col++) {
            constraints.gridx = col;
            constraints.gridy = row;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            constraints.fill = GridBagConstraints.BOTH;

            Component filler = Box.createRigidArea(new Dimension(0, 0));
            panel.add(filler, constraints);
        }
    }

    constraints.weightx = 0;
    constraints.weighty = 0;
    constraints.fill = GridBagConstraints.NONE;
    constraints.anchor = GridBagConstraints.NORTHWEST;

    
    JButton btn1 = new JButton("1");
    btn1.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = -5;
    constraints.gridy = 8;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btn1, constraints);
    
    JButton btn2 = new JButton("2");
    btn2.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = -3;
    constraints.gridy = 8;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btn2, constraints);
    
    JButton btn3 = new JButton("3");
    btn3.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = -2;
    constraints.gridy = 8;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btn3, constraints);
    
    JButton add = new JButton("+");
    add.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = 0;
    constraints.gridy = 8;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(add, constraints);
    
    JButton btn4 = new JButton("4");
    btn4.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = -5;
    constraints.gridy = 11;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btn4, constraints);
    
    JButton btn5 = new JButton("5");
    btn5.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = -3;
    constraints.gridy = 11;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btn5, constraints);
    
    JButton btn6 = new JButton("6");
    btn6.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = -2;
    constraints.gridy = 11;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btn6, constraints);
    
    JButton sub = new JButton("-");
    sub.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = 0;
    constraints.gridy = 11;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(sub, constraints);
    
    JButton btn7 = new JButton("7");
    btn7.setPreferredSize(new Dimension(49, 28));
    
    constraints.gridx = -5;
    constraints.gridy = 13;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btn7, constraints);
    
    JButton btn8 = new JButton("8");
    btn8.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = -3;
    constraints.gridy = 13;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btn8, constraints);
    
    JButton btn9 = new JButton("9");
    btn9.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = -2;
    constraints.gridy = 13;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btn9, constraints);
    
    JButton pro = new JButton("*");
    pro.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = 0;
    constraints.gridy = 13;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(pro, constraints);
    
    JButton eq = new JButton("=");
    eq.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = -5;
    constraints.gridy = 16;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(eq, constraints);
    
    JButton btn0 = new JButton("0");
    btn0.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = -3;
    constraints.gridy = 16;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(btn0, constraints);
    
    JButton mod = new JButton("%");
    mod.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = -2;
    constraints.gridy = 16;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(mod, constraints);
    
    JButton div = new JButton("/");
    div.setPreferredSize(new Dimension(53, 27));
    
    constraints.gridx = 0;
    constraints.gridy = 16;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(div, constraints);
    
    JTextField jtf = new JTextField(31);
    jtf.setPreferredSize(new Dimension(131, 23));
    constraints.gridx = -5;
    constraints.gridy = 5;
    constraints.gridwidth = 5;
    constraints.gridheight = 5;
    panel.add(jtf, constraints);
    
    frame.add(panel);
    frame.setVisible(true);
  }
}
    