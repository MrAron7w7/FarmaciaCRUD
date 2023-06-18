package farmaciacrud.DAO;

import farmaciacrud.CRUD;
import farmaciacrud.Conexion.ConexionBD;
import farmaciacrud.MetodosTrabajos.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoLoginImpl implements DaoLogin {

    ConexionBD conexiondb = ConexionBD.getInstance();

    CRUD crud = new CRUD();

    @Override
    public void validar(Login login) {

        // Busqueda de datos para verificar si esta en MySql
        Connection conectar;

        ResultSet rs;

        PreparedStatement verificar;

        try {

            conectar = conexiondb.conectar();

            verificar = conectar.prepareStatement("SELECT * FROM login WHERE nombre=(?) and contrasenia=(?)");

            verificar.setString(1, login.getUser());

            verificar.setString(2, login.getPass());

            rs = verificar.executeQuery();

            if (rs.next()) {

                //crud.validadInicio();

            } else {

                JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);

            }

            // Cerrar conexion
            conexiondb.cerrarConexion();

        } catch (SQLException e) {

            System.out.println(e);

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(DaoLoginImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
