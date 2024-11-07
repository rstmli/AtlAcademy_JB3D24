import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int number = scanner.nextInt();
        boolean compare = number < 1000 == number >= 100;
        System.out.print("bu ədəd 3 rəqəmlidir?: " + compare);
    }
}
