package meneger;

public class Director extends Manager{
    public double bonus;

    public Director(int no, String name, int year, String department, String departmentManaged, double bonus) {
        super(no, name, year, department, departmentManaged,bonus);
        this.bonus = bonus;
    }


    @Override
    public void work() {
        System.out.println(name + " " + department +" " +departmentManaged + "Aldigi maas: " + calculateSalary() + " AZN" + " bonus: " + this.bonus + " toplam maas: " + (calculateSalary() + this.bonus));
    }

    @Override
    public double calculateSalary() {
        double managerSalary = super.calculateSalary();
        double employeeSalary = super.calculateSalary();
        return managerSalary + employeeSalary;
    }


    public void approveStrategicPlan(String confirmation) {
        System.out.println(this.name + " " + confirmation);
    }
}
