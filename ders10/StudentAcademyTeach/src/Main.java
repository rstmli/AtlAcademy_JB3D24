//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("AtlAcademy","Huseyn","Rustemli","goycay",1,"Atl Academy");
        Teacher teacher = new Teacher("AtlAcademy","Manafli","baku",1,"Java");
        student.study();
        teacher.teach();
    }
}
