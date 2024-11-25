package ClassTaskInterface;

public class CarVehicle implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Maşının mühərriki işə düşdü.");
    }
    @Override
    public void stopEngine() {
        System.out.println("Maşının mühərriki söndürüldü.");
    }
}
