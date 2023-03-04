package ques3;

public class viratThread extends Thread{
    int sum = 0;
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            sum+=i;

        }
        System.out.println("virat- "+sum);
    }


}
