import java.io.*;  
import java.net.*;  
public class InetDemo{  
public static void main(String[] args){  
try{  
InetAddress s=InetAddress.getByName("www.google.com");
System.out.println("Name :"+s.getHostName());
System.out.println("Address :"+s.getHost());
}catch(Exception e){System.out.println(e);}  
}  
}  