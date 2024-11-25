package ClassTaskInterface;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new CarVehicle();
        Vehicle bike = new BikeVehicle();
        car.startEngine();
        car.stopEngine();
        bike.startEngine();
        bike.stopEngine();
    }
}
