import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Günü rəqəmlə daxil edin: ");
        var week = scanner.nextInt();
        switch (week) {
            case 1:
                System.out.println("Bazar ertəsi");
                break;
            case 2:
                System.out.println("Çərşənbə axsamı");
                break;
            case 3:
                System.out.println("Çərşənbə");
                break;
            case 4:
                System.out.println("Cüme axsamı");
                break;
            case 5:
                System.out.println("Cüme");
                break;
            case 6:
                System.out.println("Şənbə");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("Daxil edilən gün səhfdir");
        }
    }
}
