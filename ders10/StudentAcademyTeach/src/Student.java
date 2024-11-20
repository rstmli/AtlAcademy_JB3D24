import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Student extends Academy{

    private int id;
    private String course;

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

    public Student(String name, String surname, String address, int id, String course ){
        super(name,surname,address);
        this.id = id;
        this.course = course;
    }
    public void study(){
        super.displayInfo();
        System.out.println("id: " + id + " kurs: " + course);
    }

}
