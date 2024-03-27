import java.io.*;
import java.net.*;
class FileTransfer
{
   public static void uploadFile(Socket clientSocket, String filePath) throws IOException {
    try (InputStream inputStream = clientSocket.getInputStream();
         FileOutputStream fileOutputStream = new FileOutputStream(filePath);) {

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, bytesRead);
        }

        // Add a small delay to ensure data transmission completion
        Thread.sleep(100);

    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}


    
   public static void downloadFile(Socket clientSocket, String filePath) throws IOException {
    try (
        InputStream inputStream = clientSocket.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
    ) {
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, bytesRead);
        }
        System.out.println("Download Complete");
    } catch (IOException e) {
        e.printStackTrace();
    }
}






    public static void main(String args[])
    {
        Socket cs;
        ServerSocket ss;
        DataInputStream sin;
        DataOutputStream sout;
        DataInputStream in=new DataInputStream(System.in);
        
        try{
            while(true)
            {
                System.out.println("1:Send 2:Receive 3:quit");
                int ch=Integer.parseInt(in.readLine());
                if(ch==1)
                {

                    ss=new ServerSocket(5000);
                    cs=ss.accept();
                    sin=new DataInputStream(cs.getInputStream());
                    sout=new DataOutputStream(cs.getOutputStream());
                    sout.writeUTF("Connection Established");
                    System.out.println("Enter the path of file");
                    String path=in.readLine();
                    uploadFile(cs,path);
                    System.out.println("Transfer Complete");

                }
                else if(ch==2)
                {
                    // System.out.println("Enter the Public Ip address of sender");
                    // String ip=in.readLine();
                    System.out.println("Before creating socket");
                    cs = new Socket("localhost", 5000);
                    System.out.println("After creating socket");
                    sin=new DataInputStream(cs.getInputStream());
                    System.out.println(sin.readUTF());
                    System.out.println("Enter the download path");
                    String path=in.readLine();
                    System.out.println("Enter the filename");
                    String filename = in.readLine();
                    downloadFile(cs, filename);
                    System.out.println("Download Complete");

                }
                else
                    System.exit(0);
            }
        }catch(Exception e) 
        {
            e.printStackTrace();
        }
    }
  
}