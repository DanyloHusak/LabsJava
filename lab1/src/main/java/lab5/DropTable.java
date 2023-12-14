package lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(DatabaseConfig.URL, DatabaseConfig.USER, DatabaseConfig.PASSWORD);
            Statement statement = connection.createStatement();

            String dropTableSQL = "DROP TABLE IF EXISTS animals";
            statement.executeUpdate(dropTableSQL);

            System.out.println("Table dropped successfully!");

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}