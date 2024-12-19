package StreamLinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StreamLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>(Arrays.asList(2,3,4,5,1,16,11,12));
        myLinkedList.stream()
                .filter(e -> e%2==0)
                .map(e -> e*2)
                .filter(e -> e> 20)
                .sorted()
                .forEach(System.out::println);
    }
}
