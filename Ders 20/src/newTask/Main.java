package newTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> liststr = Arrays.asList("Huseyn", "Emin", "Ilkin", "Nihad");

        List<List<String>> splittedList = liststr.stream()
                .map(e -> Arrays.asList(e.split("")))
                .toList();

        System.out.println(splittedList);

        liststr.stream().map(e -> e.split(""))
                .toList();








    }
}
