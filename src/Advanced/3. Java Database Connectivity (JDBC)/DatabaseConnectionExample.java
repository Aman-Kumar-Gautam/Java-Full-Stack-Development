import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database.");

            // Close the connection
            connection.close();
            System.out.println("Connection closed.");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Failed to load JDBC driver.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failed.");
        }
    }
}