package maptask2_3;

import java.util.HashMap;
import java.util.Map;

public class RegistredStudents {
    private Map<Integer, Student> register;

    public RegistredStudents() {
        this.register = new HashMap<>();

    }
    public void addStudent(Student student){
        if(student.getAge() < 18){
            System.out.println(student.getName() + " adli telebenin yasi " + student.getAge() + " oldugu ucun qeydiyyat ugurlu olmadi.");
        }else{
            register.put(student.getId(),student);
            System.out.println(student.getName() + " adli telebenin qeydiyyati ugurla tamamlandi.");
        }

    }

    public void removeStudent(Integer id){
        for(Student student : register.values()){
            if(register.containsKey(id)){
                register.remove(id);
                System.out.println(student.getId() + " id li telebenin qeydiyyati silindi");
                return;
            }
        }
    }

//    public void pointRemove(Integer point) {
//        for(Student student : register.values()){
//            if(register.containsKey(point)){
//                register.remove(point);
//                System.out.println(student.getName() + " adli Tələbənin balı " + student.getPoint() + " olduğu üçün tələbə kəsildi.");
//                return;
//            }
//        }
//    }

    public void printInfo(){
        System.out.println("Telebelerin siyahisi");
        for(Student a : register.values()){
            System.out.println(a);
        }
    }
}
