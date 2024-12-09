package StudentSet;

import java.util.HashSet;
import java.util.Set;
import java.util.SimpleTimeZone;

public class Register {
    private Set<Student> students;

    public Register() {
        this.students = new HashSet<>();
    }
    public void add(Student student) {
        this.students.add(student);
        System.out.println(student.getName() + " adli telebenin qeydiyyati ugurla tamamlandi.");
    }
    public void showStudent(){
        for(Student student : students){
            System.out.println(student);
        }

    }

    public void searchStudent(Student student){
        if(students.contains(student)){
            System.out.println("Found student: " + student);
        }else{
            System.out.println("Not found student: " + student);
        }
    }
}
