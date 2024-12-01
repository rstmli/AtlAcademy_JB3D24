package bankoop;

public class BankCustomer extends BankOperation implements PaymentService {
    private final Customer customer;


    public BankCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public void refund(double amount) {
        if(amount <= 0){
            throw  new InvalidAmountException("daxil edilen mebleg menfi ve ya sifir ola bilmez.");
        }
        customer.updateBalance(amount);
        System.out.println("pul geri qaytarildi: " + amount);
    }

    @Override
    public void pay(double amount) {
        if(amount <= 0){
            throw  new InvalidAmountException("daxil edilen mebleg menfi ve ya sifir ola bilmez.");
        }if ( amount > customer.getBalance()) {
            throw  new InsufficientFundsException("balansinizda kifayet qeder  mebleg yoxdur balansinizdaki mebleg: " + customer.getBalance());
        }
        customer.updateBalance(-amount);
        System.out.println("odenis edildi: " + amount);
    }

    @Override
    public void deposite(double amount) {
        if (amount <= 0){
            throw new InvalidAmountException("daxil edilen mebleg menfi ve ya sifir ola bilmez.");
        }
        customer.updateBalance(amount);
        System.out.println("balans artirildi: " + amount);
    }

    @Override
    public double checkbalance() {
        return customer.getBalance();
    }


}
