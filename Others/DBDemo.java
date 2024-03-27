import java.io.*;
import java.sql.*;
class DBDemo
{
    public static void main(String args[])
    {
        Connection con;
        Statement st;

       
        DataInputStream in=new DataInputStream(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db","root","root");
            st=con.createStatement();
            System.out.println("Enter the name and password");
            String name=in.readLine();
            String pass=in.readLine();
            String str="insert into login values(?,?)";
            PreparedStatement ps=con.prepareStatement(str);
            ps.setString(1,name);
            ps.setString(2,pass);
            ps.executeUpdate();
            System.out.println("1 row inserted");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception e){
            
        }

    }
}