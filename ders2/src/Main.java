//import java.math.BigDecimal;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        var myBigdecimal = BigDecimal.valueOf(12.400);
//        var myBigdecimal2 = BigDecimal.valueOf(20.20);
//        System.out.print(myBigdecimal.add(myBigdecimal2));
//
//    }
//}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("ededi daxil edin: ");
//        var a = scanner.nextInt();
//        System.out.print("ikinci ededi daxil edin: ");
//        var b = scanner.nextInt();
//        var tam = a/b;
//        var kesir = a%b;
//        System.out.print("tam: " + tam + " kesir: " + kesir);

        int a = scanner.nextInt();
        int b = a / 1000;
        int c = (a/100) % 10;
        int d = a % 100;
        int e = b * c;
        System.out.print("yuzluk: " + b + " onluq: " + c + " cemi: " + d + " hasili: " + e);


//        var a = 3;
//        var b = 4;
//        var c = 5;
//        var d = 6;
//        System.out.println((a*b*c*d));

    }
}
