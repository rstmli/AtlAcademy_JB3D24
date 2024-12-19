package GenericTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Generic{
    public static void main(String[] args) {
        List<Double> double2 = Arrays.asList(1.0,2.0,3.4);
        chapet(double2, e -> e > 2.0);
        List<Integer> integer2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        chapet(integer2, e -> e%2==0);
        List<String> string2 = Arrays.asList("Huseyn","Hemid","Nurlu","Nihad","Emin");
        chapet(string2,e -> e.startsWith("N"));

    }


    public static <T> void chapet(List<T> list,Predicate<T> predicate){

        list.stream().filter(predicate).forEach(System.out::println);
    }

}
