package test1;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private LocalDate birthday;

    public Employee(String name, String surname, int age, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public String getFormatterDate(){
        return birthday.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public void displayinfo(){
        System.out.println("kullanicinin adi: " + name);
        System.out.println("kullanicinin soyadi: " + surname);
        System.out.println("kullanicinin yasi: " + age);
        System.out.println("kullanicinin dogum tarihi: " + getFormatterDate());
    }

    public static void main(String[] args) {
        var obj = new Employee("Metin","Cetin",18,LocalDate.of(2006,6,12));
        obj.displayinfo();
    }

}
