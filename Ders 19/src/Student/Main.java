package Student;

public class Main {
    public static void main(String[] args) {
        Course<String> course = new Course<String>("java");
        Student huseyn = new Student(15,"Huseyn");
        Student ilkin = new Student(30,"Ilkin");
        Student emin = new Student(45,"Emin");
        course.addStudent(huseyn);
        course.addStudent(ilkin);
        course.addStudent(emin);
        course.displayInfo();
    }

}
