package Maptest2_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Studentregistry {
    private Map<Integer,Student> students;

    public Studentregistry() {
        this.students = new HashMap();
    }
    public void addStudent(Student student){
        students.put(student.getId(),student);
        System.out.println(student.getName() + " adli telebe elave olundu");
    }

    public void removeStudent(Integer id){
        if(students.containsKey(id)){
            Student student = students.get(id);
            students.remove(id);
            System.out.println("id-si: " + id + " olan " + student.getName() + " silindi");
        }
    }

    public void printInfo(){
        for(Student a : students.values()){
            System.out.println(a);
        }
    }
}
