import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.EMUtil.EMUtil;
import com.masai.Entity.VegBiryani;

public class GETALLVB {

	public static void main(String[] args) {
		
		
		EntityManager em=EMUtil.provideEntityManager();
		
		String jpql="select v from VegBiryani v";
		Query q=em.createQuery(jpql);
		List<VegBiryani> list=q.getResultList();
		list.forEach(res->System.out.println(res));

	}

}
