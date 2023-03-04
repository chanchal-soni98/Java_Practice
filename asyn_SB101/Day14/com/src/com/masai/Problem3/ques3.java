package com.masai.Problem3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pid: ");
		int pid = sc.nextInt();
		
		System.out.println("Enter price: ");
		int price = sc.nextInt();
		
		System.out.println("Enter quantity: ");
		int quantuty = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e ) {
			
			e.printStackTrace();
			
		}
		
		String url = "jdbc:mysql://localhost:3306/sb101db";
		
		try(Connection conn = DriverManager.getConnection(url,"root","Soni@123")){
			PreparedStatement ps = conn.prepareStatement("update Product set price = ?, quantuty = ? where pid = ?");
			ps.setInt(1, quantuty);
			ps.setInt(2, price);
			ps.setInt(3, pid);
			int x = ps.executeUpdate();
			if(x>0) {
				System.out.println("updated");
			}else {
				System.out.println("Not updated");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
