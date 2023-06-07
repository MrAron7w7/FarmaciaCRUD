package farmaciacrud.DAO;

import farmaciacrud.Conexion.ConexionBD;
import farmaciacrud.Metodos.Operadores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoOperadoresImpl implements DaoOperadores{
    
    ConexionBD conexiondb = ConexionBD.getInstance();

    @Override
    public void registrarOperadores(Operadores operadores) {
        try {
            Connection conectar = conexiondb.conectar();
            PreparedStatement insertar = conectar.prepareStatement("INSERT INTO operadores(nombre,hora) VALUES(?,?)");
            
            // Agregamos los datos
            insertar.setString(1, operadores.getNombreOperadores());
            insertar.setString(2, operadores.getHora());
            insertar.executeUpdate();
            
            // Cerramos conexion
            conexiondb.cerrarConexion();
            
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoOperadoresImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
