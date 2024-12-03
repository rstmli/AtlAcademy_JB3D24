package largestandsmallestelement;

import java.util.Arrays;

public class ArraysLargesAndSmalles {
    public static void main(String[] args) {
        int[] array = {50,30,70,20,10};
        int a = Arrays.stream(array).max().getAsInt();
        System.out.println(a);
        int b = Arrays.stream(array).min().getAsInt();
        System.out.println(b);
    }

}
