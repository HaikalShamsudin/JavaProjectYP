package Day9.Q7;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Day10.Example.ToDo;

public class Chat {
    public void insert(String message) {
        String INSERT_SQL = "insert into todos (title, due, description) values(?, ?, ?);";
        try (Connection connection = MySQLConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL))
}
