import java.util.Scanner;

public class tapsiriq1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ilk ededi daxil edin: ");
        var a = scanner.nextInt();
        System.out.print("ikinci ededi daxil edin: ");
        var b = scanner.nextInt();
        System.out.println(a + " > " + b + ": " + (a>b));
        System.out.println(a + " < " + b + ": " + (a<b));
        System.out.println(a + " = " + b + ": " + (a==b));
        System.out.println(a + " >= " + b + ": " + (a>=b));
        System.out.println(a + " <= " + b + ": " + (a<=b));
        System.out.println(a + " != " + b + ": " + (a!=b));
    }
}
