package Problem3.Dao;

import java.util.List;

import Problem3.Exception.RoomException;
import Problem3.Models.Customer;

public interface CustomerDao {
	
	public String addCustomerToRoom(Customer customer, int roomNumber)throws RoomException;
	
	public String removeCustomerFromRoom(int customerId, int roomNumber)throws RoomException;
	
	public List<Customer> getCustomerFromParticularRoom(int	roomNumber) throws RoomException;

}
