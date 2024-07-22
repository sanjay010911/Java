import java.io.*;
import java.sql.*;
class DBD
{
    public static void main(String args[])
    {
        Connection con;
        Statement st;
        ResultSet rs;
        ResultSetMetaData rst;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db","root","");
            CallableStatement ce=con.prepareCall("{?= call ins2(?,?)}");
            ce.setInt(2,45);
            ce.setInt(3,233);
            ce.registerOutParameter(1,Types.INTEGER);
            ce.execute();
            System.out.println(ce.getInt(1));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}