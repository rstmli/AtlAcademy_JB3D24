package Studentregistration;
import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private LocalDate birthDay;

    public Student(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }
    public int getAge(){
        LocalDate currentTime = LocalDate.now();
        Period period = Period.between(birthDay, currentTime);
        return period.getYears();
    }

    @Override
    public String toString() {
        return "name " + name + " " + birthDay + " yasi: " + getAge();
    }
}