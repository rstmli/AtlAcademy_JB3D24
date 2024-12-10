package HotelTask;

public class Main {
    public static void main(String[] args) {
        StandartRoom standartRoom = new StandartRoom(10,200);
        SuiteRoom suiteRoom = new SuiteRoom(20,200);
        DeluxeRoom deluxeRoom = new DeluxeRoom(30,300);
        Room[] rooms = {standartRoom,suiteRoom,deluxeRoom};

        standartRoom.reserve();
        suiteRoom.deleteReserve();
        for(Room room : rooms){
            if(room.isBooked()){
                room.displayInfo();
            }
        }
    }
}
