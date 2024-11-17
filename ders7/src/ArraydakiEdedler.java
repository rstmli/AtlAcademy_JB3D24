import java.util.Scanner;

public class ArraydakiEdedler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int i = 0;
        int tut = arr[0];
        System.out.println("↓ 5 ədəd daxil edin ↓");

        for(i = 0; i<5; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Arrayın elementleri: ");

        for(i = 0;i<5;i++){
            tut++;
            System.out.print(arr[i]);
            if(tut<5){
                System.out.print(", ");
            }
        }
    }
}
