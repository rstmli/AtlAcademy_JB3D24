package travelApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tour cityTour = new CityTour(1,"Seher Turu",TourPackage.CITY_TOUR);
        Tour desertTour = new DesertSafari(2,"sehra Turu",TourPackage.DESERT_SAFARI);
        Tour shipTour = new CruiseTrip(3,"Gemi Turu",TourPackage.CRUISE_TRIP);
        Tour beachTour = new BeachHoliday(4,"pilaj Turu",TourPackage.BEACH_HOLIDAY);
        Tour mountTour = new MountainAdventure(5,"Dag Turu",TourPackage.BEACH_HOLIDAY);

        ArrayList<Tour> tours = new ArrayList<>();
        tours.add(cityTour);
        tours.add(desertTour);
        tours.add(shipTour);
        tours.add(beachTour);
        tours.add(mountTour);
        cityTour.reserve();

        for(Tour tour : tours){
            if(tour.isReserved()){
                tour.displayInfo();
            }
        }

    }
}
