import java.util.Scanner;
public  class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Düzbucaqlının enini daxil edin: ");
        var width = scanner.nextInt();
        System.out.print("Düzbucaqlının uzunluğunu daxil edin: ");
        var length = scanner.nextInt();
        var sahe_total = width * length;
        var perimetr = 2 * (width + length);
        System.out.println("Düzbucaqlının terefleri " + width + " metr eni  " + length + " metr uzunluğu");
        System.out.println("Düzbucaqlının sahesi: " + sahe_total);
        System.out.println("Düzbucaqlının perimetri: " + perimetr);
    }
}