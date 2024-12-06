package maptaskExcepiton;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try{
            Map<String,Integer> map = new HashMap<>();
            map.put("Huseyn",20);
            map.put("Esref",21);
            map.put("Nihad",19);
            map.put("Nurlu",22);
            for(Map.Entry<String,Integer> entry :map.entrySet()){
                System.out.println("adi: " + entry.getKey() + " yas: " + entry.getValue());
            }
            String name = "Nurlu";
            Integer age = map.get(name);
            if(age != null){
                System.out.println(name + " yasi: " + age);
            }else{
                throw new NotFoundUserException("Istifadeci tapilmadi.");
            }

        }catch (NotFoundUserException e){
            System.out.println(e.getMessage());
        }
    }
}
