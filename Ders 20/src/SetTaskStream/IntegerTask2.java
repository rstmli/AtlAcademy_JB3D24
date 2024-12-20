package SetTaskStream;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerTask2 {
    public static void main(String[] args) {
        var a = Arrays.asList(1,2,3,4,5);
        var b = Arrays.asList(6,7,8,9,10);
        var c = Arrays.asList(11,12,13,14,15);
        var d = Arrays.asList(a,b,c);
        d.stream().map(e -> e).forEach(e -> System.out.println(e));


    }
}
