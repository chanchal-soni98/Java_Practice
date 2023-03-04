//package basicjdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class updateByName {
//
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//	    	Scanner sc = new Scanner(System.in);
//	    	System.out.println("Enter the Product Name: ");
////	    	String pname = sc.next();
//	    	
//	    	System.out.println("Product quantity to update ");
//	    	int  quantity= sc.nextInt();
//	    	System.out.println("Product Price to update ");
//	    	int  price= sc.nextInt();
//	    	
//			try {
//				Class.forName("com.mysql.cj.jdbc.Driver");
//			} catch (ClassNotFoundException e) {
//				
//				e.printStackTrace();
//			}
//			  String url ="jdbc:mysql://localhost:3306/jdbc2" ;
//			  
//			  try(Connection con =DriverManager.getConnection(url,"root", "Soni@123")) {
//		
//				  PreparedStatement ps= con.prepareStatement("update product set quantity=?,price=? where pname= ?");
//				  ps.setInt(1, quantity);
//				  ps.setInt(2,price);
////				  ps.setString(3, pname);
//				  
//				  int p = ps.executeUpdate();
//				  if(p>0)
//				  {
//					  System.out.println("updated");
//				  }
//				  else 
//				  {
//					  System.out.println("Not updated"); 
//				  }
//				  
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				System.out.println(e.getMessage());
//			}
//
//		}
//
//	}
//
//
