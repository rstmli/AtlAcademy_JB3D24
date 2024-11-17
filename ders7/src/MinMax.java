import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
        int i = 0;
        int boyukeded = number[0];
        int kicikeded = Integer.MAX_VALUE;
        for(i = 0;i<5;i++){
            number[i] = scanner.nextInt();
        }
        for(i = 0;i<5;i++){
            if(boyukeded<number[i]){
                boyukeded = number[i];
            }
            if(kicikeded>=number[i]){
                kicikeded = number[i];
            }
        }
        System.out.println("ən kiçik ədəd: " + kicikeded);
        System.out.println("ən böyük ədəd: " + boyukeded);

        }


    }
