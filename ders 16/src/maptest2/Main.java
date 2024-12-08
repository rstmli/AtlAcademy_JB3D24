package maptest2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Students students = new Students();
        Student st1 = new Student(31,"Elnur");
        Student st2 = new Student(32,"Huseyn");
        students.add(st1);
        students.remove(31);
        students.add(st2);
        students.printInfo();

    }
}
