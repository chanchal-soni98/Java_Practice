package eval4.com.masai.Problem1.Exception;

public class Employee {
	int emplId;
	String ename;
	String address;
	String email;
	String password;
	int salary;
	int deptId;
//	public Employee(int emplId, String ename, String address, String email, String password, int salary, int deptId) {
//		// TODO Auto-generated constructor stub
//		
//	}

	
	public void EmployeeException() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int emplId, String ename, String address, String email, String password, int salary, int deptId) {
	super();
	this.emplId = emplId;
	this.ename = ename;
	this.address = address;
	this.email = email;
	this.password = password;
	this.salary = salary;
	this.deptId = deptId;
}

	public void EmployeeException(String message) {
		// TODO Auto-generated constructor stub
	}

	public String getEname() {
		// TODO Auto-generated method stub
		return ename;
	}

	public int getEmplId() {
		// TODO Auto-generated method stub
		return emplId;
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public int getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	
}
