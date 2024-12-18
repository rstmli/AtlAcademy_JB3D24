package Employee;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var musteri1 = new Customer("Huseyn",300.0);
        var musteri2 = new Customer("Nihad",500.0);
        var musteri3 = new Customer("Nurlu",550.0);
        var mylist = Arrays.asList(musteri1,musteri2,musteri3);


       var xx = mylist.stream()
                .filter(x -> x.getDebt() > 350)
               .map(x -> {
                   x.setDebt(x.getDebt()*1.5);
                   return x;
               })
                .toList();
        System.out.println(xx);


    }

}
