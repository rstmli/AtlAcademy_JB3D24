public class Chicken extends Bird {
    private String notFly;

    public void setNotFly(String notFly) {
        this.notFly = notFly;
    }

    public String getNotFly() {
        return notFly;
    }
    public Chicken(String name, int age, String wing,String eat, String notFly){
        super(name,age,wing,eat);
        this.notFly = notFly;
    }

    public void chickenInfo(){
        super.displayInfo();
        System.out.println(notFly);
    }

}
