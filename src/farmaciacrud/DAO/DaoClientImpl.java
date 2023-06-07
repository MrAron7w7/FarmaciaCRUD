package farmaciacrud.DAO;

import farmaciacrud.Conexion.ConexionBD;
import farmaciacrud.Metodos.Cliente;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            PreparedStatement eliminar = conectar.prepareStatement("delete from clientes where idclientes = ?");

            // ELiminar
            eliminar.setInt(1, cliente.getId());
            eliminar.executeUpdate();
            
            // Cerramos conexion
            conexiondb.cerrarConexion();

        } catch (SQLException e) {
            System.out.println(e);
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
