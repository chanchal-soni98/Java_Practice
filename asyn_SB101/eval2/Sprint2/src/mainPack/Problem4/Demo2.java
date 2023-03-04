package mainPack.Problem4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employeedata"));
		
		List<Employee> e = (List<Employee>) ois.readObject();
		ois.close();
		e.forEach(System.out::println);
		
		e.add(new Employee(7,"name7",7000,"gamil7.com","abc7", new Address("raj7","kota7","27145")));
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\CHANCHAL SONI\\Desktop\\masai_code\\chanchal_fw20_1352\\asyn_SB101\\eval2\\Sprint2\\src\\mainPack\\Problem4\\employeedata"));
		
		oos.writeObject(e);
		oos.close();
		
	}

}
