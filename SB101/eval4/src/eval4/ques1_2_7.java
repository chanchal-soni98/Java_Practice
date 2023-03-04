package eval4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//Delete a department by did,
public class ques1_2_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter did");
		int did = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db4";
		
		try(Connection con = DriverManager.getConnection(url,"root","Soni@123")){
			PreparedStatement ps = con.prepareStatement("delete from Department where did=?");
			ps.setInt(1,did);
			int d = ps.executeUpdate();
			if(d>0) {
				System.out.println("Deleted");
			}else {
				System.out.println("Can't delete");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
