package bankoop;

public class Customer{
    private String name;
    private double balance;
    private String unicalId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUnicalId() {
        return unicalId;
    }

    public void setUnicalId(String unicalId) {
        this.unicalId = unicalId;
    }

    public Customer(String name, double balance, String unicalId) {
        this.name = name;
        this.balance = balance;
        this.unicalId = unicalId;
    }
    public void updateBalance(double amount){
        this.balance +=amount;
    }

//    public void decreaseBalance(double amount){
//        try{
//            if(amount <= 0){
//                throw  new InsufficientFundsException("Balans menfi ve ya sifir ola bilmez.");
//            } else if ( amount > balance) {
//                throw  new InsufficientFundsException("balansinizda kifayet qeder  mebleg yoxdur balansinizdaki mebleg: " + balance);
//            } else if (amount < balance){
//                balance -=  amount;
//                System.out.println(balance);
//            }
//        } catch (InsufficientFundsException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }

//    public void refund(double amount){
//        try{
//            if(amount <= 0){
//                throw  new InvalidAmountException("daxil edilen mebleg menfi ve ya sifir ola bilmez.");
//            } else if ( amount > balance) {
//                throw  new InsufficientFundsException("balansinizda kifayet qeder  mebleg yoxdur balansinizdaki mebleg: " + balance);
//            } else if (amount < balance){
//                balance -=  amount;
//                System.out.println("Emeliyyat ugurlu oldu balans: " + balance);
//            }
//        } catch (InsufficientFundsException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
//    public void pay(double amount){
//
//
//    }


}
