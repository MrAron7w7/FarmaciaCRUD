package farmaciacrud.DAO;

import farmaciacrud.Conexion.ConexionBD;
import farmaciacrud.MetodosTrabajos.Voucher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoVoucherImpl implements DaoVoucher{
    ConexionBD conexiondb = ConexionBD.getInstance();

    @Override
    public void buscar(Voucher voucher) {
        
        try {
            Connection conectar = conexiondb.conectar();
            PreparedStatement buscar = conectar.prepareStatement("SELECT * FROM vouchers WHERE idvouchers=?");
            buscar.setInt(1, voucher.getDni());
            
            buscar.executeUpdate();
            // Cerrar conexion
            conexiondb.cerrarConexion();
            
        } catch (SQLException e) {
            System.out.println("Error " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoVoucherImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}