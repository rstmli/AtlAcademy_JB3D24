public class Bmw extends Car {
    private String sport;

    public void setSport(String electric) {
        this.sport = electric;
    }
    public String getSport() {
        return sport;
    }


    public Bmw() {

    }

    public Bmw(String name, int speed, double motor, String fuel, String sport){
        super(name,speed,motor,fuel);
        this.sport = sport;

    }


    public void displayInfo(){
        super.displayInfo();
        System.out.println(" " + sport);
    }
}
