package HotelTask;

import travelApp.Customer;

import java.util.List;

public class HotelAgency {
    private String agencyName;
    private List<Room> rooms;
    private List<Customer> customer;

    public HotelAgency(String agencyName, List<Room> rooms, List<Customer> customer) {
        this.agencyName = agencyName;
        this.rooms = rooms;
        this.customer = customer;
    }

}
