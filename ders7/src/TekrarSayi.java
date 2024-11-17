import java.util.Scanner;

public class TekrarSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<5;i++){
            arr[i] = scanner.nextInt();
        }
        int sayi = scanner.nextInt();
        int tekrar = 0;
        for(int i = 0;i<5;i++){
            if(arr[i]==sayi){
                tekrar++;
            }
        }
        System.out.println(sayi+ " rəqəmindən " + tekrar + " ədəd var.");
    }
}
