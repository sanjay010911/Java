import java.sql.*;
import java.io.DataInputStream;

class SailorDatabase {
    public static void main(String args[]) {
        try {
		int id,ch;
		String name,insqry,delqry,upqry;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
		Statement stmt = con.createStatement();
		DataInputStream in=new DataInputStream(System.in);
		do{
			System.out.println("Enter the choice 1=Create table Sailor 2=Insert 3=Delete 4=Display 5=Update 6=Exit");
			ch=Integer.parseInt(in.readLine());
			if(ch==1)
			{
				stmt.executeUpdate("create table sailor(sailor_id int primary key,sailor_name varchar(20))");
				System.out.println("Table created Successfully");
			}
			else if(ch==2)
			{
				System.out.println("Enter sailor id");
				id=Integer.parseInt(in.readLine());
				System.out.println("Enter sailor name");
				name=in.readLine();
				insqry="insert into sailor(sailor_id,sailor_name)values('"+id+"','"+name+"')";
				//System.out.println(insqry);
				stmt.executeUpdate(insqry);
				System.out.println("data inserted Successfully");
			}
			else if(ch==3)
			{
				System.out.println("Enter sailor name");
				name=in.readLine();
				delqry="delete from sailor where sailor_name='"+name+"'";
				stmt.executeUpdate(delqry);
				System.out.println("data deleted Successfully");
			}
			else if(ch==4)
			{
            			ResultSet rs=stmt.executeQuery("SELECT * FROM sailor");
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}
			}
			else if(ch==5)
			{
				System.out.println("Enter id");
				id=Integer.parseInt(in.readLine());
				System.out.println("Enter name to be replaced with");
				name=in.readLine();
				upqry="update sailor set sailor_name='"+name+"'where sailor_id='"+id+"'";
				stmt.executeUpdate(upqry);
				System.out.println("data updated Successfully");
			}
			else
			{
				System.out.println("Exiting!!");
				break;
			}
		}while(ch!=6);	
           	 con.close();
        }catch (Exception e) {System.out.println(e);}
    }
}			