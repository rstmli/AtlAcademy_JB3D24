public class Teacher extends Academy {
    private int teacherId;
    private String subject;

    Student student = new Student();


    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getSubject() {
        return subject;
    }

    public Teacher(String academyName, String address, int teacherId, String subject ){
        super(academyName,address);
        this.teacherId = teacherId;
        this.subject = subject;

    }
    public Teacher(){

    }

    public void teach(){
        System.out.println("Teacher id: " + teacherId + " subject: " + subject);
    }






}
