package Problem3.Models;

public class Customer {
	private int customerId;
	private String customerName;
	private String address;
	private int roomNumber;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(int customerId, String customerName, String address, int roomNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.roomNumber = roomNumber;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", roomNumber=" + roomNumber + "]";
	}
	
	
	

}
