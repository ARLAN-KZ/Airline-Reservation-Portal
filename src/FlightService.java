import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class FlightService {

    public static void addFlight(Flight flight) {

        String sql = "INSERT INTO flight (flight_number, destination, flight_date, seats) " +
                "VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, flight.getFlightNumber());
            ps.setString(2, flight.getDestination());
            ps.setDate(3, java.sql.Date.valueOf(flight.getFlightDate()));
            ps.setInt(4, flight.getSeats());

            ps.executeUpdate();
            System.out.println("Flight added successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showAllFlights() {

        String sql = "SELECT * FROM flight";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("ID | Flight Number | Destination | Date | Seats");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("flight_number") + " | " +
                                rs.getString("destination") + " | " +
                                rs.getDate("flight_date") + " | " +
                                rs.getInt("seats")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateDestination(int id, String newDestination) {

        String sql = "UPDATE flight SET destination = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, newDestination);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Flight updated successfully");
            } else {
                System.out.println("Flight not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteFlight(int id) {

        String sql = "DELETE FROM flight WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Flight deleted successfully");
            } else {
                System.out.println("Flight not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}