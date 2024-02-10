import java.sql.*;

class JavaDatabase {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            Statement stmt = con.createStatement();
		//stmt.executeUpdate("insert into student(id,name) values('1','sanjay'),('2','sdfsf')");
		
            ResultSet rs=stmt.executeQuery("SELECT * FROM student");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}			