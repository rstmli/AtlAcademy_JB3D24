package CustomerTask2;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.addCustomer(new Customer("Huseyn",360.0));
        customer.addCustomer(new Customer("Emin",340.0));
        customer.getFieldFilter().forEach(System.out::println);

    }
}
