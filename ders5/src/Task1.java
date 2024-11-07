import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ədədi daxil edin: ");
        var num = scanner.nextInt();
        if(num%3==0 && num%4==0){
            System.out.println("Bu ədəd həm 3'ə həm 4'ə qalıqsız bölünür.");
        } else if(num%3==0) {
            System.out.println("Bu ədəd Yalnız 3'ə qalıqsız bölünür.");
        } else if(num%4==0) {
            System.out.println("Bu ədəd yalnız 4'ə qalıqsız bölünür.");
        } else{
            System.out.println("Bu ədəd 3'ə və 4'ə qalıqsız bölünmür.");
        }
    }
}
