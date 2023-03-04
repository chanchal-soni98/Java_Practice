package Problem3.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Problem3.Exception.RoomException;
import Problem3.Models.Customer;
import eval4.com.masai.Problem1.DBUtil.DBUtil;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public String addCustomerToRoom(Customer customer, int roomNumber) throws RoomException {
		// TODO Auto-generated method stub
		String message = "Customer Not Added";
		
		
		try (Connection conn = DBUtil.provideConnection()){
			
			
			PreparedStatement ps = conn.prepareStatement("select * from room where roomNumber = ?");
			
			ps.setInt(1, roomNumber);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				if(rs.getBoolean("isEmpty") == false) throw new RoomException("Room not Empty!");
				
				PreparedStatement ps1 = conn.prepareStatement("select * from customer where customerId = ?");
				ps1.setInt(1, customer.getCustomerId());
				
				ResultSet rs1 = ps1.executeQuery();
				
				if(!rs1.next()) {			
				
					PreparedStatement ps2 = conn.prepareStatement("insert into customer values(?, ?, ?, 0)");
					ps2.setInt(1, customer.getCustomerId());
					ps2.setString(2, customer.getCustomerName());
					ps2.setString(3, customer.getAddress());
					
					ps2.executeUpdate();
				}
				
					PreparedStatement ps3 = conn.prepareStatement("update customer set roomNumber = ? "
							+ "where customerId = ?");
					
					PreparedStatement ps4 = conn.prepareStatement("update room set isEmpty = false "
							+ "where roomNumber = ?");
					
					ps3.setInt(1, roomNumber);
					ps3.setInt(2, customer.getCustomerId());
					ps4.setInt(1, roomNumber);
									
					int cus = ps3.executeUpdate();
					ps4.executeUpdate();
					
					if(cus > 0) message = "Customer Added";

			}
			else {
				throw new RoomException("Invalid r number");
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return message;
	}
	

	@Override
	public String removeCustomerFromRoom(int customerId, int roomNumber) throws RoomException {
		String message = "Customer Not Removed";
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("Update customer set roomNumber = null where customerId = ?");
			ps.setInt(1, customerId);			
			
			int out = ps.executeUpdate();
			
			if(out > 0) message = "Customer Removed";
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return message;
	}

	@Override
	public List<Customer> getCustomerFromParticularRoom(int roomNumber) throws RoomException {
List<Customer> cust = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from customer where roomNumber = ?");
			ps.setInt(1, roomNumber);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int cId = rs.getInt("customerId");
				String cName = rs.getString("customerName");
				String caddress = rs.getString("address");
				
				Customer c = new Customer(cId, cName, caddress, roomNumber);
				cust.add(c);
			}
			
			if(cust.size() == 0) throw new RoomException("This room doesn't have any customer!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cust;
	}

}
