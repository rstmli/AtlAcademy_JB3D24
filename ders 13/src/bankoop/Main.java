package bankoop;

public class Main {
    public static void main(String[] args) {
        var bankcustomer = new Customer("Huseyn",100,"AZ123214124");
        var customer = new BankCustomer(bankcustomer);
        try{
            System.out.println("Cari balans: " + customer.checkbalance());
            customer.deposite(100);
            System.out.println("Cari balans: " + customer.checkbalance());
            customer.pay(50);
            System.out.println("Cari balans: " + customer.checkbalance());
            customer.refund(500);
            System.out.println("Cari balans: " + customer.checkbalance());
            customer.deposite(-100);

        }catch (InvalidAmountException | InsufficientFundsException e){
            System.out.println(e.getMessage());

        }

    }
}
