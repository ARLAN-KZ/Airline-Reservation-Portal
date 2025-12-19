public class Flight {

    String flightNumber;
    String destination;
    String date;
    int seats;

    public Flight(String flightNumber, String destination, String date, int seats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.date = date;
        this.seats = seats;
    }

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
