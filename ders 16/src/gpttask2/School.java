package gpttask2;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
private ArrayList<Students> students;

    public School() {
        this.students = new ArrayList<>();
    }
    public void listStudents(){
        if(students.isEmpty()){
            System.out.println("hec bir telebe yoxdur");
        }{
            for(var student : students){
                System.out.println(student);

            }
        }
    }

    public void addStudents(Students student){
        students.add(student);
        System.out.println(student + " elave olundu");
    }
    public void grade(Students grade){
        for(Students student: students){
            student.calculateAverage(200);
        }
    }
}
