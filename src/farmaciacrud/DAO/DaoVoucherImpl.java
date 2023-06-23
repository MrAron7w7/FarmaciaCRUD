package farmaciacrud.DAO;

import farmaciacrud.Conexion.ConexionBD;
import farmaciacrud.MetodosTrabajos.Cliente;
import farmaciacrud.MetodosTrabajos.Voucher;
import java.sql.*;
import java.util.*;

public class DaoVoucherImpl implements DaoVoucher {

    ConexionBD conector = ConexionBD.getInstance();

    Connection cn;

    PreparedStatement pst;

    ResultSet rs;

    String sql = "";

    Cliente cliente = new Cliente();

    Voucher voucher = new Voucher();

    List<Cliente> dataCliente = new ArrayList<>();

    @Override
    public boolean buscar(Voucher voucher) {

        this.voucher = (Voucher) voucher;

        this.sql = "SELECT * FROM clientes WHERE dni=?";

        try {

            cn = conector.conectar();

            this.pst = cn.prepareStatement(sql);

            this.pst.setInt(1, this.voucher.getDni());

            this.rs = this.pst.executeQuery();

            if (this.rs.next()) {

                return true;

            } else {

                return false;

            }

        } catch (SQLException | ClassNotFoundException e) {

            System.out.println("¡Error!: " + e.toString());
        }

        return false;
    }

    @Override
    public boolean eliminar(String eliminarVoucher) {

        this.sql = "DELETE FROM clientes WHERE dni='" + eliminarVoucher + "'";

        int seleccionEliminar;

        try {

            this.cn = conector.conectar();

            this.pst = cn.prepareStatement(sql);

            seleccionEliminar = this.pst.executeUpdate();

            if (seleccionEliminar > 0) {

                return true;

            } else {

                return false;

            }

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("¡Error!: " + e.toString());

            return false;

        }

    }

    // No sirve
    @Override
    public List<?> mostrar() {

        this.sql = "SELECT * FROM clientes";

        try {

            cn = conector.conectar();

            this.pst = cn.prepareStatement(sql);

            this.rs = this.pst.executeQuery();

            while (this.rs.next()) {

                dataCliente.add(new Cliente(this.rs.getString("nombres"),
                                     this.rs.getString("apellidos"), 
                                          this.rs.getInt("dni"), 
                                      this.rs.getString("datos")));
                this.cn.close();

                this.rs.close();
            }

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("¡Error!: " + e.toString());

        }

        return this.dataCliente;

    }

}
