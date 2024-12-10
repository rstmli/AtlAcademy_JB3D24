package HotelTask;

public class StandartRoom extends Room{
    private boolean singleBed = true;
    public StandartRoom(int roomNumber, double roomPrice) {
        super(roomNumber, roomPrice);
    }

    @Override
    public void displayInfo() {
        System.out.println("otaq nomresi: " + getRoomNumber() + " otaqin qiymeti: " + getRoomPrice() + " yataq olcusu: " + (singleBed ? " tek yataq" : " cut yataq"));
    }
}
