package travelApp;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
    private String agencyName;
    private List<Tour> tours;
    private List<Customer> customer;

    public TravelAgency(String agencyName) {
        this.agencyName = agencyName;
        this.tours = new ArrayList<>();
        this.customer = new ArrayList<>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }
    public void addTour(Tour tour) {
        tours.add(tour);
    }
    public void deleteTour(Tour tour){
        tours.remove(tour);
    }
    public void displayInfo(){
        System.out.println(agencyName + " terefinden teklif olunan turlar");
        for(Customer custom : customer){
            custom.displayInfo();

        }
    }

    @Override
    public String toString() {
        return "TravelAgency{" +
                "agencyName='" + agencyName + '\'' +
                ", tours=" + tours +
                ", customer=" + customer +
                '}';
    }
}
