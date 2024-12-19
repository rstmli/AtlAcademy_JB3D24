package GenericTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Generic{
    public static void main(String[] args) {
        List<Double> double2 = Arrays.asList(1.0,2.0,3.4);
        List<Integer> integer2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<String> string2 = Arrays.asList("Huseyn","Hemid","Nurlu","Nihad","Emin");
        Predicate<Double> doublePiredicate = e -> e>2.0;
        Predicate<Integer> intPiredicate = e -> e%2==0;
        Predicate<String> strPiredicate = e -> e.startsWith("N");
        System.out.println("2.0 dan boyuk elementler");
        chapet(double2,doublePiredicate);
        System.out.println("Cut elementler");
        chapet(integer2,intPiredicate);
        System.out.println("adi N ile bashlayan Istifadəçilər");
        chapet(string2,strPiredicate);

    }


    public static <T> void chapet(List<T> list,Predicate<T> predicate){

        list.stream().filter(predicate).forEach(System.out::println);
    }

}
