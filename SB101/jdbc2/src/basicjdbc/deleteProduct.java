package basicjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.Scanner;
public class deleteProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			  String url ="jdbc:mysql://localhost:3306/jdbc2" ;
			  
			  try(Connection con =DriverManager.getConnection(url,"root", "Soni@123")) {	
				  PreparedStatement ps= con.prepareStatement("Delete from product where quantity<2 ");
				  				  
				  int p= ps.executeUpdate();
				  if(p>0)System.out.println("Deleted sucsessfully");
				  else System.out.println("NO"); 
				  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}

	}

}
