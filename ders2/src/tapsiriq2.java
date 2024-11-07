import java.util.Scanner;

public class tapsiriq2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("üç rəqəmli ədəd daxil edin: ");
        int a = scanner.nextInt();
        var b = a / 100;
        var c = (a/10) % 10;
        var d = a % 10;
        System.out.println("Yüzdəlik: " + b + " / ondalıq: " + c + " / təklik: " + d);
        System.out.println("Ədədlərin cəmi: " + (b+c+d) + " / ədədlərin fərqi: " + (b-c-d) + " / ədədlərin hasili: " + (b*c*d));

    }
}
