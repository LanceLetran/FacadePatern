public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        // Example usage:
        // Guest requests a valet service
        Valet valetService = new Valet("ABC123");
        frontDesk.requestService(valetService);

        // Guest requests housekeeping
        HouseKeeping houseKeepingService = new HouseKeeping(101);
        frontDesk.requestService(houseKeepingService);

        // Guest requests a luggage cart
        Cart cartService = new Cart(2);
        frontDesk.requestService(cartService);
    }
}
