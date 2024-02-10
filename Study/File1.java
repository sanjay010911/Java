import java.io.*;
class File1
{
    public static void main(String args[])
    {
        FileOutputStream fout;
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("enter the name of the file");
            String name=in.readLine();
            fout=new FileOutputStream(name);
            String data=in.readLine();
            while(!data.equals("quit"))
            {
                fout.write(data.getBytes());
                data=in.readLine();
            }
        fout.close();
        }catch(Exception e){}
    }
}
