package travelApp;

public class BeachHoliday extends Tour{
    private boolean toSwim = true;
    public BeachHoliday(int tourId, String tourName, TourPackage tourPackage) {
        super(tourId, tourName, tourPackage);
    }

    @Override
    public void displayInfo() {
        System.out.println("tur id'si: " + getTourId() + " tur adi: " + getTourName() + " uzmek: " + (toSwim ? " olar" : " Olmaz"));
    }
}
