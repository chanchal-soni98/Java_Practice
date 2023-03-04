package funcIntr;

public class X {
	
//	@Override
//	public void sayHello(String name) {
//		
//		System.out.println("Welcome: "+ name);
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		Intr i1 = new X();
//		i1.sayHello("Ram"); Using child class
		
//		usind Annonymous
//		
		Intr i1 = new Intr() {
			@Override
			public void sayHello(String name) {
				
				System.out.println("Welcome: "+ name);
				
			}
			
		}; 
		
//		shortcut using LE
		
		i1.sayHello("Amit");
		
		Intr i2 = n ->{
			System.out.println("Welcome: "+ n);
			};
		
		i2.sayHello("Kapil");
	}



}
