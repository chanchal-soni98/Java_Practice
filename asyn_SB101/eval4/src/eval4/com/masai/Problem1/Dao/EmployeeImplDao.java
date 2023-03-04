package eval4.com.masai.Problem1.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import eval4.com.masai.Problem1.DBUtil.DBUtil;
import eval4.com.masai.Problem1.Exception.Employee;

public class EmployeeImplDao implements EmployeeDao {

	@Override
	public String registerEmployeeWithoutDeptId(Employee emp) {
		
		
         String str = "employee not registered";
		
		
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into employee(emplId,ename,address,email,password,salary) values(?,?,?,?,?,?)");
			
			ps.setInt(1,emp.getEmplId());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getAddress());
			ps.setString(4, emp.getEmail());
			ps.setString(5, emp.getPassword());
			ps.setInt(6, emp.getSalary());
			
			
			int x = ps.executeUpdate();
			
			
			if(x>0)
				str ="Employee added Sucessfully ";
	
			
	    	} catch (Exception e) {
			str = e.getMessage();
			
		 }
		
		
		return str;
    
	}

	@Override
	public String assigningDeptToEmp(int deptId, int emplId) {
		// TODO Auto-generated method stub
		
		
		 String isAssigned = "Employee Not Assigned to Any Dept";
			
			
			
			try (Connection conn = DBUtil.provideConnection()){
				
				PreparedStatement ps = conn.prepareStatement("update employee set deptId=? where emplId =?");
				
				ps.setInt(1,deptId);
				ps.setInt(2,emplId);
				
				
				int x = ps.executeUpdate();
				
				
				if(x>0) 
					
					isAssigned = "Employee Assigned to department sucessfully";
				
			}
	               

              catch (Exception e) {
                      System.out.println(e.getMessage()); 
				
			 }
			
			
			return isAssigned;
	    
		}

		

	@Override
	public String loginEmployee(String emailId, String password) {
		// TODO Auto-generated method stub
		
		
		
		String logIn = "Invalid Credentials";
		
		

		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from  employee where email= ? And  password =?");
			
			ps.setString(1,emailId);
			ps.setString(2,password);
			
			
			ResultSet x = ps.executeQuery();
			
			
			if(x.next())
				
				logIn ="Welcome +  " + x.getString("ename");
	
			
	    	} 
               

          catch (Exception e) {
                  System.out.println(e.getMessage()); 
			
		 }
		
		
		return logIn;
	
		
	}

	@Override
	public void employeePassword(String email, String password) {
		// TODO Auto-generated method stub
		
     try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update employee set password=? where email=?");
			
			ps.setString(1, password);
			
			ps.setString(2, email);
			
			int x = ps.executeUpdate();
			
			
			if(x > 0) {
				
				
				System.out.println("password updated.....");
				
				
			}
			
			else {
				
				System.out.println("employee not found Please fill the Proper Details...");
				
			}
			
			
		} 
            catch (SQLException e) {
			
			System.out.println(e.getMessage());
			
		}

	}

		
	}
	


