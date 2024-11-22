import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] firstArray = new int[size];
        for(int i = 0;i<size;i++){
            firstArray[i] = scanner.nextInt();
        }
        int secondSize = scanner.nextInt();
        int[] secondArray = new int[secondSize];
        if(secondSize > size){
            for(int i = 0;i<size;i++){
                secondArray[i] = firstArray[i];
            }
            for(int i = size; i < secondSize;i++){
                secondArray[i] = scanner.nextInt();
            }

        }else{
            for(int i = 0;i<secondSize;i++){
                secondArray[i] = firstArray[i];
            }
        }

        for(int i = 0; i <secondSize;i++){
            System.out.println(secondArray[i] + " ");
        }
    }
}