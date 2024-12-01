package meneger;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(12, "Huseyn", 2022, "Kapital Bank");
        Manager manager = new Manager(113, "Kheyransa", 2023, "Kapital Bank", "departamentini idarə edir.",300.50);
        Manager manager2 = new Manager(114, "Jehuna", 2022, "Kapital Bank", "departamentini idarə edir.",305.50);
        Director director = new Director(200,"Mushfig",2022,"Kapital Bank","şirkətin idarə heyətindədir və rəhbərlik edir.",500);

        employee.work();
        manager.work();
        manager.createStrategicPlan("strateji plan hazırlayır.");
        manager2.work();
        manager2.createStrategicPlan("strateji plan hazırlayır.");
        director.work();
        director.approveStrategicPlan("strateji planı təsdiqlədi.");
    }
}
