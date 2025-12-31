public class AirlineReservationApp {
    public static void main(String[] args) {


        Flight flight1 = new Flight("KC101", "Almaty", 3);
        Flight flight2 = new Flight("KC202", "London", 2);


        List<Flight> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);



        Passenger passenger1 = new Passenger("Arlan", "KZ111");
        Passenger passenger2 = new Passenger("Dana", "KZ222");
        Booking booking1 = new Booking(passenger1, flight1);
        Booking booking2 = new Booking(passenger2, flight2);

        List<Booking> bookings = new ArrayList<>();
        bookings.add(booking1);
        bookings.add(booking2);



        System.out.println("Flights to London:");
        for (Flight flight : flights) {
            if (flight.getDestination().equals("London")) {
                System.out.println(flight);
            }
        }


        System.out.println("
                All bookings:");
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }
}