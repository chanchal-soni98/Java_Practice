package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileSys {

	public static void main(String[] args) throws IOException {
		
	
			File file = new File("a1.txt");
			if (file.createNewFile()) {
			System.out.println("New File is created!");
			} else {
			System.out.println("File already exists.");
			}
			
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("a1.txt");
		fw.write(100);//d will be added
		fw.write("ramesh\nwelcome");
		fw.write("\n");
		fw.write("india");
		fw.write("\n");
		char ch[]={'a','b','c'};
		fw.write(ch);
		fw.flush();
//		fw.close();
		System.out.println("done");
		
		FileReader fr=new FileReader("a1.txt");
		int i=fr.read();
		while( i != -1) {
		System.out.print((char) i);
		i = fr.read();
		
		BufferedWriter bw = new BufferedWriter(fw);
//		
//		BufferedWriter bw = new BufferedWriter("abc.txt"); //error
//		BufferedWriter bw = new BufferedWriter(new File("abc.txt")); //error
//		BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt")); //OK
		
		bw.write(100);//d will be added
		bw.newLine(); //inserting a new line
		bw.write("ramesh");
		bw.newLine();
		bw.write("india");
		bw.newLine();
		char ch1[]={'a','b','c'};
		bw.write(ch1);



		bw.flush();
//		bw.close();
		System.out.println("done");
		
		
//		BufferedReadr br=new BufferedReader(Reader r);
		
		BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
		
		String line=br.readLine();
		while(line != null){
		System.out.println(line);
		line=br.readLine();
		}
//		br.close();

		}
		PrintWriter pw=new PrintWriter(fw);
		PrintWriter pw1=new PrintWriter(file);
		PrintWriter pw2=new PrintWriter(fw);
		
		
		PrintWriter out=new PrintWriter("abc.txt");
		out.write(100);//d will be added
		out.println(100);
		out.println(true);
		out.println('c');
		out.println("amit");
		out.flush(); //need not call the flush method
		out.close();
		System.out.println("done..");
	}

}
