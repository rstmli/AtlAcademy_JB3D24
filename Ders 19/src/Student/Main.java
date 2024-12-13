package Student;

import Student.Exception.IsExistException;
import Student.Exception.IsNotExistException;

public class Main {
    public static void main(String[] args) {

        Operation operation = new Operation();
        try {
            Student huseyn = new Student(1, "Huseyn");
            Student ilkin = new Student(2, "Ilkin");
            Student emin = new Student(3, "Emin");
            Course front = new Course<Student>("Java", Subject.FRONT);
            Course backend = new Course<Student>("Java", Subject.BACKEND);
            Course fullStack = new Course<Student>("Java", Subject.BACKEND);
            operation.registerStudent(huseyn, front);
            operation.registerStudent(ilkin, backend);
            operation.registerStudent(emin, fullStack);

        }catch(IsExistException | IsNotExistException e) {
            System.out.println(e.getMessage());
        } finally {
            operation.displayInfo();
        }

    }

}
