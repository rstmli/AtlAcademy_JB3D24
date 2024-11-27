package EnumTest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        String[] customer = {"huseyn","ulker","aytac","ilkin"};
//        String[] merchant = {"musa","xanbala","ismayil","elnur"};
//        String password = "12345";
//        System.out.print("enter username: ");
//        var enteredUsername = scanner.next();
//        System.out.print("enter your category: ");
//        var userType = scanner.next();
//        System.out.print("enter password: ");
//        var enteredPassword = scanner.next();
//
//        if(userType.equals(UserTypes.CUSTOMER.toString())){
//            Tools.checkUserDetails(customer,enteredUsername,enteredPassword,password);
//
//        } else if (userType.equals(UserTypes.MERCHANT.toString())) {
//            Tools.checkUserDetails(merchant,enteredUsername,enteredPassword,password);
//        }else{
//            System.out.println("wrong user type");
//        }
//        System.out.print("\u001B[36m");
//        System.out.println("merhaba".toUpperCase());
//        System.out.print("\u001B[35m");
//        System.out.println("merhaba".toUpperCase() + "\u001B[0m" + " Arkadaslar");

        while(true){
            try {
                System.out.print("Bir tam sayı giriniz: ");
                int sayi = scanner.nextInt();
                System.out.println("Girdiğiniz sayı: " + sayi);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Hata: Lütfen tam sayı giriniz.");
                scanner.next(); // Yanlış girişi temizlemek için
            }
        }



    }
}
