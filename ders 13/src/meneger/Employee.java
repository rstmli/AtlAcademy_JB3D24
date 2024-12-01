package meneger;

public class Employee {
    public int no;
    public String name;
    public int year;
    public String department;
    public static final int BASE_SALARY = 500;

    public void work(){
        System.out.println(name + " işə başlayıb: " + year + " ilde " + department + " departamentində çalışır. " + "Aldigi maas: " + calculateSalary() + " AZN");
    }
    public double calculateSalary(){
        int yearsWorked = 2024 - this.year;
        return BASE_SALARY * yearsWorked;
    }

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }
}
