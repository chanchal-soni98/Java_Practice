package fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		A a = new A();
		
		a.i=20;
		
		FileOutputStream fos = new FileOutputStream("file1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(a);
		
		oos.writeObject("welcomE");
		oos.writeObject(10);
		
		oos.close();
		
		System.out.println("a1 object is serailized");
		
		FileInputStream fis=new FileInputStream("file1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		A a1=(A)obj;
		a1.funA();
		String ss=(String)ois.readObject();
		System.out.println(ss);
		int z=(Integer)ois.readObject();
		System.out.println(z);
		ois.close();
		

	}

}
