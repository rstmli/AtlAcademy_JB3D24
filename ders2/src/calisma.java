import javax.swing.*;
import java.util.Scanner;
////
public class calisma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Double a = 33.4;
//        var b = (int) a;
//        System.out.println();



        var yas = sc.nextInt();
        if (yas > 18) {
            System.out.print("siz telebesiniz");
        } else if (yas >=22) {
            System.out.println("siz universitedi bitirmisiniz ve artık telebe deyılsınız");
        } else {
            System.out.println("siz yetiksin insan deyilsiniz!");
        }
    }
}
