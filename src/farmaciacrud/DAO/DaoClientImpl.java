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
    public void registrar(Cliente cliente, String fila) {
        try {
            Connection conectar = conexiondb.conectar();
            PreparedStatement insertar = conectar.prepareStatement("INSERT INTO clientes(nombres,apellidos,dni,datos,Precioo) VALUES(?,?,?,?,?)");

            // Agrego de los datos
            //insertar.setInt(1, cliente.getId());
            insertar.setString(1, cliente.getNombre());
            insertar.setString(2, cliente.getApellidos());
            insertar.setInt(3, cliente.getDni());
            insertar.setString(4, cliente.getBusqueda());
            insertar.setString(5, fila);

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
    public boolean actualizar(int columnaNombre, String columnaEditar) {

        String sql = "UPDATE medicamentos SET Stock='"+ columnaNombre + "'" + "WHERE Nombre='" + columnaEditar + "'" ;

        ConexionBD conector = ConexionBD.getInstance();

        Connection cn;

        PreparedStatement pst;

        //ResultSet rs;
        
        int rs;

        try {

            cn = conector.conectar();

            pst = cn.prepareStatement(sql);

            rs = pst.executeUpdate();
            
            if(rs > 0){
                
                return true;
                
            }else{
                
                return false;
                
            }

        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println("Error de actualizar: " + e.toString());
            
        }
        return false;

    }

    @Override
    public boolean upda(String con) {

 String sql = "UPDATE medicamentos SET Stock='"+ con + "'";

        ConexionBD conector = ConexionBD.getInstance();

        Connection cn;

        PreparedStatement pst;

        //ResultSet rs;
        
        int rs;

        try {

            cn = conector.conectar();

            pst = cn.prepareStatement(sql);

            rs = pst.executeUpdate();
            
            if(rs > 0){
                
                return true;
                
            }else{
                
                return false;
                
            }

        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println("Error de actualizar: " + e.toString());
            
        }
        return false;

    }

}
