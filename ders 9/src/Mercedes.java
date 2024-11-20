public class Mercedes extends Car{
    private String comfortable;

    public void setComfortable(String comfortable) {
        this.comfortable = comfortable;
    }
    public String getComfortable(){
        return comfortable;
    }
    public Mercedes (String name, int speed, double motor, String fuel,String comfortable) {
        super(name,speed,motor,fuel);
        this.comfortable = comfortable;

    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println(" ");
    }


}
