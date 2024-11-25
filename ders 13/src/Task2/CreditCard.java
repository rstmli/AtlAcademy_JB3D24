package Task2;

public class CreditCard extends Transaction{
    private String cardNumber;
    private String cardHolder;


    public CreditCard(double amount, String cardNumber, String cardHolder) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card Payment - Amount: $" + amount + ", Card Holder: " + cardHolder + ", Card Number: " + cardNumber;
    }
}
