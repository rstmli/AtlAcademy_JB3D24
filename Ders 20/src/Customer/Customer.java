package Employee;

import java.util.Objects;

public class Customer {
    private String name;
    private Double debt;

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

    public Customer(String name, Double debt) {
        this.name = name;
        this.debt = debt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(debt, customer.debt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, debt);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", debt=" + debt +
                '}';
    }
}
