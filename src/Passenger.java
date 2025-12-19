public class Passenger {

    String name;
    String passport;
    int age;
    String phone;

    public Passenger(String name, String passport, int age, String phone) {
        this.name = name;
        this.passport = passport;
        this.age = age;
        this.phone = phone;
    }

    public void showPassengerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Passport: " + passport);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
    }
}
