package StreamLinkedList;

import java.util.Arrays;
import java.util.List;

public class StreamLinkedList {
    public static void main(String[] args) {
        List<Integer> myLinkedList = List.of(2,3,4,5,1,16,11,12);
        myLinkedList.stream()
                .filter(e -> e%2==0)
                .map(e -> e*2)
                .sorted()
                .filter(e -> e> 20)
                .forEach(System.out::println);
    }
}
