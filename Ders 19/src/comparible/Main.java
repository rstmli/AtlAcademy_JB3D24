package comparible;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var emp1 = new Employee("Aytac",4000,22);
        var emp2 = new Employee("Huseyn",4001,21);
        var emp3 = new Employee("Ulker",5000,28);
        var list = Arrays.asList(emp1, emp2, emp3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
