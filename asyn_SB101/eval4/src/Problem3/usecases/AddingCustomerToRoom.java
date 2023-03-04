package Problem3.usecases;

import java.util.Scanner;

import Problem3.Dao.CustomerDao;
import Problem3.Dao.CustomerDaoImpl;
import Problem3.Exception.RoomException;
import Problem3.Models.Customer;

public class AddingCustomerToRoom {
	public static void main(String[] args) {
	
	
	CustomerDao c = new CustomerDaoImpl();
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter  Customer Id :");
	int customId = sc.nextInt();
	
	
	System.out.println("Enter Customer Name :");
	String customName = sc.next();
	
	
	System.out.println("Enter Customer Address :");
	String addr = sc.next();
	
	
	System.out.println("Enter  Room Number :");
	int roomNo = sc.nextInt();
	
	Customer cus = new Customer();
	
	cus.setCustomerId(customId);
	
	cus.setCustomerName(customName);
	
	cus.setAddress(addr);
				
	try {
		
		String message = c.addCustomerToRoom(cus, roomNo);
		
		System.out.println(message);
		
	}
	
	catch (RoomException e) {
		
		System.out.println(e.getMessage());
		
		}
	
	}
}





