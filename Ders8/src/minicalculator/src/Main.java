import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var topla1 = new toplama();
        var cix1 = new cixma();
        var vur1 = new Vurma();
        var bol1 = new Bolme();

        int a  = scanner.nextInt();
        int b = scanner.nextInt();
        var c = scanner.next();


        if(Objects.equals(c, "+")){
            var cem = topla1.topla(a,b);
            System.out.println(cem);
        }else if(Objects.equals(c, "-")){
            var ferq = cix1.cix(a,b);
            System.out.println(ferq);
        } else if (Objects.equals(c, "*")) {
            int hasil = vur1.vur(a,b);
            System.out.println(hasil);
        } else if (Objects.equals(c, "/")) {
            var nisbet = bol1.bol(a,b);
            System.out.println(nisbet);
        }



    }
}