package Day9.java.Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnector {


    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/MyDatabase";
    private static final String JDBC_USER = "username";
    private static final String JDBC_PASSWORD = "password";

    public static void main(String[] args) {
        // Establishing the connection
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            System.out.println("Connected to the database.");

            // Creating a statement
            try (Statement statement = connection.createStatement()) {
                // Executing a simple query
                String query = "SELECT * FROM users";
                try (ResultSet resultSet = statement.executeQuery(query)) {
                    // Processing the result set
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        String email = resultSet.getString("email");
                        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
    }
        public void insert(String INSERT_USERS_SQL, Expense data) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {

            preparedStatement.setString(1, data.getTitle());
            preparedStatement.setDate(2, data.getDate());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.execute();
            connection.close();
        } catch (SQLException e) {
            // print SQL exception information
            e.printStackTrace();
        }
    }

}
