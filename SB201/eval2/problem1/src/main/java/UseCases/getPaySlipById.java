package UseCases;

import com.masai.Dao.ProblemOneDao;
import com.masai.Dao.ProblemOneDaoImpl;

public class getPaySlipById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProblemOneDao dao = new ProblemOneDaoImpl();
		System.out.println(dao.getPayslipByID(1));

	}

}
