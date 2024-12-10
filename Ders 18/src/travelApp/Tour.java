package travelApp;

public abstract class Tour {
    private int tourId;
    private String tourName;
    private boolean isReserved = true;
    private TourPackage tourPackage;

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public TourPackage getTravelType() {
        return tourPackage;
    }

    public void setTravelType(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    public void reserve(){
        if(isReserved){
            System.out.println( getTourName() + " - Tur reserve edildi");
            isReserved = false;
        }else{
            System.out.println(" - Tur yoxdur!!!!");
        }
    }
    public void deleteReserve(){
        if(!isReserved){
            System.out.println(getTourName() + " - tur reserve iptal olundu");
        }
    }

    public Tour(int tourId, String tourName, TourPackage tourPackage) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.tourPackage = tourPackage;
    }
    public abstract void displayInfo();

}
