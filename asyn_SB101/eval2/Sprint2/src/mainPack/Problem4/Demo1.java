package mainPack.Problem4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		List<Employee> e = new ArrayList<>();
		e.add(new Employee(1,"name1",1000,"gamil1.com","abc", new Address("raj","kota","23145")));
		e.add(new Employee(2,"name2",2000,"gamil2.com","abc2", new Address("raj1","kota1","23145")));
		e.add(new Employee(3,"name3",3000,"gamil3.com","abc3", new Address("raj2","kota2","23145")));
		e.add(new Employee(4,"name4",4000,"gamil4.com","abc4", new Address("raj3","kota3","23145")));
		e.add(new Employee(5,"name5",5000,"gamil5.com","abc5", new Address("raj4","kota4","23145")));
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\CHANCHAL SONI\\Desktop\\masai_code\\chanchal_fw20_1352\\asyn_SB101\\eval2\\Sprint2\\src\\mainPack\\Problem4\\employeedata"));
		
		oos.writeObject(e);
		oos.close();
		
	}

}
