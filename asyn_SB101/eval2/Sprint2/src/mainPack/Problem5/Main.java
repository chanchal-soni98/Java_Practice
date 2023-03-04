package mainPack.Problem5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader file = new FileReader("C:\\Users\\CHANCHAL SONI\\Desktop\\masai_code\\chanchal_fw20_1352\\asyn_SB101\\eval2\\Sprint2\\src\\mainPack\\Problem5\\abc");
		BufferedReader br = new BufferedReader(file);
		
		int value ;
		String res = "";
		while((value=br.read())!=-1){
			
			System.out.print((char) value);
			
			res+=(char) value;
			
			
		}
		
		PrintWriter pr = new PrintWriter("C:\\Users\\CHANCHAL SONI\\Desktop\\masai_code\\chanchal_fw20_1352\\asyn_SB101\\eval2\\Sprint2\\src\\mainPack\\Problem5\\xyz");
		pr.write(res);
		
		pr.close();

	}

}
