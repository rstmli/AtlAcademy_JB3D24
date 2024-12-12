package travelApp;

import java.util.List;

public class Customer {
    private int customerId;
    private List<Tour> reserveTour;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Tour> getTours() {
        return reserveTour;
    }

    public void setTours(List<Tour> tours) {
        this.reserveTour = tours;
    }

    public Customer(int customerId, List<Tour> reserveTour) {
        this.customerId = customerId;
        this.reserveTour = reserveTour;
    }
    public void reserveTour(Tour tour){
        if(!tour.isReserved()){
            tour.reserve();
            reserveTour.add(tour);
            System.out.println("Tour" + tour.getTourName() + " has added list");
        }else{
            System.out.println("Tour paket reserve olunub artiq");
        }
    }
    public void canselReserve(Tour tour){
        if(reserveTour.contains(tour)){
            tour.deleteReserve();
            reserveTour.remove(tour);
            System.out.println(tour.getTourName() + " Tour siyahidan silindi.");
        }else{
            System.out.println("artiq reserve legv olunub");
        }
    }
}
