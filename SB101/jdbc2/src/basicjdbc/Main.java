package basicjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Product Id");
		int pid= sc.nextInt();
		System.out.println("Product Name");
		String pname= sc.next();
		System.out.println("Product Quantity");
		int  quanity= sc.nextInt();
		System.out.println("Product Price");
		int  price= sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/jdbc2";//database.
		try(Connection con = DriverManager.getConnection(url, "root", "Soni@123")) {
			
			PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?)");
		       	ps.setInt(1,pid);
		       	ps.setString(2,pname);
		    	ps.setInt(3,quanity);
		    	ps.setInt(4,price);
		    	
		    	int p = ps.executeUpdate();
		    	if(p>0)
		    		{
		    		System.out.println("record updated");
		    		}
		    	else 
		    		{
		    		System.out.println("Can't Inserted......");
		    		}
		    	
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
