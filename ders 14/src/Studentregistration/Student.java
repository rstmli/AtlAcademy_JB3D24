package Studentregistration;
import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private LocalDate birthDate;

    public Student(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        LocalDate currenttime = LocalDate.now();
        Period period = Period.between(birthDate, currenttime);
        return period.getYears();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Ad: " + name + ", Doğum tarixi: " + birthDate;
    }
}