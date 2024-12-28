package taskHightLevel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdiClass {
    private String courseName;
    private String id;
    private Map<Integer, String> myMap = new HashMap<>();
    private List<GenericClass> students = new ArrayList<>();

    public AdiClass(String courseName, String id) {
        System.out.println(courseName + " adli kurs yaradildi, kursun id-si: " + id);
        this.courseName = courseName;
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AdiClass{" +
                "courseName='" + courseName + '\'' +
                ", id='" + id + '\'' +
                ", myMap=" + myMap +
                ", students=" + students +
                '}';
    }

    public void addStudent(GenericClass student) {
        students.add(student);
        System.out.println(student.getName() + " " + student.getSurname() + " " + courseName + " kursuna elave olundu.");
    }

    public void removeStudent(GenericClass student) {
        if (students.contains(student)) {
            students.remove(student);
            System.out.println(student.getName() + " " + student.getSurname() + " " + courseName + " kursundan silindi.");
        } else {
            System.out.println("Bu telebe kursda qeydiyyatdan kecmemisdir.");
        }
    }

}
