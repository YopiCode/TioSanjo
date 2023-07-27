package proyecto_utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar() {
        String databaseName = "tiosanjo";
        String databaseUser = "root";
        String databasePassword = "admin";
        String url = "jdbc:mysql://localhost/" + databaseName;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(url, databaseUser, databasePassword);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se conectó a la base " + databaseName);
        }
        return null;
    }
}
