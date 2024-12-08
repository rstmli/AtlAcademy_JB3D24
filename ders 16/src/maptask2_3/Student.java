package maptask2_3;

public class Student {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private Integer point;

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Student(Integer id, String name, String surname, Integer age,Integer point) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", point=" + point +
                '}';
    }
}
