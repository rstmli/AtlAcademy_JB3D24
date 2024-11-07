import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var mount = scanner.next();
        switch(mount){
            case "dekabr":
            case "yanvar":
            case "fevral":
                System.out.println("qiş fesli");
                break;
            case "mart":
            case "aprel":
            case "may":
                System.out.println("yaz fesli");
            case "iyun":
            case "iyul":
            case "avqust":
                System.out.println("yay fesli");
            case "sentyabr":
            case "oktyabr":
            case "noyabr":
                System.out.println("payız fesli");
        }
    }
}
