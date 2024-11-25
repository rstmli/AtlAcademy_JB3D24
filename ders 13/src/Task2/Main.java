package Task2;

public class Main {
    public static void main(String[] args) {
        Transaction creditcard = new CreditCard(200,"AZ78284","Huseyn Rustemli");
        Transaction paypal = new PayPal(500,"rstmli08@gmail.com");
        creditcard.setAmount(300);
        System.out.println(creditcard.getPaymentDetails());
        System.out.println(paypal.getPaymentDetails());

    }

}
