package travelApp;

public class CityTour extends Tour{

    private boolean car = true;
    public CityTour(int tourId, String tourName, TourPackage tourPackage) {
        super(tourId, tourName, tourPackage);
    }

    public boolean isCar() {
        return car;
    }

    @Override
    public void displayInfo() {
        System.out.println("tur id'si: " + getTourId() + " tur adi: " + getTourName() + " masin: " + (car ? " var" : " yoxdur"));

    }
}
