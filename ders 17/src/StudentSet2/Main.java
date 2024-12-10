package StudentSet2;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        Student huseyn = new Student("Huseyn",1);
        Student ilkin = new Student("Ilkin",2);
        Student emin = new Student("Emin",3);
        register.addStudent(huseyn);
        register.addStudent(ilkin);
        register.addStudent(emin);
        register.removeStudent(huseyn);
        register.searchStudent("Huseyn");
    }
}
