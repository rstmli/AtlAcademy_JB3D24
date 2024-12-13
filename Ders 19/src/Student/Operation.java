package Student;

import java.util.ArrayList;

public class Operation {
    private ArrayList<String> logs = new ArrayList<>();

    public void registerStudent(Student student, Course<Student> course) {
        course.addStudent(student);
        student.addCourse(course);
        this.addLog(student.getName() + " adli telebe " + course.getCoursName() + " kursuna elave edildi");
    }

    public void removeStudent(Student student, Course<Student> course) {
        course.removeStudent(student);
        student.removeCourse(course);
        this.addLog(student.getName() + " adli telebe " + course.getCoursName() + " kursuna silindi");
    }

    public void displayInfo() {
        int i = 0;
        for(String log : this.logs) {
            i++;
            System.out.println(i + ". " + log);
        }
    }

    private void addLog(String message) {
        this.logs.add(message);
    }
}
