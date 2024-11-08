import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ədədi daxil edin: ");
        var num = scanner.nextInt();
        if (num%4==0 && num%6==0){
            System.out.println("Bu ədəd 4'ə və 6'ya tam bölünür");
        }else if (num%4==0){
            System.out.println("Bu ədəd yalnız 4'ə bölünür");
        }else if (num%6==0){
            System.out.println("Bu ədəd yalnız 6'ya bölünür");
        }else{
            System.out.println("Bu ədəd nə 4'ə nə də 6'ya tam bölünür");
        }
    }
}
