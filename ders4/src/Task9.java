import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ədədi daxil edin: ");
        var number = scanner.nextInt();

        if(number>1){
            System.out.println(number + " number is positive");
        } else if (number == 0){
            System.out.println(number + " = 0");
        } else {
            System.out.println(number + " number is negative");
        }
    }
}
