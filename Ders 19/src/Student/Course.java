package Student;

import java.util.ArrayList;
import java.util.List;

public class Course <T>{
    private T coursName;
    private List<Student> students;

    public Course(T courseName) {
        this.coursName = courseName;
        this.students = new ArrayList<>();
    }

    public T getCoursName() {
        return coursName;
    }

    public List<Student> getStudents() {
        return students;
    }


    public void addStudent(Student student){
        students.add(student);
        System.out.println(student.getName() +" telebe elave olundu.");
    }
    public void displayInfo(){
        System.out.println("\nTelebeler");
        for(Student student:students){
            System.out.println(student.getName());
        }
    }
}
