package eval4.com.masai.Problem1.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import eval4.com.masai.Problem1.DBUtil.DBUtil;
import eval4.com.masai.Problem1.Exception.Department;

public class DepartmentImplDao implements DepartmentDao{

	@Override
	public String addDepartment(DepartmentDao dept) {
		
		String str = "Department Not Added";
		
		
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into department values(?,?,?)");
			
			
			
			ps.setInt(1, dept.getDid());
			ps.setString(2, dept.getDname());
			ps.setString(3, dept.getLocation());
			
			
			int x = ps.executeUpdate();
			
			
			if(x>0)
				str ="Department added Sucessfully ";
	
			
	    	} catch (Exception e) {
			str = e.getMessage();
			
		 }
		
		
		return str;
    	}

	
	
	
	
	@Override
	public List<Department> getAllDepartment() {
		
             List<Department> department = new ArrayList<>();
    
		
		  try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps = conn.prepareStatement("select * from department");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Department dept = new Department(rs.getInt("did"), rs.getString("dname"), rs.getString("location"));
				
				department.add(dept);
				
			}			
			
		} catch (SQLException e) {			
			System.out.println(e.getMessage());			
		}
		
		return department;
	}

	
	

	@Override
	public String updateDepartmentLocation(int deptId, String location) {

		
		
      String Anyupdate = "location not updated till Now ..";
      
      
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update department set location=? where did=?");
			
			ps.setString(1, location);
			ps.setInt(2, deptId);
			
			int x = ps.executeUpdate();
			
			if(x> 0) {
				
				Anyupdate = "location  is  updated Now  ......";
			}
			
		} catch (SQLException e) {			
			System.out.println(e.getMessage());			
		}
		
		return Anyupdate;
		
	}
	

	
	

	@Override
	public void deleteDepartment(int did) {
		// TODO Auto-generated method stub
		
      try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("delete from department where did=?");
			
			ps.setInt(1, did);
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				System.out.println("Department has been  deleteted...........");
			}
			else
				System.out.println("Department  Still not deleted...");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}





	@Override
	public String addDepartment(Department dept) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public int getDid() {
		// TODO Auto-generated method stub
		return 0;
	}





	@Override
	public String getDname() {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
	


