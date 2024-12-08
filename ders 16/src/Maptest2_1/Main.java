package Maptest2_1;

public class Main {
    public static void main(String[] args) {
        Studentregistry studentregistry = new Studentregistry();
        Student st1 = new Student(31,"Huseyn");
        Student st2 = new Student(32,"Xanim");
        Student st3 = new Student(33,"Elnur");
        studentregistry.addStudent(st1);
        studentregistry.addStudent(st2);
        studentregistry.addStudent(st3);
        studentregistry.removeStudent(31);
        studentregistry.printInfo();
    }
}
