import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ay daxil edin: ");
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
                break;
            case "iyun":
            case "iyul":
            case "avqust":
                System.out.println("yay fesli");
                break;
            case "sentyabr":
            case "oktyabr":
            case "noyabr":
                System.out.println("payız fesli");
                break;
            default:
                System.out.println("bele bir ay yaxdur");
        }
    }
}
