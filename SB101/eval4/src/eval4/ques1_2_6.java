package eval4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//Update the existing employee password.
public class ques1_2_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter dname");
		String ename = sc.next();
		
		System.out.println("Change Password");
		String password = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db4";
		
		try(Connection con = DriverManager.getConnection(url,"root","Soni@123")){
			PreparedStatement ps = con.prepareStatement("update Employee set password=? where ename=?");
			ps.setString(1,password);
			
			ps.setString(2, ename);
			
			
			int d = ps.executeUpdate();
			if(d>0) {
				System.out.println("Password Updated");
			}else {
				System.out.println("Can't change");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}
	

}
