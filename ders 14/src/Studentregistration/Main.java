package Studentregistration;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Huseyn", LocalDate.of(2004,1,8)),
                new Student("Emin", LocalDate.of(2009,1,8)),
                new Student("Huseyn", LocalDate.of(2004,1,8))
        };

        Student[] clonearrays = students.clone();
        for(Student student : clonearrays){
            System.out.println(student);
        }
        System.out.println("yasi 18 den kicik olan telebeler");
        for(Student student : clonearrays){
            if(student.getAge() < 18){
                System.out.println(student);
            }
        }


    }
}

