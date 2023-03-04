package eval1;
//import java.lang.*;
import java.util.*;
import java.util.function.Predicate;
public class ques1_impl {
    public static void main(String args) {

//		prdicate
        Employee e1 = new Employee(1, "Chanchal", 8000);
        Employee e2 = new Employee(2, "neetu", 10000);
        Employee e3 = new Employee(3, "akni", 9000);
        Employee e4 = new Employee(4, "nav", 7000);


        List<Employee> emp = new ArrayList<Employee>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);


        Predicate<Employee> predicateSalary = s ->s.salary>8000;

        for(Employee e : emp) {
            if(predicateSalary.test(e)) {
                System.out.println(e.name);
            }
        }


//		consumer
//		 Print the Employee's details.
//		Consumer<Employee> detail =

    }

}
