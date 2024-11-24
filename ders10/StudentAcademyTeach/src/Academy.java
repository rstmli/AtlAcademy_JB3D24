public class Academy {


    private String academyName;
    private String address;
    private Student[] students;
    private int studentCount;



    public void setName(String name) {
        this.academyName = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  String getName(){
        return academyName;
    }
    public String getAddress(){
        return address;
    }

    public Academy(String academyName, String address){
        this.academyName = academyName;
        this.address = address;
        this.students = new Student[10];
        this.studentCount = 0;

    }

    public Academy(){

    }

    public void addStudent(Student student) {
        if (studentCount == students.length) {
            Student[] newStudents = new Student[students.length + 5];
            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }
            students = newStudents;
        }

        students[studentCount] = student;
        studentCount++;
        System.out.println(getName() + " Telebe elave olundu.");
    }

    public void displayInfo(){
        System.out.print("adi: " + academyName );
        System.out.println("Unvan: "+address);

    }



}
