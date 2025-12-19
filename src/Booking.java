public class Booking {

    String bookingNumber;
    boolean confirmed;

    public Booking(String bookingNumber) {
        this.bookingNumber = bookingNumber;
        this.confirmed = false;
    }

    public void confirmBooking(Flight flight) {
        if (flight.seats > 0) {
            confirmed = true;
            flight.reduceSeat();
        }
    }

    public void showBookingInfo() {
        System.out.println("Booking number: " + bookingNumber);
        System.out.println("Confirmed: " + confirmed);
    }
}
