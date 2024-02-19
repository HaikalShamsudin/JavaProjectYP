package Day10.Example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ToDoService {

    public ToDoService(){}
    
    public void insert(String Title, String due, String description) {
        String INSERT_SQL = "insert into todos (title, due, description) values(?, ?, ?);";
        try (Connection connection = MySQLConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {
            
            preparedStatement.setString(1, Title);
            preparedStatement.setString(2, due);
            preparedStatement.setString(3, description);

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
