package com.masai.Problem2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/sb101db";
		
		try(Connection conn = DriverManager.getConnection(url,"root","Soni@123")){
			
			Statement st = conn.createStatement();
			
			int x = st.executeUpdate("insert into Student values(1,'Chanchal',340)");
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
