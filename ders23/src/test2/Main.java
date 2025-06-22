package test2;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        var mis1 = new Mission<Integer,String>(1,"Seid seir yazir");
        var mis2 = new Mission<Integer,String>(2,"seid kitab oxu");
        var mis3 = new Mission<Integer,String>(2,"seid kitabi yeyir");

        var myList = new ArrayList<Mission>();
        myList.add(mis1);
        myList.add(mis2);
        myList.add(mis3);

        System.out.println("Gorevler");
        myList.forEach(System.out::println);





    }
}
