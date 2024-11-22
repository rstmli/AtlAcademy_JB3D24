public class Bird {
    private String name;
    private int age;
    private String wing;
    private String eat;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWing() {
        return wing;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getEat() {
        return eat;
    }

    public Bird(String name, int age, String wing, String eat){
        this.name = name;
        this.age = age;
        this.wing = wing;
        this.eat = eat;
    }

    public Bird() {
    }

    public void displayInfo(){
        System.out.print("novu: " + name + ", yası: " + age + ", " + wing+ ", " + eat + ", ");
    }

}
