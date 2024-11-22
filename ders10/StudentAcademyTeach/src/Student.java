import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Student extends Academy{

    private int id;
    private String name;
    private String surname;
    private String course;


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

    public void setId(int id){
        this.id = id;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getId(){
        return this.id;
    }
    public String getCourse(){
    return this.course;
    }

    public Student(){

    }

    public Student(String academyName ,String name, String surname, String address, int id, String course ){
        super(academyName,address);
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
    public void study(){
        super.displayInfo();
        System.out.println("id: " + id + " kurs: " + course);
    }

}
