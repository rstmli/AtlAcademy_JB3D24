import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("adınızı daxil edin: ");
        var name = scanner.nextLine();
        System.out.print("yaşınızı daxil edin: ");
        var age = scanner.nextInt();
        var calculator = 2024 - age;
        System.out.print("salam " + name + "! siz " + calculator + " tarixində doğulmusunuz.");
    }
}