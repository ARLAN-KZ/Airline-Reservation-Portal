class Flight {
    private String number;
    private String destination;
    private int seats;


    public Flight(String number, String destination, int seats) {
        this.number = number;
        this.destination = destination;
        this.seats = seats;
    }


    public String getDestination() {
        return destination;
    }


    public boolean bookSeat() {
        if (seats > 0) {
            seats--;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Flight{" + number + ", " + destination + ", seats=" + seats + "}";
    }
}