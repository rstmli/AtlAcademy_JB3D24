package maptest2;

import javax.naming.ldap.SortResponseControl;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Students{

    private Map<Integer,Student> students;

    public Students() {
        this.students = new HashMap<>();
    }
    public void add(Student student) {
        this.students.put(student.getId(), student);
        System.out.println(student.getName() + " adli telebenin qeydiyyati ugurla basa catdi");
    }
    public void remove(Integer id){
        Student student = this.students.get(id);
        this.students.remove(id);
        System.out.println(id+"-idli " + student.getName() + " qeydiyyati ugurla silindi.");
    }
    public void printInfo(){
        for(Student student : students.values()){
            System.out.println(student);
        }
    }

}
