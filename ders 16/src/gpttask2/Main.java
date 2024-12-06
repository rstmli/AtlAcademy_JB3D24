package gpttask2;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Students huseyn = new Students("huseyn Rustemli",20,"200");
        school.addStudents(huseyn);
        school.listStudents();
    }
}
