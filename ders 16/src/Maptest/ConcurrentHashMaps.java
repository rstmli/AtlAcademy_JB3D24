package Maptest;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMaps {
    public static void main(String[] args) {
        HashSet<String> map = new HashSet<>();
        map.add("1");
        map.add("3");
        map.add("2");
        map.add("4");
        map.add("50");
        map.add("120");
        map.add("120");
        map.add("300");
        for(String a: map){
            System.out.println(a);
        }
//        Iterator<String> hs = map.iterator();
//        while (hs.hasNext()){
//            System.out.println(hs.next());
//        }

//        map.put("Apple", 1);
//        map.put("Banana", 2);
//        map.put("Orange", 3);
//
//        System.out.println(map);
//        List<Integer> myArrayList = new ArrayList<>();
//        myArrayList.add(1);
//        myArrayList.add(2);
//        myArrayList.add(3);
//        myArrayList.add(4);
//        myArrayList.add(5);
//        myArrayList.add(6);
//        Collections.shuffle(myArrayList);
//        System.out.println(myArrayList);


    }
}
