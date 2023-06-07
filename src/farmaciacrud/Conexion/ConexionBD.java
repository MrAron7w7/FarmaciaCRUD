package farmaciacrud.Conexion;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionBD {

    private ConexionBD() {

    }

    private static Connection conexion;
    private static ConexionBD instancia;
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/farmaciaDB?serverTimezone=UTC";

    private final String USER = "";
    private final String PASSWORD = "";

    public Connection conectar() throws ClassNotFoundException {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, USER, PASSWORD);

            return conexion;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return conexion;
    }

    // Este metodo cerramos coneccion
    public void cerrarConexion() throws SQLException {
        try {
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "
                    + e);
        } finally {
            conexion.close();
        }

    }

    // Patron de singleton
    public static ConexionBD getInstance() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

}
