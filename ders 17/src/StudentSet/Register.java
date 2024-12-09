package StudentSet;

import java.util.HashSet;
import java.util.Set;

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
        if(!students.isEmpty()){
            for(Student student : students){
                System.out.println(student);
            }
        }
        throw new NoStudentstoshowException("There are no students to display on the list.");


    }

    public void searchStudent(String student){
        for(Student student1 : students){
            if(student1.getName().equals(student)){
                System.out.println( "Found student: " + student1);
                return;
            }
        }
        throw new SearchNotFoundException("not found student: " + student);
    }
}
