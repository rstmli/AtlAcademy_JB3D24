import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("4 rəqəmli ədəd daxil edin: ");
        int number = scanner.nextInt();
        var a = number / 1000;
        var b = (number / 100)%10;
        var c = (number / 10)%10;
        var d = (number % 10);
        boolean total = a==d && b==c;
        System.out.print("4 rəqəmli ədəd sinmetrikdir: " + total);
    }
}
