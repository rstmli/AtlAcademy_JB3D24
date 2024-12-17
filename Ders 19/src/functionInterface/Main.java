package functionInterface;

import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
    // FunctionInterface
//        Calculator calc = (a, b) -> a+b;
//        System.out.println(calc.operation(10,20));


        // custom Consumer
//        CustomConsumer consum = (a) -> System.out.println(a);
//        consum.testEtcagir("salamlar");

        // Consumer -
//        Consumer<String> str = (name) -> System.out.println(name);
//        str.accept("Hello");


        // Custom Predicate
//        CustomPredicate p = (a) -> a<0 ;
//        System.out.println(p.test(-100));

        // Predicate
//        Predicate<Integer> p = (a) -> a>0;
//        System.out.println(p.test(10));



        // Custom Function---
//        Function<String,Integer> f = (t) ->{
//            int l = t.length();
//            if(l<3||l>10){
//                return 404;
//            }
//            return 200;
//
//        };
//        System.out.println(f.apply("JavaCodingLanguage"));

        // Custom
//        Function<String,Integer> f2 = (a) -> {
//            int l = a.length();
//            if(l < 3 || l > 10){
//                return 404;
//            }
//            return 200;
//        };
//        System.out.println(f2.apply("huseyn"));


        // Custom BiFunction
//        CustomBiFunction<Integer,Integer,Boolean> b = (a,c) -> a*c>0;
//        System.out.println(b.apply(5,4));

        // BiFunction-
//        BiFunction<Integer,Integer,Boolean> b2 = (a,b) -> a*b==10;
//        System.out.println(b2.apply(5,2));








        // Supplier
//        Supplier<Integer> s = () -> new Random().nextInt(100);
//            int random = s.get();
//        System.out.println(random);


        // Custom Supplier
        SupplierInterface<Integer> s2 = () -> new Random().nextInt(100);
        int random = s2.getgetir();
        System.out.println(random);












    }


}
