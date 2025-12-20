public class Booking {

    private String bookingNumber;
    private boolean confirmed;

    public Booking(String bookingNumber) {
        this.bookingNumber = bookingNumber;
        this.confirmed = false;
    }

    public String getBookingNumber() { return bookingNumber; }
    public boolean isConfirmed() { return confirmed; }

    public void setBookingNumber(String bookingNumber) { this.bookingNumber = bookingNumber; }
    public void setConfirmed(boolean confirmed) { this.confirmed = confirmed; }

    public void confirmBooking(Flight flight) {
        if (flight.getSeats() > 0) {
            confirmed = true;
            flight.reduceSeat();
        }
    }

    public void showBookingInfo() {
        System.out.println("Booking number: " + bookingNumber);
        System.out.println("Confirmed: " + confirmed);
    }
}
