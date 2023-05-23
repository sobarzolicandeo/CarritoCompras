
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private static final Logger logger = Logger.getLogger(Conexion.class.getName());
    private Connection con;
    private String url = "jdbc:mysql://localhost:3306/bdcarritocompras";
    private String user = "root";
    private String pass = "";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error al obtener la conexión", e);
        }
        return con;
    }
}



