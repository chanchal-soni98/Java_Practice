import org.jetbrains.annotations.NotNull;

public class q2_treeset implements Comparable<q2_treeset> {
    int empId;
    String empName;
    String address;
    int salary;

    public q2_treeset(int empId, String empName, String address, int salary){
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public int compareTo(q2_treeset o) {
        return 0;
    }
}
