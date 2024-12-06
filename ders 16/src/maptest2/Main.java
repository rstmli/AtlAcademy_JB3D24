package maptest2;

public class Main {
    public static void main(String[] args) {
        Students students = new Students();
        Student huseyn = new Student(2,"huseyn");
        Student ilkin = new Student(1,"Ilkin");
        Student emin = new Student(3,"Emin");
        students.addStudent(huseyn);
        students.addStudent(ilkin);
        students.addStudent(emin);
        students.printStudents();
        students.removeStudent(1);
        students.printStudents();

    }
}
