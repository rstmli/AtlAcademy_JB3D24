package Task2;

public class PayPal extends Transaction{
    private String email;

    public PayPal(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println(amount + "$ pul hesabiniza kocurulur");
    }

    @Override
    public String getPaymentDetails() {
        return email + " hesabina " + amount + " qedder $ elave olundu.";
    }
}
