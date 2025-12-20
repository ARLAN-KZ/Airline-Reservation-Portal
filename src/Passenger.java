public class Passenger {

    private String name;
    private String passport;
    private int age;
    private String phone;

    public Passenger(String name, String passport, int age, String phone) {
        this.name = name;
        this.passport = passport;
        this.age = age;
        this.phone = phone;
    }

    public String getName() { return name; }
    public String getPassport() { return passport; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }

    public void setName(String name) { this.name = name; }
    public void setPassport(String passport) { this.passport = passport; }
    public void setAge(int age) { this.age = age; }
    public void setPhone(String phone) { this.phone = phone; }

    public void showPassengerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Passport: " + passport);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
    }
}
