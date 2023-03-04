package funcIntr;

@FunctionalInterface
public interface Intr {

	//one abstract method
	void sayHello(String name);
	//Object class method
	boolean equals(Object obj);
	
	//default method
	default void fun1(){
	System.out.println("inside the default method fun1 of Intr");
	}
	//static method
	static void fun2(){
	System.out.println("inside the static method fun2 of Intr");
	}
	
//	Note: A functional interface can extends another interface only when it does not have any abstract
//	method.
}
