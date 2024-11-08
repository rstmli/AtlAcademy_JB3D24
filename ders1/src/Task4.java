import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ədədi daxil edin: ");
        var number = scanner.nextInt();
        var total = number * number;
        System.out.print(number + " ədədinin kvadratı: " + total );
    }
}