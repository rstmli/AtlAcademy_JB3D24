package travelApp;

public class DesertSafari extends Tour{
    private boolean isCamel = true;

    public DesertSafari(int tourId, String tourName, TourPackage tourPackage) {
        super(tourId, tourName, tourPackage);
    }

    @Override
    public void displayInfo() {
        System.out.println("tur id'si: " + getTourId() + " tur adi: " + getTourName() + " deve: " + (isCamel ? " var" : " yoxdur"));

    }
}
