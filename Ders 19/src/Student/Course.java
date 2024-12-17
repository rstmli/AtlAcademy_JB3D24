package Student;

import Student.Exception.IsExistException;
import Student.Exception.IsNotExistException;

import java.util.ArrayList;
import java.util.List;

public class Course <T>{
    private String coursName;
    private Subject subject;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName,Subject subject) {
        this.coursName = courseName;
        this.subject = subject;
    }

    public String getCoursName() {
        return coursName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        isExit(student);
        students.add(student);
        System.out.println(coursName + " kursuna " + student.getName() +" telebe elave olundu.");
    }
    public void removeStudent(Student student){
        isNotExist(student);
        students.remove(student);
        System.out.println(coursName + " kursundan " + student.getName() +" telebe silindi.");
    }


    private void isExit(Student student){
        if(students.contains(student)){
            throw new IsExistException("Is exist");
        }
    }


    private void isNotExist(Student student) {
        if(!this.students.contains(student)) {
            throw new IsNotExistException("Is not exist");
        }
    }





    public void displayInfo(){
        System.out.println("\nTelebeler");
        for(Student student:students){
            System.out.println(student);
        }
    }
}
