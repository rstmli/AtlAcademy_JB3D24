import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ədədi daxil edin: ");
        var num = scanner.nextInt();
        if(num%3==0 || num%4==0) {
            System.out.println("Bu ədəd həm 3'ə və ya 4'ə qalıqsız bölünür.");
        } else{
            System.out.println("Bu ədəd 3'ə və 4'ə qalıqsız bölünmür.");
        }
    }
}
