import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.masai.Entity.VegBiryani;

public class INsertVegBiryani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<VegBiryani>v= new ArrayList<>();
		v.add(new VegBiryani(1,4,"g"));
		v.add(new VegBiryani(2,60," abh"));
		
		v.forEach(a-> insert(a));
	}
	public static void insert(VegBiryani v) {
		EntityManager em=EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(v);
		em.getTransaction().commit();
		em.close();
}
}

