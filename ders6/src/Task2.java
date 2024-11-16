import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var cem = 0;
        while(true){
            System.out.print("ədədi daxil edin: ");
            var a = scanner.nextInt();
            if(a!=0){
                cem = a+cem;
            }

            else{
                break;
            }
        }
        System.out.println("Ümumi məbləğ: " + cem);
    }
}
