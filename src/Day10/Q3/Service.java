package Day10.Q3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Service {

    public Service(){}
    
    public void insert(String Title) {
        String INSERT_SQL = "INSERT INTO todolist (title) VALUES (?);";
        try (Connection connection = MYSQLConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {
            
            preparedStatement.setString(1, Title);

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
