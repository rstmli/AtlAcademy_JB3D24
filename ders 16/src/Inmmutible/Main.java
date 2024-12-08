package Inmmutible;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var emp = new Employee("Huseyn", "Rustemli",20);
        var emp2 = new Employee("ILkin", "Mirzeyev",27);
        var emp3 = new Employee("Elvin", "Alman",12);
        var dept = new Departmend("Kapital bank",3,
                (ArrayList<Employee>) List.of(emp,emp2));

        var deptEmp = dept.getEmployees();
        deptEmp.add(emp3);
        System.out.println(deptEmp);
    }
}
