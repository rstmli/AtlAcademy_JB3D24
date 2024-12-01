package meneger;

public class Manager extends Employee {
    public String departmentManaged;
    public double bonus;
    public static final int MANAGEMENT_PAYMENT = 2500;

    public Manager(int no, String name, int year, String department, String departmentManaged,double bonus) {
        super(no, name, year, department);
        this.departmentManaged = departmentManaged;
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println(name + " işə başlayıb: " + year + " ilde " + department + " " + departmentManaged + "Aldigi maas: " + calculateSalary() + " AZN" + " bonus: " + this.bonus + " toplam maas: " + (calculateSalary() + this.bonus));
    }

    @Override
    public double calculateSalary() {
        double employeeSalary = super.calculateSalary();
        return MANAGEMENT_PAYMENT + employeeSalary;
    }
    public void createStrategicPlan(String plan) {
        System.out.println(this.name + " " + plan);
    }


}

