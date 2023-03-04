package UseCases;

import java.time.LocalDateTime;

import com.masai.Dao.ProblemOneDao;
import com.masai.Dao.ProblemOneDaoImpl;
import com.masai.Entity.Month;
import com.masai.Entity.PaySlip;

public class createPayslip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProblemOneDao dao = new ProblemOneDaoImpl();
		
		PaySlip slip = new PaySlip();
		slip.setCreatedAt(LocalDateTime.now());
		slip.setMonth(Month.APRIL);
		slip.setSalary(34);
		
		ProblemOneDao da = new ProblemOneDaoImpl();
		
		da.createPayslip(slip, 1);
		
		

	}

}
