public class Main {
    public static void main(String[] args) {


        Flight flight = new Flight("KC101", "Almaty", "20.12.2025", 2);


        Passenger passenger1 = new Passenger(
                "Arlan", "KZ123456", 20, "+77001234567"
        );


        Passenger passenger2 = new Passenger(
                "Amina", "KZ654321", 19, "+77007654321"
        );


        Booking booking1 = new Booking("B001");
        Booking booking2 = new Booking("B002");


        flight.showFlightInfo();
        System.out.println();


        passenger1.showPassengerInfo();
        System.out.println();
        passenger2.showPassengerInfo();
        System.out.println();

        booking1.confirmBooking(flight);
        booking2.confirmBooking(flight);
        booking1.showBookingInfo();
        booking2.showBookingInfo();
        System.out.println();


        flight.showFlightInfo();
    }
}
