package elementinthearray;

import java.util.Arrays;

public class ElementInTheArray {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6};
        int number = 14;
        boolean contains = containsNumber(arrays, number);
        if(contains){
            System.out.println("arrayin icinde " + number + " var");
        }
        else{
            System.out.println("arrayin icinde " + number + " yoxdu.");
        }
    }

    private static boolean containsNumber(int[] array, int number) {
        return Arrays.stream(array).anyMatch(x -> x == number);
    }
}
