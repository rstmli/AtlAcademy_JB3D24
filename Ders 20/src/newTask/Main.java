package newTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> liststr = Arrays.asList("Huseyn","Rustemli","Zaur"); // List yaradiriq
        var splitedList = liststr.stream() // streame ceviririk.
                .map(e -> Arrays.asList(e.split(""))) // map ile donusdurme emeliyyatini yerine yetirip
                                                                 // split methodu ile liststr listimizin icindeki elementleri
                                                                // bir bir parcalayip Arrays.asList methodu ile parcalanan
                                                               // elementleri yeni Listimize elave ediirk.
                .toList();

        System.out.println(splitedList); // Capa veririk








    }
}
