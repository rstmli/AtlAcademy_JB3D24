package SetTaskStream;

import java.util.Arrays;

public class IntegerTask2 {
    public static void main(String[] args) {
        var a = Arrays.asList(1,2,3,4,5,6,78,9,9,45,34,534,534,534,5346,43,6);
        var b = a.stream().map(e -> Arrays.asList(e)).toList();
        System.out.println(b);
    }
}
