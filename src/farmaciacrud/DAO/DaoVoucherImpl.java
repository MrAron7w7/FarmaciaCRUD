package farmaciacrud.DAO;

import farmaciacrud.Conexion.ConexionBD;
import farmaciacrud.MetodosTrabajos.Voucher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoVoucherImpl implements DaoVoucher {

    ConexionBD conexiondb = ConexionBD.getInstance();

    @Override
    public void buscar(Voucher voucher) {
        ResultSet consulta;
        try {
            Connection conectar = conexiondb.conectar();
            PreparedStatement buscar = conectar.prepareStatement("SELECT * FROM clientes WHERE dni=?");
            buscar.setInt(1, voucher.getDni());
            consulta = buscar.executeQuery();

            if (consulta.next()) {
                JOptionPane.showMessageDialog(null, "Usuario encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Error", JOptionPane.WARNING_MESSAGE);

            }
            // Cerrar conexion
            conexiondb.cerrarConexion();

        } catch (SQLException e) {
            System.out.println("Error " + e.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoVoucherImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
