import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int i = 0;
        double average = 0.0;
        for(i = 0;i<5;i++){
            arr[i] = scanner.nextInt();
            average = average+arr[i];
        }

        int sum = (int) average;
        System.out.println("ədədlərin cəmi: " + sum + " ədədi ortası: " + sum/5);

    }
}

// serti operatorlar
//muqayise
//arfimetiq
//dovru