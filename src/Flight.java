public class Flight {
    private String flightNumber;
    private String destination;
    private String date;
    private int seats;
    public Flight(String flightNumber, String destination, String date, int seats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.date = date;
        this.seats = seats;
    }

    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public String getDate() { return date; }
    public int getSeats() { return seats; }

    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }
    public void setDestination(String destination) { this.destination = destination; }
    public void setDate(String date) { this.date = date; }
    public void setSeats(int seats) { this.seats = seats; }

    public void showFlightInfo() {
        System.out.println("Flight number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Date: " + date);
        System.out.println("Available seats: " + seats);
    }

    public void reduceSeat() {
        if (seats > 0) {
            seats--;
        }
    }
}
