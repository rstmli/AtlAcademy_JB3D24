package ClassTaskInterface;

import BankJob.BankAccount;

public class CarVehicle implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Maşının mühərriki işə düşdü.");
    }
    @Override
    public void stopEngine() {
        System.out.println("Maşının mühərriki söndürüldü.");
    }

    @Override
    public String getFuelType() {
        return "Benzin";
    }
    boolean hasFuel = false;

    public boolean checkFuel() {
        return hasFuel;
    }


    public void startCar(){
        if (checkFuel()) {
            System.out.println("masin ise dusmeye baslayir...");
            startEngine();
        } else {
            System.out.println("benzin yoxdur.");}
    }
}
