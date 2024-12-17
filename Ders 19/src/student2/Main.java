package student2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        var a = new Student("Nurlu",12);
        var b = new Student("Huseyn",11);
        var c = new Student("Nihad",10);
        var x = Arrays.asList(a,b,c);
        // arrayin ilkin hali
        System.out.println(x);
        // ada gore siralama Comparaible dan istifade edilib
        Collections.sort(x);
        System.out.println(x);
        // id-e gore siralama Comporator dan istifade edilib;
        Collections.sort(x, new StudentComporator());
        System.out.println(x);




    }
}
