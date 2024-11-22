import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ilk array uzunlugu: ");
        int firstLen = scanner.nextInt();
        int[] firstArr = new int[firstLen];
        for(int i = 0; i < firstLen; i++) {
            firstArr[i] = scanner.nextInt();
        }
        System.out.print("Ikinci array uzunlugu: ");
        int secondLen = scanner.nextInt();
        int[] secondArr = new int[secondLen];
        if(secondLen > firstLen) {
            for(int i = 0; i < firstLen; i++) {
                secondArr[i] = firstArr[i];
            }
            for(int i = firstLen; i < secondLen; i++) {
                secondArr[i] = scanner.nextInt();
            }
        }
        else {
            for(int i = 0; i < secondLen; i++) {
                secondArr[i] = firstArr[i];
            }
        }
        for(int i = 0; i < secondLen; i++) {
            System.out.print(secondArr[i] + " ");
        }

    }
}