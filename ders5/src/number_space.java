import java.util.Scanner;

public class number_space {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var mesaj = "2 reqemli eded daxil edin: ";
        System.out.print(mesaj);
        int a = scanner.nextInt();
        while (true){
            if (a< 10 || a>99){
                System.out.println("Daxil etdiyiniz eded iki reqemli deyil");
                System.out.print(mesaj);
                a = scanner.nextInt();
            }else{
                var b = a/10;
                var c = a%10;
                System.out.println(b + " " + c);
                break;
            }
        }
    }
}
