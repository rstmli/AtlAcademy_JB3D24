package HotelTask;

public class DeluxeRoom extends Room{
    private boolean isBalcony = true;
    public DeluxeRoom(int roomNumber, double roomPrice) {
        super(roomNumber, roomPrice);
    }

    @Override
    public void displayInfo(){
        System.out.println("otaq nomresi: " + getRoomNumber() + " otaqin qiymeti: " + getRoomPrice() + " Balkon hecmi: " + (isBalcony ? " balkon boyukdur" : " Balkon kicikdir" ));
    }
}
