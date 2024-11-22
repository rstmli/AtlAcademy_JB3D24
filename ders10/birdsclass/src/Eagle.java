public class Eagle extends Bird{
    private String predator;

    public void setPredator(String predator) {
        this.predator = predator;
    }

    public String getPredator() {
        return predator;
    }
    public Eagle(String name, int age, String wing, String eat, String predator){
        super(name, age, wing, eat);
        this.predator = predator;

    }



    public void eagleInfo(){
        super.displayInfo();
        System.out.println(predator);
    }




}
