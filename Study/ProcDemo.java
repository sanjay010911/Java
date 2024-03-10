import java.io.*;
import java.sql.*;
class ProcDemo
{
    public static void main(String args[])
    {
        Connection con;
        CallableStatement cs;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db","root","root");
            cs=con.prepareCall("{Call Proc1(?,?)}");
            cs.setString(1,"qwerty");
            cs.setString(2,"134");
            cs.executeUpdate();
            System.out.println("1 row inserted");
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}