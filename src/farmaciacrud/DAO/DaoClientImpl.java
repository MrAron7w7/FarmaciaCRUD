package farmaciacrud.DAO;

import farmaciacrud.Conexion.ConexionBD;
import farmaciacrud.MetodosTrabajos.Cliente;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoClientImpl implements DaoCliente {

    ConexionBD conexiondb = ConexionBD.getInstance();

    @Override
    public void registrar(Cliente cliente) {
        try {
            Connection conectar = conexiondb.conectar();
            PreparedStatement insertar = conectar.prepareStatement("INSERT INTO clientes(nombres,apellidos,dni,datos) VALUES(?,?,?,?)");

            // Agrego de los datos
            //insertar.setInt(1, cliente.getId());
            insertar.setString(1, cliente.getNombre());
            insertar.setString(2, cliente.getApellidos());
            insertar.setInt(3, cliente.getDni());
            insertar.setString(4, cliente.getBusqueda());

            insertar.executeUpdate();
            // Cerrar conexion
            conexiondb.cerrarConexion();

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoClientImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void eliminar(Cliente cliente) {

        try {
            Connection conectar = conexiondb.conectar();
            String sql = "DELETE FROM clientes WHERE idclientes=?";
            PreparedStatement eliminar = conectar.prepareStatement(sql);
            eliminar.setInt(1, cliente.getId());

            int rs;
            rs = eliminar.executeUpdate();

            eliminar = conectar.prepareStatement(sql);
            rs = eliminar.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Dato del registro eliminado con exito");

            }
            System.out.println(rs);

        } catch (SQLException e) {
            System.out.println("Error al eliminar los datos de db: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoClientImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void buscar(Cliente cliente) {
        try {
            Connection conectar = conexiondb.conectar();
            PreparedStatement buscar = conectar.prepareStatement("select * from clientes where id = ?");

            // Proceso de busqueda
            buscar.setInt(1, cliente.getId());
            ResultSet consulta = buscar.executeQuery();

            // Si tiene los datos o no
            if (consulta.next()) {
                cliente.setId(Integer.parseInt(consulta.getString("id")));
                cliente.setNombre(consulta.getString("id"));

            }
            conexiondb.cerrarConexion();

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoClientImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizar(Cliente cliente) {
    }

}
