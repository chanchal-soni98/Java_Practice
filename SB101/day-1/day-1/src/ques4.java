import java.lang.*;
import java.util.*;
//Q3/- Create a List of cities and sort them in descending order using Lambda
//Expression.
public class ques4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Pune");
        list.add("Goa");
        list.add("Kaiga");
        list.add("Delhi");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
