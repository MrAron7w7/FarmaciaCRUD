package farmaciacrud.DAO;

import farmaciacrud.Conexion.ConexionBD;
import farmaciacrud.MetodosTrabajos.Operadores;
import java.sql.*;
import java.util.*;

public class DaoOperadoresImpl implements DaoOperadores {

    ConexionBD conector = ConexionBD.getInstance();

    String sql = "";

    Connection cn;

    PreparedStatement pst;

    ResultSet rs;

    Operadores operadores = new Operadores();

    List<Operadores> data = new ArrayList<>();

    @Override
    public boolean registrarOperadores(Object operadors) {

        int filas;

        this.operadores = (Operadores) operadors;

        this.sql = "INSERT INTO operadores(nombre,hora) VALUES(?,?)";

        try {
            this.cn = conector.conectar();

            this.pst = cn.prepareStatement(this.sql);

            this.pst.setString(1, this.operadores.getNombreOperadores());

            this.pst.setString(2, this.operadores.getHora());

            filas = this.pst.executeUpdate();

            if (filas > 0) {

                return true;

            } else {

                return false;

            }

        } catch (SQLException | ClassNotFoundException e) {

            System.out.println("¡Error!: " + e.toString());

            return false;

            // Retornamos falso donde no se guardara nada
        }
//        try {
//            Connection conectar = conexiondb.conectar();
//            PreparedStatement insertar = conectar.prepareStatement("INSERT INTO operadores(nombre,hora) VALUES(?,?)");
//
//            // Agregamos los datos
//            insertar.setString(1, operadores.getNombreOperadores());
//            insertar.setString(2, operadores.getHora());
//            insertar.executeUpdate();
//
//            // Cerramos conexion
//            conexiondb.cerrarConexion();
//
//        } catch (SQLException e) {
//            System.out.println(e);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DaoOperadoresImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @Override
    public List<Operadores> seleccionar() {

        this.sql = "SELECT * FROM operadores";

        try {

            cn = ConexionBD.getInstance().conectar();

            this.pst = this.cn.prepareStatement(this.sql);

            this.rs = this.pst.executeQuery();

            while (this.rs.next()) {

                data.add(new Operadores(this.rs.getString("nombre"), // La columna de la base de datos

                        this.rs.getString("hora")));

            }

            this.cn.close();

            this.rs.close();

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("Error: " + e.toString());

        }

        return this.data;
    }

}
