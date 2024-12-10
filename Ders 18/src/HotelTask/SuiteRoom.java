package HotelTask;

public class SuiteRoom extends Room{
    private boolean isMetbex = true;

    public SuiteRoom(int roomNumber, double roomPrice) {
        super(roomNumber, roomPrice);
    }

    public boolean isMetbex() {
        return isMetbex;
    }

    @Override
    public void displayInfo(){
        System.out.println("otaq nomresi: " + getRoomNumber() + " otaqin qiymeti: " + getRoomPrice() + " metbex hecmi: " + (isMetbex ? " metbex boyukdur" : " metbex kicikdir"));
    }
}
