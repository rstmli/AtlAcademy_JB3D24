package sumarrays;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {23,24,12,13};
        int sum = Arrays.stream(arr).sum();
        int average = sum / arr.length;
        System.out.println("ededlerin cemi: " + sum + " ededi ortasi: " + average);
    }
}
