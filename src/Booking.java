class Booking {
    private Passenger passenger;
    private Flight flight;
    private boolean confirmed;


    public Booking(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
        this.confirmed = flight.bookSeat();
    }


    @Override
    public String toString() {
        return "Booking{passenger=" + passenger.getName() + ", confirmed=" + confirmed + "}";
    }
}