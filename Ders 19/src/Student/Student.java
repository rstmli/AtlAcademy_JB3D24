package Student;

import Student.Exception.IsExistException;
import Student.Exception.IsNotExistException;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private List<Course> courses = new ArrayList<>();



    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void removeCourse(Course<Student> course) {
        this.isNotExist(course);
        courses.remove(course);
    }
    public void addCourse(Course<Student> course) {
        this.isExist(course);
        courses.add(course);
    }

    private void isExist(Course<Student> course) {
        if(this.courses.contains(course)) {
            throw new IsExistException("Is exist");
        }
    }

    private void isNotExist(Course<Student> course) {
        if(!this.courses.contains(course)) {
            throw new IsNotExistException("Is not exist");
        }
    }
}
