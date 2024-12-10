package travelApp;

public class CruiseTrip extends Tour{
    private boolean isRelax = true;
    public CruiseTrip(int tourId, String tourName, TourPackage tourPackage) {
        super(tourId, tourName, tourPackage);
    }

    @Override
    public void displayInfo() {
        System.out.println("tur id'si: " + getTourId() + " tur adi: " + getTourName() + " sakitdir: " + (isRelax ? " he" : " yox"));


    }

}
