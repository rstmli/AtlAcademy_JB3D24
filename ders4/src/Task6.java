import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discount = 5;
        System.out.print("Müştərinin etdiyi alışverişin qiyməti: ");
        var a = scanner.nextDouble();

        if(a > 1 && a < 300) {
            var discountCalculation = a * discount / 100;
            var sonmebleg = a - discountCalculation;
            System.out.println("endirimli mebleg: " + sonmebleg);
        }else if(a > 300 && a < 600) {
            discount+=2.5;
            var discountCalculation = a * discount / 100;
            var sonmebleg = a - discountCalculation;
            System.out.print("endirimli mebleg: " + sonmebleg);
        }else if(a > 600) {
            discount+=5;
            var discountCalculation = a * discount / 100;
            var finalPrice = a - discountCalculation;
            System.out.print("endirimli mebleg: " + finalPrice);
        }else{
            System.out.println("daxil etdiyiniz eded duzgun deyil");
        }

    }
}
