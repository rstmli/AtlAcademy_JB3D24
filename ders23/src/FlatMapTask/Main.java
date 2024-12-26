package FlatMapTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phon phon = new Phon("+994 55 123 32 23");
        List<Phon> huseynPhones = new ArrayList<>();
        huseynPhones.add(new Phon("+994 55 231 13 32"));
        huseynPhones.add(new Phon("+994 55 500 13 50"));
        List<Phon> ilkinPhones = new ArrayList<>();
        ilkinPhones.add(new Phon("+994 77 231 13 32"));
        ilkinPhones.add(new Phon("+994 51 500 13 50"));
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Huseyn",huseynPhones));
        persons.add(new Person("Ilkin",ilkinPhones));


        List<String> allPhonesNumber = persons.stream()
                .flatMap(person -> person.getPhonList()
                        .stream()).map(Phon::getNumber)
                .toList();

        System.out.println("Bütün telefon nömrələri:");
        allPhonesNumber.forEach(System.out::println);

    }
}
