import java.util.Scanner;

public class EdedReqemSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ədədi daxil edin: ");
        int number = scanner.nextInt();
        if(number>0){
            int reqemsayi = 0;
            for(;number>0;number/=10){
                reqemsayi++;
            }
            System.out.println("bu ədəd " + reqemsayi + " rəqəmlidir.");

        } else {
            System.out.println("daxil etdiyiniz ədəd mənfi ədəddir");
        }


    }
}
