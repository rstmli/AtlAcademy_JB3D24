package maptask2_3;

public class Main {
    public static void main(String[] args) {
        RegistredStudents students = new RegistredStudents();
        Student huseyn = new Student(1,"Huseyn","Rustemli",20,90);
        Student kenan = new Student(2,"Kenan","Musayev",19,50);
        Student mushfig = new Student(3,"Musfiq","Manafli",28,100);
        students.addStudent(huseyn);
        students.addStudent(kenan);
        students.addStudent(mushfig);
        students.removeStudent(1);
        students.printInfo();
    }

}
