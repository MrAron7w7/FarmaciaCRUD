package farmaciacrud.Ventanas;

import farmaciacrud.Conexion.ConexionBD;
import farmaciacrud.DAO.DaoVoucherImpl;
import farmaciacrud.MetodosTrabajos.Cliente;
import farmaciacrud.MetodosTrabajos.Voucher;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ventanaPanelVoucher extends javax.swing.JPanel {

    public void mostrar(String tabla) throws ClassNotFoundException {
        ConexionBD con = new ConexionBD();
        Statement st;
        String sql = "Select * FROM " + tabla;
        Connection ConexionDB = con.conectar();

        // Poner table editable o no editable
        tbeVoucher.setEnabled(true);

        // Defino el numero de columnas de la tabla voucher
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("DNI");
        model.addColumn("Nombre");
        model.addColumn("Compra");
        //model.addColumn("Precio");

        tbeVoucher.setModel(model);

        // Vector de columnas de la tabla
        String[] vouch = new String[3];

        try {
            st = ConexionDB.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                vouch[0] = rs.getString(4);
                vouch[1] = rs.getString(2);
                vouch[2] = rs.getString(5);
                //vouch[3] = rs.getString(5);

                model.addRow(vouch);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }

    }

    /*  public void mostrarDatos() throws ClassNotFoundException, SQLException {
        ConexionBD con = new ConexionBD();
        Cliente cliente = new Cliente();
        try {
            //Statement st;
            String sql = "INSERT INTO vouchers(dni, nombre, compra, precio) VALUES(?,?,?,?)";
            PreparedStatement buscar = con.conectar().prepareStatement(sql);

            buscar.setInt(1, cliente.getDni());
            buscar.setString(2, cliente.getNombre());
            buscar.setString(3, cliente.getApellidos());
            buscar.setString(4, cliente.getNombre());
            con.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }*/
    public ventanaPanelVoucher() throws ClassNotFoundException, SQLException {
        initComponents();
        //mostrarDatos();
        mostrar("clientes");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDniVoucher = new javax.swing.JTextField();
        btnBuscarVoucher = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbeVoucher = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Busqueda por DNI:");

        txtDniVoucher.setBackground(new java.awt.Color(255, 255, 255));
        txtDniVoucher.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtDniVoucher.setForeground(new java.awt.Color(51, 51, 51));
        txtDniVoucher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniVoucherKeyReleased(evt);
            }
        });

        btnBuscarVoucher.setBackground(new java.awt.Color(42, 166, 67));
        btnBuscarVoucher.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnBuscarVoucher.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVoucher.setText("Buscar");
        btnBuscarVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarVoucherMouseClicked(evt);
            }
        });

        tbeVoucher.setBackground(new java.awt.Color(255, 255, 255));
        tbeVoucher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Nombre", "Compra", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbeVoucher.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tbeVoucher);

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(102, 102, 255));
        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtDniVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDniVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVoucher))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnBuscarVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarVoucherMouseClicked
        Voucher voucher = new Voucher();
        DaoVoucherImpl voucher_dao = new DaoVoucherImpl();

        try {
            voucher.setDni(Integer.parseInt(txtDniVoucher.getText()));
            voucher_dao.buscar(voucher);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Llene el campo a buscar", "Error", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnBuscarVoucherMouseClicked

    private void buscarCliente(String s) throws ClassNotFoundException {
        String sql = "SELECT * FROM clientes WHERE dni like '%" + s + "%'";
        ConexionBD con = new ConexionBD();
        
        //Connection ConexionDB = con.conectar();

        // Poner table editable o no editable
        tbeVoucher.setEnabled(true);

        // Defino el numero de columnas de la tabla voucher
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("DNI");
        model.addColumn("Nombre");
        model.addColumn("Compra");
        //model.addColumn("Precio");

        tbeVoucher.setModel(model);

        // Vector de columnas de la tabla
        String[] vouch = new String[3];
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;

        try {
            
            pst = con.conectar().prepareStatement(sql);
            rs = pst.executeQuery(sql);
            while (rs.next()) {
                vouch[0] = rs.getString("dni");
                vouch[1] = rs.getString("nombres");
                vouch[2] = rs.getString("datos");
                //vouch[3] = rs.getString(5);

                model.addRow(vouch);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }

        
    }
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        try {
            eliminar();
        } catch (Exception e) {
            Icon wrong = new ImageIcon(getClass().getResource("wrong.png"));
            JOptionPane.showMessageDialog(null, "No ha escogido un dato a eliminar", "Error", JOptionPane.WARNING_MESSAGE, wrong);
        }


    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        try {
            mostrar("clientes");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error no se pudo actualizar los datos");
        }
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void txtDniVoucherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniVoucherKeyReleased
        try {
            buscarCliente(txtDniVoucher.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaPanelVoucher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtDniVoucherKeyReleased

    public void eliminar() throws SQLException, ClassNotFoundException {
        ConexionBD con = ConexionBD.getInstance();
        int fila = tbeVoucher.getSelectedRow();
        String identidad = tbeVoucher.getValueAt(fila, 0).toString();
        String sql = "DELETE FROM clientes WHERE dni=" + identidad;
        try {
            PreparedStatement eliminar = con.conectar().prepareStatement(sql);
            eliminar.executeUpdate();
            if (eliminar.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dato eliminado con exito");
            }
            mostrar("clientes");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarVoucher;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbeVoucher;
    private javax.swing.JTextField txtDniVoucher;
    // End of variables declaration//GEN-END:variables
}
