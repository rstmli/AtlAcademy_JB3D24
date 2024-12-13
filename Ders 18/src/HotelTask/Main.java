package HotelTask;

public class Main {
    public static void main(String[] args) {
        HotelAgency agency = new HotelAgency("HTLROOM");
        Room room1 = new Room(15,200,RoomType.STANDARD);
        Room room2 = new Room(20,500,RoomType.SUITE);
        Room room3 = new Room(30,1000,RoomType.DELUXE);

        Customer custom = new Customer(1,"Custom");

        agency.addRoom(room1);
        agency.addRoom(room2);
        agency.addRoom(room3);
        custom.reserveRoom(room1);
        custom.reserveRoom(room2);
        agency.displayInfo();




    }
}
