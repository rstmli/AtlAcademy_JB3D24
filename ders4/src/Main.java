import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        var a = scanner.nextLine();
        var username = "admin";
        if(a.equals(username)){
            System.out.println("Wellcome");
        } else{
            System.out.println("username not found " + a);
        }
    }
}