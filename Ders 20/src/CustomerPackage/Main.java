package CustomerPackage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var musteri1 = new Employee("Huseyn",300.0);
        var musteri2 = new Employee("Nihad",500.0);
        var musteri3 = new Employee("Nurlu",550.0);
        var mylist = Arrays.asList(musteri1,musteri2,musteri3);


       var xx = mylist.stream()
                .filter(x -> x.getDebt() > 350)
               .peek(x -> {
                   x.setDebt(x.getDebt()*1.5);
               })
                .toList();
        System.out.println(xx);


    }

}
