import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı girin: ");
        var age = scanner.nextInt();
        System.out.print("Atanızın yaşını girin: ");
        var fatherAge = scanner.nextInt();
        var total = fatherAge - age;
        System.out.print("Ata oğlundan " + total + " yaş böyükdür" );
    }
}