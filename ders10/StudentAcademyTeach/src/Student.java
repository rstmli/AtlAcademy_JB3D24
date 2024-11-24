import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Student extends Academy{

    private String  id;
    private String course;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String  getId(){
        return this.id;
    }
    public String getCourse(){
    return this.course;
    }

    public Student(){

    }

    public Student(String academyName ,String name, String address, String id, String course ){
        super(academyName,address);
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public Student(String id, String name){

    }

    public void study(){
        System.out.println("id: " + id + " kurs: " + course);
    }

}
