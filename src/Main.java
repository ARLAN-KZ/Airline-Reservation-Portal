import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FlightService service = new FlightService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Airline Reservation Portal ===");
            System.out.println("1. Add flight");
            System.out.println("2. Show all flights");
            System.out.println("3. Update flight destination");
            System.out.println("4. Delete flight");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Flight number: ");
                    String number = scanner.nextLine();

                    System.out.print("Destination: ");
                    String destination = scanner.nextLine();

                    System.out.print("Flight date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();

                    System.out.print("Seats: ");
                    int seats = scanner.nextInt();
                    scanner.nextLine();

                    Flight flight = new Flight(number, destination, date, seats);
                    service.addFlight(flight);
                }

                case 2 -> service.showAllFlights();

                case 3 -> {
                    System.out.print("Enter flight ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("New destination: ");
                    String newDestination = scanner.nextLine();

                    service.updateDestination(id, newDestination);
                }

                case 4 -> {
                    System.out.print("Enter flight ID to delete: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    service.deleteFlight(id);
                }

                case 0 -> {
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid option!");
            }
        }
    }
}
