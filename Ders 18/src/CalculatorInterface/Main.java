package CalculatorInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
//        CalculatorInterface sum = (a) -> System.out.println(1 + 2);
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.forEach((e) -> System.out.println(e));
        Consumer<String> sss = System.out::println; {
        } ;
        sss.accept("Salam");
        // consumer - Predicate - BiFunction , arasindaki ferqler
    }
}
