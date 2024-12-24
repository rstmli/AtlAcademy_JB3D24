package newTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> liststr = Arrays.asList("Huseyn","Rustemli","Zaur"); // List yaradiriq
        List<String> flatmap = liststr.stream().flatMap(e -> Arrays.stream(e.split(""))).toList();
        System.out.println(flatmap);
        System.out.println(Stream.empty().toList());








    }
}
