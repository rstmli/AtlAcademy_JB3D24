package Employee;

public class Manager implements Employee {
    private String name;
    private String surname;
    private double sallary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    public Manager(String name, String surname, double sallary) {
        this.name = name;
        this.surname = surname;
        this.sallary = sallary;
    }

    @Override
    public void work() {
        System.out.println("Menecer komandaya rəhbərlik edir");
    }

    @Override
    public double calculateSalary() {
        return sallary + (sallary * 0.2);
    }
}
