package CustomerTask2;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private Double debt;
    private List<Customer> customers = new ArrayList<>();

    @Override
    public String toString() {
        return getName() + " " + getDebt() + " AZN borc";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDebt() {
        return debt;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public List<Customer> getFieldFilter(){
        return this.customers.stream().filter(e -> e.getDebt() > 350).toList();

    }

    public Customer() {
    }

    public Customer(String name, Double debt) {
        this.name = name;
        this.debt = debt;
    }
}
