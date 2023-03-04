package eval4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ques1_2_5 {
// Get All the Department details.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db4";
		
		try(Connection con = DriverManager.getConnection(url,"root","Soni@123");		
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Department");
			
			){
			while(rs.next()) {
				System.out.println("Id: "+rs.getInt("did"));
				System.out.println("Dname: "+rs.getString("dname"));
				System.out.println("location: "+rs.getString("location"));
			}			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
