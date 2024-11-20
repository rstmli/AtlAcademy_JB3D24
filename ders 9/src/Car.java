public class Car {
    String model;
    int speed;
    double motor;
    String fuel;

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public double getMotor() {
        return motor;
    }

    public Car(){

    }
    public Car(String name,int speed,double motor, String fuel){
        this.model =  name;
        this.speed = speed;
        this.motor = motor;
        this.fuel = fuel;


    }


    public void displayInfo(){
        System.out.print("model " + model + " sureti " + speed + " motor hecmi" + motor + "yanacaq novu " + fuel);
    }
}
