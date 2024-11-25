package BankJob;

public class BankAccount {
    private String accountNumber;
    private double balance;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
       return balance;
    }

    public void setBalance(double balance) {
        if(balance >=0) {
            this.balance = balance;
        }else{
            System.out.println("balans mənfi ola bilməz!");
        }
    }
    public void withDraw(double amount){
        if(amount > 0 && amount < balance){
            balance -= amount;
            System.out.println(accountNumber + "! balansınızdan " + amount + " AZN silindi:" + " qalan balans: " + balance + " AZN");
        }if (amount == 0){
            System.out.println(amount + " AZN duzgun pul vahidi deyil");
        }else if (amount > balance){
            System.out.println(accountNumber + "balansınızda " + amount + " AZN yoxdur! balans: " + balance + " AZN");
        }else{
            System.out.println("mənfi ədəd daxil edilə bilməz!");
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println(accountNumber + "! balansınıza " + amount + " AZN əlavə edildi balans: " + balance + " AZN");
        }else{
            System.out.println("Daxil etdiyiniz pul mənfi ola bilməz");
        }
    }
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

}
