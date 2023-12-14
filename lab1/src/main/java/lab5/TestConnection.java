package lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Animal";
        String user = "root";
        String password = "root1029384756";

        String connectionName = "MySQLConnection";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Connected to database: " + connectionName);
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Connection to database failed. Error: " + e.getMessage());
        }
    }
}