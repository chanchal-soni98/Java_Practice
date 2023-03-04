package eval4.com.masai.Problem1.useModel;

import java.util.List;

import eval4.com.masai.Problem1.Dao.DepartmentDao;
import eval4.com.masai.Problem1.Dao.DepartmentImplDao;
import eval4.com.masai.Problem1.Exception.Department;

public class getAllDepartement {
	
		public static void main(String[] args) {
			
			DepartmentDao d = new DepartmentImplDao();
			
			List<Department> department = d.getAllDepartment();
					
			department.forEach(dep -> System.out.println(dep));
				
	}
}
