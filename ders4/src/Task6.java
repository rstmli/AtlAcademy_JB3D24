import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discount = 5.0;
        System.out.print("Etdiyiniz alışverişin qiyməti: ");
        var a = scanner.nextDouble();

        if(a >= 1 && a <= 300) {
            var discountCalculation = a * discount / 100;
            var finalPrice = a - discountCalculation;
            System.out.println("ödəyəcəyiniz məbləğ: " + finalPrice + " AZN");
        }else if(a >= 300 && a <= 600) {
            discount+=2.5;
            var discountCalculation = a * discount / 100;
            var finalPrice = a - discountCalculation;
            System.out.print("ödəyəcəyiniz məbləğ: " + finalPrice + " AZN");
        }else if(a > 600) {
            discount+=5;
            var discountCalculation = a * discount / 100;
            var finalPrice = a - discountCalculation;
            System.out.print("ödəyəcəyiniz məbləğ: " + finalPrice + " AZN");
        }else{
            System.out.println("daxil etdiyiniz məbləğ düzgün deyil!");
        }




    }
}
