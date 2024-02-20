package Day10.Q15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLMethod {

    public MySQLMethod() {
    }

    public void insert(String name, String details) {
        String INSERT_SQL = "INSERT INTO recipe (name, details) VALUES (?, ?);";
        try (Connection connection = MySQLConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, details);

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.execute();
            connection.close();
        } catch (SQLException e) {
            // print SQL exception information
            e.printStackTrace();
        }
    }

    public void delete(String name, String details) {
        String DELETE_EXPENSE_SQL= "DELETE FROM recipe WHERE name = ? AND details = ? ;";
        try (Connection connection = MySQLConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EXPENSE_SQL)) {

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, details);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Recipe delete succesfully from database.");
            } else {
                System.out.println("No mattching recipe found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
