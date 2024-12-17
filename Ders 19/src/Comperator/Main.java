package Comperator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        var anm1 = new Animal("Monkey",200);
        var anm2 = new Animal("Dog",100);
        var anm3 = new Animal("Cat",50);
        var animalList = Arrays.asList(anm1,anm2,anm3);
        animalList.sort(new AnimalComparator());
        System.out.println(animalList);
    }
}
