import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk ədədi daxil edin: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Müvafiq əməliyyatı daxil edin (+, -, *, /): ");
        var op = scanner.next();
        System.out.print("İkinci ədədi daxil edin: ");
        double secondNumber = scanner.nextDouble();

        if(op.equals("+")) {
            System.out.println("cavab: " + (firstNumber + secondNumber));
        }else if(op.equals("-")) {
            System.out.println("cavab: " + (firstNumber - secondNumber));
        }else if(op.equals("*")) {
            System.out.println("cavab: " + (firstNumber * secondNumber));
        }else if(op.equals("/")) {
            System.out.println("cavab: " + (firstNumber / secondNumber));
        }else{
            System.out.println("daxil etdiyiniz eded duzgun deyil");
        }



    }
}
