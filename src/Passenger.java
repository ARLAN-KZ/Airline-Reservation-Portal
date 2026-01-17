public class Passenger {

    private int id;
    private String fullName;
    private String passportNumber;

    public Passenger(String fullName, String passportNumber) {
        this.fullName = fullName;
        this.passportNumber = passportNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}
