public class Main {
    public static void main(String[] args) {

        Flight flight = new Flight("KC101", "Almaty", "20.12.2025", 2);

        Passenger passenger1 = new Passenger("Arna", "KZ123456", 20, "+77001234567");
        Passenger passenger2 = new Passenger("Amina", "KZ654321", 19, "+77007654321");

        Booking booking1 = new Booking("B001");
        Booking booking2 = new Booking("B002");

        System.out.println("=== Flight Info Before Booking ===");
        flight.showFlightInfo();
        System.out.println();

        System.out.println("=== Passenger Info ===");
        passenger1.showPassengerInfo();
        System.out.println();
        passenger2.showPassengerInfo();
        System.out.println();

        passenger1.setPhone("+77009998877");
        flight.setDate("21.12.2025");
        booking1.setBookingNumber("B003");

        booking1.confirmBooking(flight);
        booking2.confirmBooking(flight);

        System.out.println("=== Booking Info ===");
        booking1.showBookingInfo();
        booking2.showBookingInfo();
        System.out.println();

        System.out.println("=== Flight Info After Booking ===");
        flight.showFlightInfo();
        System.out.println();}}



