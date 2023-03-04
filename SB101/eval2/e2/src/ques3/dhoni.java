package ques3;

public class dhoni extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Dhoni- "+i);
        }
    }

}
