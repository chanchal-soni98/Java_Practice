package ques3;

public class Main {
    public static void main(String[] args) {
        dhoni d = new dhoni();
        rohit r = new rohit();
        viratThread v = new viratThread();
        d.setPriority(10);
       r.setPriority(5);
//       v.setPriority(0);

        d.start();
        r.start();
        v.start();

    }
}
