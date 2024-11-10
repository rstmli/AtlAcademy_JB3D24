import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ili daxil edin: ");
        var year =  scanner.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - ili uzun ildir");
        }else{
            System.out.println(year + " - uzun il deyil");
        }
    }
}
