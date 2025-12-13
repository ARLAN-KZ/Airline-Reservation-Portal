package AirlineReservationPortal;

public class Flight {
    String flightNumber;
    String destination;
    public Flight(String flightNumber, String destination){
        this.flightNumber = flightNumber;
        this.destination = destination;
    }
    public String getFlightNumber(){
        return flightNumber;
    }
    public String getDestination(){
        return destination;
    }
}

git config --global user.email "253680@astanait.edu.kz"
git config --global user.name "ARLAN-KZ"