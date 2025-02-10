import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "username";
        String password = "password";

        // Establish a database connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database!");

            // Example 1: Execute SELECT query with Statement
            executeSelectQuery(connection);

            // Example 2: Execute UPDATE query with Statement
            executeUpdateQuery(connection);

            // Example 3: Execute SELECT query with PreparedStatement
            executePreparedSelectQuery(connection);

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle connection or SQL errors
        }
    }

    // Method to execute SELECT query using Statement
    public static void executeSelectQuery(Connection connection) {
        String query = "SELECT * FROM users";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle SQL errors
        }
    }

    // Method to execute UPDATE query using Statement
    public static void executeUpdateQuery(Connection connection) {
        String updateQuery = "UPDATE users SET email = 'newemail@example.com' WHERE id = 1";
        try (Statement statement = connection.createStatement()) {
            int rowsAffected = statement.executeUpdate(updateQuery);
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle SQL errors
        }
    }

    // Method to execute SELECT query using PreparedStatement
    public static void executePreparedSelectQuery(Connection connection) {
        String sql = "SELECT * FROM users WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, 1); // Set parameter value (1-based index)
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle SQL errors
        }
    }
}
