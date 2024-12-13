package HotelTask;

import java.util.ArrayList;
import java.util.List;

public class Customer{
    private int customerId;
    private String customerName;
    private List<Room> reserveRoom;

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.reserveRoom = new ArrayList<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Room> getReserveRoom() {
        return reserveRoom;
    }

    public void setReserveRoom(List<Room> reserveRoom) {
        this.reserveRoom = reserveRoom;
    }
    public void reserveRoom(Room room){
        if(room.isBooked()){
            room.reserve();
            reserveRoom.add(room);
            System.out.println("Room: "+room.getRoomNumber()+" otaq sizin siyahiya elave edildi");
        }
    }
    public void cancelReserve(Room room){
        if(reserveRoom.contains(room)){
            room.deleteReserve();
            reserveRoom.remove(room);
            System.out.println(room.getRoomNumber() + " otaq siyahidan silindi.");
        }else{
            System.out.println("artiq reserve legv olunub");
        }
    }



}
