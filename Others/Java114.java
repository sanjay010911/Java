import java.io.*;
class Java114
{
    public static void main(String args[])
    {
        FileInputStream fin;
        FileOutputStream fout;
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("Enterr th source");
            String source=in.readLine();
            BufferedReader bf=new BufferedReader(new FileReader(source));
            System.out.println("Enterr the destination");
            String dest=in.readLine();
            fout=new FileOutputStream(dest);
            String data=bf.readLine();
            int i=1;
            while(data!=null)
            {   
                data=":"+data+'\n';
                data=i+data;
                fout.write(data.getBytes());
                data=bf.readLine();
                i++;
            }

        }
        catch(Exception e){}
    }
}