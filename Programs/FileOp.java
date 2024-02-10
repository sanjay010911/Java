import java.io.*;
class FileOp
{
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("Enter the file name");
            String fname=in.readLine();
            FileOutputStream fout=new FileOutputStream(fname);  //opens a file named fname in write mode
            System.out.println("Enter the data/quit");
            String data;
            data=in.readLine();
            data=data+"\n";
            while(!data.equals("quit"))
            {
                fout.write(data.getBytes());
                data=in.readLine();
                data=data+"\n";
            }
            fout.close();
        }
        catch(Exception e){}
    }
}