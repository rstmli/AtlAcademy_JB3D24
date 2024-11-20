public class Teacher extends Academy {
    private int teacherId;
    private String subject;

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

    public Teacher(String name,String surname, String address, int teacherId, String subject ){
        super(name,surname,address);
        this.teacherId = teacherId;
        this.subject = subject;

    }
    public Teacher(){

    }

    public void teach(){
        super.displayInfo();
        System.out.println("Teacher id: " + teacherId + " subject: " + subject);
    }






}
