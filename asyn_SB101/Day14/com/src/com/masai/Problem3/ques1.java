package com.masai.Problem3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pid: ");
		int pid = sc.nextInt();
		
		System.out.println("Enter pname: ");
		String pname = sc.next();
		
		System.out.println("Enter quantity: ");
		int quantity = sc.nextInt();
		
		System.out.println("Enter price: ");
		int price = sc.nextInt();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/sb101db";
		
		try(Connection conn = DriverManager.getConnection(url,"root","Soni@123")){
			
			PreparedStatement ps = conn.prepareStatement("insert into Product values(?,?,?,?)");
			ps.setInt(1, pid);
			ps.setString(2, pname);
			ps.setInt(3,quantity);
			ps.setInt(4, price);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				System.out.println("Record inserted: ");
			}else {
				System.out.println("can't inserted: ");
			}
			
		}
		// TODO Auto-generated method stub
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
