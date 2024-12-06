package gpttask2;

import java.util.ArrayList;

public class Students {
    private String name;
    private int age;
    private String grade;
    private ArrayList<Integer> grades;

    public Students(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double calculateAverage(int grade){
        if(grades.isEmpty()) return 0;
        int total = 0;
        for(int grades : grades){
            total+=grades;
        }
        return total / grades.size();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
