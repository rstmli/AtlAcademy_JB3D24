package ClassTaskInterface;

public class ElectricCar implements Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Electrikli masin ise dusur");
    }

    @Override
    public void stopEngine() {
        System.out.println("Electrikli masin sonudurulur");

    }

    @Override
    public String getFuelType() {
        return "Electric";
    }
}
