package Employee;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Huseyn","Rustemli",500);
        manager.work();
        System.out.println(manager.calculateSalary());
    }
}
