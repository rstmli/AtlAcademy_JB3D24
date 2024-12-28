package taskHightLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AdiClass javaCourse = new AdiClass("Java Programming", "CS101");

        GenericClass<String> student1 = new GenericClass<>("Ali", "Aliyev", LocalDate.of(2000, 5, 15));
        GenericClass<String> student2 = new GenericClass<>("Veli", "Veliev", LocalDate.of(1999, 3, 10));
        List<GenericClass> mylist = new ArrayList<>();
        mylist.add(student1);
        mylist.add(student2);
        mylist.stream().filter(e -> e.getName().equals("Ali")).forEach(System.out::println);
        for (GenericClass genericClass : mylist) {
         genericClass.displayInfo();
        }

        javaCourse.addStudent(student1);
        javaCourse.addStudent(student2);
        
        javaCourse.removeStudent(student1);
    }
}
