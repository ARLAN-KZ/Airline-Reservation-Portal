class Passenger extends Person {
    private String passport;


    public Passenger(String name, String passport) {
        super(name);
        this.passport = passport;
    }


    public String getPassport() {
        return passport;
    }


    @Override
    public String toString() {
        return "Passenger{name='" + getName() + "', passport='" + passport + "'}";
    }
}