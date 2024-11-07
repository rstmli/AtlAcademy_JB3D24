import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ədədi daxil edin: ");
        var score = scanner.nextInt();
        if (score>=91 && score<=100) {
            System.out.println("balınız: A");
        } else if (score>=81 && score<=90){
            System.out.println("balınız: B");
        }else if (score>=71 && score<=80){
            System.out.println("balınız: C");
        }else if (score>=61 && score<=70){
            System.out.println("balınız: D");
        }else if (score>=51 && score<=60){
            System.out.println("balinız: E");
        }else{
            System.out.println("balınız: F");
        }
    }
}



/*
 * 91-100 = A - ELA
 * 81-90 = B - COX YAXSI
 * 71-80 = C - YAXSI
 * 61-70 = D - KAFI
 * 51-60 = E - QENAETBEXS
 * 51 - baldan asagi = F - QEYRI KAFI
 */