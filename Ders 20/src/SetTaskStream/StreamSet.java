package SetTaskStream;

import java.util.Arrays;
import java.util.Set;

public class StreamSet {
    public static void main(String[] args) {
        Set<String> mylist = Set.of("Nihad","Nurlu","ALi","Musa","Muhammed");
        mylist.stream()
                .filter(e -> e.length() >= 5)
                .sorted()
                .forEach(System.out::println);
    }
}
