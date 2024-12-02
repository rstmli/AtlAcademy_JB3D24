package Studentregistration;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Huseyn",LocalDate.of(2009,12,24));
        Student student2 = new Student("Ilkin",LocalDate.of(2007,12,24));
        Student student3 = new Student("Emin",LocalDate.of(2004,12,24));
        Student[] students = {student1,student2,student3};
        Student[] cloneStudents = students.clone();
        System.out.println("Clone edilmiş array:");
        for(Student student : cloneStudents){
            System.out.println(student);

        }
//        Student[] copiedStudents = new Student[students.length];
        Student[] copiedStudents = Arrays.copyOf(students, students.length);
        for (int i = 0; i < students.length; i++) {
            copiedStudents[i] = students[i];
        }
        System.out.println("Manual copy edilmiş array:");
        for (Student student : copiedStudents) {
            System.out.println(student);
        }
        System.out.println("Yasi 18 den kicik olan telebeler");
        for (Student student : students) {
            if (student.getAge() < 18) {
                System.out.println("Ad: " + student.getName() + " Yasi: " + student.getAge() + " dogum tarixi: " + student.getBirthDate());
            }
        }
    }
}

