public class Flight {

    private int id;
    private String flightNumber;
    private String destination;
    private String flightDate;
    private int seats;

    public Flight(String flightNumber, String destination, String flightDate, int seats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.flightDate = flightDate;
        this.seats = seats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public int getSeats() {
        return seats;
    }
}
