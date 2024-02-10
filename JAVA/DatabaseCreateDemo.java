import java.sql.*;
class DatabaseCreateDemo
{
	public static void main(String args[])
	{
		try{
			Class.forName("com.mysql.ej.jdbc.Driver");
			Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/java","root","");
			System.out.println("connection is established");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("create table sailor(sid int,sname varchar(20),primary key(sid))");
			System.out.println("1 table created successfully");
			con.close();
		   }catch(Exception e){e.printStackTrace();}
	}
}

