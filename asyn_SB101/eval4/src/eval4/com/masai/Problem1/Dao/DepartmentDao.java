package eval4.com.masai.Problem1.Dao;

import java.util.List;

import eval4.com.masai.Problem1.Exception.Department;

public interface DepartmentDao {
	
    public String addDepartment(Department dept);

	
    public List<Department> getAllDepartment();
    
    
    public String updateDepartmentLocation(int deptId, String location);
    
    
    public void deleteDepartment(int did);


	String addDepartment(DepartmentDao dept);


	public int getDid();


	public String getDname();


	public String getLocation();

}
