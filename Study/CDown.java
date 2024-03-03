import java.io.*;
import java.net.URL;

class CDown 
{
   public static void main(String[] args) throws Exception 
   {
      URL url = new URL("http://www.google.com");
      DataInputStream in = new DataInputStream(url.openStream());
      FileOutputStream out = new FileOutputStream("data.html");

      String line=in.readLine();
      while(line!=null)
      {
        System.out.println(line);
        line=line+'\n';
        out.write(line.getBytes());
        line=in.readLine();
        
      }
      in.close();
      out.close();
   }
}