import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("4 rəqəmli ədəd daxil edin: ");
        int number = scanner.nextInt();
        var a = number / 1000;
        var b = (number / 100)%10;
        var c = (number / 10)%10;
        var d = (number % 10);
        boolean total = a < b && b < c && c < d;
        System.out.print("Ədədlər artan sıra ile düzülüb: " + total);
    }
}
