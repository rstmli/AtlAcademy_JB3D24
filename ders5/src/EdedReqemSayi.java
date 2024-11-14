import java.util.Scanner;

public class EdedReqemSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        var reqemsayi = 0;
        if(number<0){
            number = -number;
            System.out.println(number);
        }
        for(;number>0;number/=10){
            reqemsayi++;
        }
        System.out.println(reqemsayi);
    }
}
