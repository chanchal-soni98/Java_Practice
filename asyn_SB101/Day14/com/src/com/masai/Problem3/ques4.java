package com.masai.Problem3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pid: ");
		int pid = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url="jdbc:mysql://localhost:3306/sb101db";
		
		
		
		try(Connection conn= DriverManager.getConnection(url,"root","Soni@123"))  {
			
			
			
			PreparedStatement ps= conn.prepareStatement("delete from Product where pid = ?");
			
			ps.setInt(1, pid);
			
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				System.out.println(x+" record deleted sucessfully..");
			else
				System.out.println("Student does not exist with the Roll "+pid);
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			System.out.println(e.getMessage());
		}			
		
	}
	
	
}



