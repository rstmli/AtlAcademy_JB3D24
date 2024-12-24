package Employee;

public class Developer implements Employee{
    private String name;
    private double sallary;

    @Override
    public void work() {
        System.out.println("developer olaraq kod yazir.");
    }

    @Override
    public double calculateSalary() {
        return sallary + (sallary*0.1);
    }
}
