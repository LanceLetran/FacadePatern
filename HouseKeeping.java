public class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void executeService() {
        cleanRoom(roomNumber);
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Room number " + roomNumber + " has been cleaned.");
    }
}
