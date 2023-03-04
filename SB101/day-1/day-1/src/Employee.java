import java.util.*;
import java.lang.*;
public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n);

        TreeSet<q2_treeset> set = new TreeSet<q2_treeset>();

        // Creating Car objects
        q2_treeset c1 = new q2_treeset(132, "Chanchal", "Rajkot", 35);
        q2_treeset c2 = new q2_treeset(269, "Neetu", "Surat", 20);
        q2_treeset c3 = new q2_treeset(560, "Akhi", "Vadodara", 15);
        q2_treeset c4 = new q2_treeset(109, "Meenu", "Ahmedabad", 26);
        q2_treeset c5 = new q2_treeset(860, "ramu", "Pratapgarh", 17);
        q2_treeset c6 = new q2_treeset(809, "raju", "Hisar", 33);


        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        set.add(c5);
        set.add(c6);

//        for (q2_treeset c : set) {
//            System.out.println(c);
//        }




    }
}
