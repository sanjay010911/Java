import java.io.*;
import java.sql.*;

class DB {
    public static void main(String args[]) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        int flag = 0;
        DataInputStream in = new DataInputStream(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db?characterEncoding=utf8", "root", "root");
            st = con.createStatement();

            System.out.println("Enter the username");
            String user = in.readLine();
            System.out.println("Enter the password");
            String pass = in.readLine();

            String str = "select * from login";
            rs = st.executeQuery(str);

            while (rs.next()) {
                if ((rs.getString("username").equals(user)) && (rs.getString("password").equals(pass))) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1)
                System.out.println("User exists");
            else
                System.out.println("Invalid user");
        } catch (Exception e) {} 
    }
}
