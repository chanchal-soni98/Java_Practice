package fileIO;

import java.io.Serializable;

public class A implements Serializable{
	
	int i = 10;
	public void funA() {
		System.out.println("inside funA() of A");
		System.out.println(i);
	}

}
