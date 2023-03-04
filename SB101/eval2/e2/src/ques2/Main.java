package ques2;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;


public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Student[] student = {
                new ques2.Student(1,"chanchal","pratapgarh",445),
                new ques2.Student(2,"chelsi","pratapgarh",545),
                new ques2.Student(3,"soni","pratapgarh",345),
                new ques2.Student(4,"rama","pratapgarh",745)
        };

//            System.out.println(student);

        ExecutorService es = Executors.newFixedThreadPool(4);
        for(Student st: student){
            Future future= es.submit(st);
            try{
                System.out.println(future.get());
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }catch (ExecutionException ie){
                ie.printStackTrace();
            }
        }
        es.shutdown();
    }
}
