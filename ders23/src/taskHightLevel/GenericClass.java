package taskHightLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GenericClass<T> {
    private T name;
    private T surname;
    private LocalDate birthday;
    private List<T> myList = new ArrayList<>();
    private AdiClass adiClass;

    public List<T> getMyList() {
        return myList;
    }

    public void setMyList(List<T> myList) {
        this.myList = myList;
    }

    public GenericClass(T name, T surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public T getName() {
        return name;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "name=" + name +
                ", surname=" + surname +
                ", birthday=" + birthday +
                ", myList=" + myList +
                ", adiClass=" + adiClass +
                '}';
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getSurname() {
        return surname;
    }

    public void setSurname(T surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getFormattedBirthday(){
        return birthday.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy"));
    }

    public void addStudentToCourse(AdiClass course) {
        myList.add((T) course);
    }

    public void removeStudentFromCourse(AdiClass course) {
        if (myList.contains(course)) {
            myList.remove(course);
            System.out.println(course.getCourseName() + " kursundan " + name + " " + surname + " silindi.");
        } else {
            System.out.println("Bu kursda telebe yoxdur: " + course.getCourseName());
        }
    }

    public void displayInfo() {
        System.out.println("Istifadecinin adi: " + name);
        System.out.println("Istifadecinin soyadi: " + surname);
        System.out.println("Dogum tarixi: " + getFormattedBirthday());
    }
}
