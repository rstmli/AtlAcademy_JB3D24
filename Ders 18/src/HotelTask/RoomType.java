package HotelTask;

public enum RoomType {
    STANDARD{
        @Override
        void displayInfo() {

        }
    },
    SUITE {
        @Override
        void displayInfo() {

        }
    },
    DELUXE {
        @Override
        void displayInfo() {

        }
    };

    abstract void displayInfo();

}
