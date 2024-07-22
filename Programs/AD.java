import java.awt.*;
import java.awt.event.*;

class WindowExample extends Frame {
   public WindowExample() {
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            dispose();
         }
          public void windowOpened(WindowEvent e) {}
         public void windowClosed(WindowEvent e) {}
         public void windowIconified(WindowEvent e) {}
         public void windowDeiconified(WindowEvent e) {}
         public void windowActivated(WindowEvent e) {}
         public void windowDeactivated(WindowEvent e) {}
      });

      
      setSize(400, 400);
      setLayout(null);
      setVisible(true);
   }

   public static void main(String[] args) {
      new WindowExample();
   }
}
