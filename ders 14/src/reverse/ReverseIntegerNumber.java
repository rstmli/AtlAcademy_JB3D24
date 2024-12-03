package reverse;

import java.util.Arrays;

public class ReverseIntegerNumber {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 4, 70};

        int[] reversedArr = new int[arr.length];
        Arrays.setAll(reversedArr, i -> arr[arr.length - 1 - i]);
        for(int num : reversedArr){
            System.out.println(num);
        }
    }
}
