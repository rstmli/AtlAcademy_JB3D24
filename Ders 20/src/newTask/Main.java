package newTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> liststr = Arrays.asList("Huseyn","Rustemli","Zaur");
        var splitedList = liststr.stream().map(e -> List.of(e.split(""))).toList();
        System.out.println(splitedList);;








    }
}
