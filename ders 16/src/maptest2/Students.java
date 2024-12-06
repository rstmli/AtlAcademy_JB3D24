package maptest2;

import javax.naming.ldap.SortResponseControl;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Students{

    private Map<Integer, Student> studentsMap;

    public Students() {
        this.studentsMap = new HashMap<>();
    }

    public void addStudent(Student student) {
        studentsMap.put(student.getId(), student);
    }
    public void removeStudent(Integer id) {
        if(studentsMap.containsKey(id)){
            studentsMap.remove(id);
            System.out.println("id-si " + id + " olan tələbə silindi.");
        }
    }
    public void printStudents() {
        System.out.println("telebelerin siyahisi");
        for (Map.Entry<Integer, Student> entry : studentsMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue().getName());
        }
    }
}
