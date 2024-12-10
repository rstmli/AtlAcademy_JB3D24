package StudentSet2;

import java.util.HashSet;
import java.util.Set;

public class Register {
    private Set<Student> students;

    public Register() {
        this.students = new HashSet<>();
    }
    public void addStudent(Student student){
    students.add(student);
        System.out.println(student.getName() + " adli telebenin qeydiyyati ugurla tamamladi.");
    }
    public void removeStudent(Student student){
        this.students.remove(student);
        System.out.println(student.getName() + " adli telebenin qeydiyyati ugurla silindi");
    }
    public void searchStudent(String student){
        for(Student stud : students){
            if(stud.getName().equals(student)){
                System.out.println("Found Student: " + stud);
                return;
            }
        }
        System.out.println(student + " not found");
    }

}
