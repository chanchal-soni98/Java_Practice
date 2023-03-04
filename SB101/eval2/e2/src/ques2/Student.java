package ques2;


import java.util.concurrent.Callable;

public class Student implements Callable<String> {

    int roll ;
    int marks;
    String name;
    String address;

    public Student(int roll,String name,String address, int marks){
        super();
        this.roll = roll;
        this.name = name;
        this.address= address;
        this.marks = marks;
    }

    @Override
    public String call(){
//        return null;
        return  "Roll "+roll+" Student is Fail";
    }
}

