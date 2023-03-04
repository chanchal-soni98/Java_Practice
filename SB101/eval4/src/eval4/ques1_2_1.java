package eval4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ques1_2_1 {
//Add a new Department
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter did");
		int did = sc.nextInt();
		System.out.println("Enter dname");
		String dname = sc.next();
		
		System.out.println("Enter location");
		String location = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db4";
		
		try(Connection con = DriverManager.getConnection(url,"root","Soni@123")){
			PreparedStatement ps = con.prepareStatement("insert into Department values(?,?,?)");
			ps.setInt(1,did);
			ps.setString(2, dname);
			ps.setString(3, location);
			
			
			int d = ps.executeUpdate();
			if(d>0) {
				System.out.println("Added");
			}else {
				System.out.println("Can't");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
