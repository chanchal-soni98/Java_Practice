package ques3;

public class rohit extends Thread{
//    Set the max priority to the Dhoni thread.
    int product = 1;
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            product*=i;

        }
        System.out.println("Rohit- "+product);
    }


}
