//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Student student = new Student(123,"AtlAcademy","Baku",);
//        student.study();
//        student.study();
        Student studentadd = new Student("S1234","Huseyn");
        studentadd.study();
        Academy studentad = new Academy();
        studentad.addStudent(studentadd);

    }
}
