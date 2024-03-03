import java.io.*;
import java.net.*;
class Curl
{
    public static void main(String args[])
    {
        try{
        URL url=new URL(args[0]);
        System.out.println("URL is :"+url.toString());
        System.out.println("URL Protocol :"+url.getProtocol());
        System.out.println("Filename :"+url.getFile());
        System.out.println("Path :"+url.getPath());
        System.out.println("Host :"+url.getHost());
        System.out.println("Port :"+url.getPort());
        }catch(Exception e){}
    }
}