package ques5;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter file = new FileWriter("src/ques5/q5");
            file.write("my name is Chanchal Soni. ");
            file.write("I graduated from nirma university ahmedabad.");
            file.close();

        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("Exception");
        }
    }
}
