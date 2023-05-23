package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection con;
    private String url = "jdbc:mysql://localhost:3306/bdcarritocompras";
    private String user = "root";
    private String pass = "";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}



/*

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author docencia
 */
/*public class Conexion {
    Connection con;
    String url = "jdbc:mysql://localhost:3306/bdcarritocompras";
    String user = "root";
    String pass = "";
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, pass);
        } catch(Exception e) {
        }
        return con;
    }
}
 */
