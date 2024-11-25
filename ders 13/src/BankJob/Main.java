package BankJob;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        BankAccount bankaccount = new BankAccount("AZ43082345124",1000);
        bankaccount.setBalance(-200);
        bankaccount.withDraw(1520);
        bankaccount.deposit(200);


    }
}
