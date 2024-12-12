package human;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Human {
    private String name;
    private LocalDate brithDay;
    private int age;

    public Human(String name, LocalDate brithDay, int age) {
        this.name = name;
        this.brithDay = brithDay;
        this.age = age;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBrithDay() {
        return brithDay;
    }

    public void setBrithDay(LocalDate brithDay) {
        this.brithDay = brithDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFormatter(){
        return brithDay.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy"));
    }
    public void displayInfo(){
        System.out.println(" adi: " + name + " dogum tarixi: " + getFormatter() + " yasi: " + age);
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", brithDay=" + getFormatter() +
                ", age=" + age +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(brithDay, human.brithDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brithDay, age);
    }
}
