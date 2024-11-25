package Task2;

public abstract class Transaction implements Payment{
    protected double amount;

    public Transaction(double amount) {
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public abstract void processPayment(double amount);

    @Override
    public abstract String getPaymentDetails();
}
