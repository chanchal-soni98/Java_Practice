package problem3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Eat {

	CookDao cd;
	
	
	

	public Eat(CookDao cd) {
		super();
		this.cd = cd;
	}


	public void setS(CookDao cd) {
		this.cd = cd;
	}
	
	
	public void eatFood() {
		cd.cook();
		System.out.println("food type..");
	}



	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Eat e = ctx.getBean("eat",Eat.class);
		
		e.eatFood();
		
		// TODO Auto-generated method stub

	}


}
