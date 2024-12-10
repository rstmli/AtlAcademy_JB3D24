package HotelTask;

public abstract class Room {
    private final int roomNumber;
    private final double roomPrice;
    private boolean isBooked = true;

    public Room(int roomNumber, double roomPrice) {
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public boolean isBooked() {
        return isBooked;
    }
    public void reserve(){
        if(isBooked){
            this.isBooked = false;
            System.out.println(getRoomNumber() + " otaq rezerve edildi.");
        }else{
            System.out.println("Otaq doludur!!!!!");
        }
    }
    public void deleteReserve(){
        if(!isBooked){
            this.isBooked = true;
            System.out.println(getRoomNumber() + " otaq rezervesi legv edildi.");
        }else{
            System.out.println(getRoomNumber() + " otaq reserve edilmeyib!!");
        }

    }
    public abstract void displayInfo();
}
