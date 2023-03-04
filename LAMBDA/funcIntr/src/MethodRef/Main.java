package MethodRef;

public class Main {
	
	public static void fun1(String s) {
		System.out.println("Static MR");
	}
	
	public static int fun2(String s) {
		return Integer.parseInt(s);
	}
	
	public void fun3(int num){
		System.out.println("Using non-static Method reference Welcome "+num);
		}

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
		Intr i = Main::fun1;	
		i.sayHello("ram");
		
		Intr1 i1 = Main::fun2;
		System.out.println(i1.convertToNumber("78"));
		
		Intr2 i2 = new Main()::fun3;
		
		i2.printNumber(89);
		
		System.out.println(true && false);
		System.out.println(true && false || true);

	}

}
