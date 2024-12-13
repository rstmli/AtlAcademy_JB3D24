package HotelTask;

import travelApp.Customer;
import travelApp.Tour;

import java.util.ArrayList;
import java.util.List;

public class HotelAgency {
    private String agencyName;
    private List<Room> rooms;
    private List<Customer> customer;

    public HotelAgency(String agencyName) {
        this.agencyName = agencyName;
        this.rooms = new ArrayList<>();
        this.customer = new ArrayList<>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }
    public void addRoom(Room room) {
        rooms.add(room);
    }
    public void deleteTour(Room room){
        rooms.remove(room);
    }
    public void displayInfo(){
        System.out.println(agencyName + " terefinden teklif olunan oteller");
        for(Customer custom : customer){
            custom.displayInfo();

        }
    }
}
