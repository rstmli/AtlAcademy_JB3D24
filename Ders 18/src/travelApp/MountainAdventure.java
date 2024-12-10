package travelApp;

public class MountainAdventure extends Tour{
    private boolean campingOvernight;


    public MountainAdventure(int tourId, String tourName, TourPackage tourPackage) {
        super(tourId, tourName, tourPackage);
    }

    public boolean isCampingOvernight() {
        return campingOvernight;
    }

    @Override
    public void displayInfo() {
        System.out.println("tur id'si: " + getTourId() + " tur adi: " + getTourName() + " Kamp qurmaq: " + (campingOvernight ? " olar" : " Olmaz"));


    }
}
