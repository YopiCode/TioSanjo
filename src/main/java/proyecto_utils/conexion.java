
package proyecto_utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    
    
     private Connection connection;
     public Connection conectar(){
        String databaseName = "jtech_db";
        String databaseUser = "root";
        String databasePassword = "admin";
        String url = "jdbc:mysql://localhost/" + databaseName;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, databaseUser, databasePassword);
           
        }catch (Exception e){
            System.out.println("No se conectó a la base " + databaseName);
        }
        return connection;
    }
}
