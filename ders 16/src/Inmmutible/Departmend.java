package Inmmutible;

import java.util.ArrayList;

public class Departmend {
    private final String name;
    private final Integer employeeCount;
    private final ArrayList<Employee> employees;

    public String getName() {
        return name;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public Departmend(String name, Integer employeeCount, ArrayList<Employee> employees) {
        this.name = name;
        this.employeeCount = employeeCount;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Departmend{" +
                "name='" + name + '\'' +
                ", employeeCount=" + employeeCount +
                ", employees=" + employees +
                '}';
    }
}
