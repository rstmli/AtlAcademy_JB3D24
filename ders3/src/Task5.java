import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        var total = (num%3) == 0 || (num%4) == 0 ;
        System.out.print("Ədəd 3 ve ya 4'e tam bölünür: " + total);
    }
}
