package Problem3.usecases;

import java.util.List;
import java.util.Scanner;

import Problem3.Dao.CustomerDao;
import Problem3.Dao.CustomerDaoImpl;
import Problem3.Exception.RoomException;
import Problem3.Models.Customer;

public class GetCustomerFromRooms {
public static void main(String[] args) {
		
		CustomerDao c = new CustomerDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Room Number :");
		int roomNo = sc.nextInt();
		
		try {
			
			List<Customer> customers = c.getCustomerFromParticularRoom(roomNo);
			
			
			for(Customer cus : customers) System.out.println(cus);
			
		}
		catch (RoomException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}