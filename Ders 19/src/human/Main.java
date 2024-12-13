package human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> arr = new ArrayList<>();
        Human huseyn = new Human("Huseyn", LocalDate.of(2004,1,8));
        Human emin = new Human("Emin", LocalDate.of(2000,12,2));
        Human ulker = new Human("Ulker", LocalDate.of(2000,11,2));
        arr.add(huseyn);
        arr.add(emin);
        arr.add(ulker);
        Map<String,Integer> births = new HashMap<>();
        arr.forEach(e -> {
            e.displayInfo();
            if(e.getAge()>20){
                births.put(e.getName(),e.getAge());
            }
        });
        System.out.println(births);


    }
}
