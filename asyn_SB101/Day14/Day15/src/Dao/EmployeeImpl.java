package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeImpl implements Employee {

	@Override
	public String saveEmployeeDetails(Employee employee) {
		String message = "The Record is not Inserted..!";

		try (Connection con = DBUtil.provideConnection()) {
			PreparedStatement ps = con.prepareStatement("insert into Employee values(?,?,?,?)");
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());

			int update = ps.executeUpdate();

			if (update > 0) {
				message = "The Record has been Inserted Successfully...!";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message = e.getMessage();
			e.printStackTrace();
		}
		return message;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee employee = null;

		try (Connection con = DBUtil.provideConnection()) {
			PreparedStatement ps = con.prepareStatement("select * from Employee where Empid = ?");
			ps.setInt(1, empId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int ed = rs.getInt("empId");
				String nm = rs.getString("name");
				String ad = rs.getString("address");
				int sal = rs.getInt("salary");
				employee = new Employee();
				employee.setEmpId(ed);
				employee.setName(nm);
				employee.setAddress(ad);
				employee.setSalary(sal);

			} else {
				throw new EmployeeException(empId + " The Employee is not Exist..!");

			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}

		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList = new ArrayList<>();

		try (Connection con = DBUtil.provideConnection()) {
			PreparedStatement ps = con.prepareStatement("select * from Employee");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int ed = rs.getInt("empId");
				String nm = rs.getString("name");
				String ad = rs.getString("address");
				int sal = rs.getInt("salary");

				Employee employee = new Employee();
				employee.setEmpId(ed);
				employee.setName(nm);
				employee.setAddress(ad);
				employee.setSalary(sal);

				empList.add(employee);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public boolean deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		boolean flag = false;

		try (Connection con = DBUtil.provideConnection()) {
			PreparedStatement ps = con.prepareStatement("delete from Employee where empId = ?");
			ps.setInt(1, empId);
			int rs = ps.executeUpdate();

			if (rs > 0) {
				flag = true;
			} else {
				throw new EmployeeException("The Record Still not deleted..!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}

		return flag;
	}

	@Override
	public String giveBonusToEmployee(int empId, int amount) throws EmployeeException {
		String msg = "The Record has not Updated..!";

		try (Connection con = DBUtil.provideConnection()) {
			PreparedStatement ps = con
					.prepareStatement("update Employee set salary = salary + ? where empId = ?");
//			ps.setInt(1, amount);
			ps.setInt(1, empId);
			ps.setInt(2, amount);

			int result = ps.executeUpdate();
			if (result > 0) {
				msg = "Bonus has been Released..!";
			} else {
				throw new EmployeeException("Wait For Bonus");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		return msg;
	}

}
