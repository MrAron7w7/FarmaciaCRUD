package farmaciacrud.Ventanas;

import farmaciacrud.Conexion.ConexionBD;
import farmaciacrud.DAO.DaoClientImpl;
import farmaciacrud.MetodosTrabajos.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ventanaPanelDatos extends javax.swing.JPanel {

    public void mostar(String tabla) throws ClassNotFoundException {

        // Nos conectamos a la base de datos
        ConexionBD con = new ConexionBD();
        String sql = "Select * FROM " + tabla;
        Statement st;
        Connection ConexionDB = con.conectar();

        // Poner tabla editable o no editable
        tbeMedicamentos.setEnabled(true);

        // Defino el numero de columnas de tablas
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Precio");
        model.addColumn("Stock");

        tbeMedicamentos.setModel(model);

        // Vector de las columnas de la tabla medicamentos
        String[] medicamentos = new String[3];

        try {
            st = ConexionDB.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                medicamentos[0] = rs.getString(2);
                medicamentos[1] = rs.getString(3);
                medicamentos[2] = rs.getString(4);
                model.addRow(medicamentos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

    }

    public ventanaPanelDatos() throws ClassNotFoundException {
        
        initComponents();
        
        mostar("medicamentos");
        
        //popMenu();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        popMenuCliente = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        datosApellidos = new javax.swing.JTextField();
        datosNombres = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbeMedicamentos = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        datosDNI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        datosBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

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

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Abyssinica SIL", 0, 15)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(660, 450));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Datos del cliente");

        jLabel2.setFont(new java.awt.Font("Abyssinica SIL", 0, 20)); // NOI18N
        jLabel2.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Abyssinica SIL", 0, 20)); // NOI18N
        jLabel3.setText("Apellidos:");

        datosApellidos.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N

        datosNombres.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N

        tbeMedicamentos.setFont(new java.awt.Font("Abyssinica SIL", 0, 15)); // NOI18N
        tbeMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbeMedicamentos);

        btnRegistrar.setFont(new java.awt.Font("Carlito", 1, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciacrud/Resources/guardar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrar.setIconTextGap(10);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Abyssinica SIL", 0, 20)); // NOI18N
        jLabel4.setText("DNI:");

        datosDNI.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        datosDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosDNIActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Abyssinica SIL", 0, 20)); // NOI18N
        jLabel5.setText("Busqueda:");

        datosBusqueda.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        datosBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosBusquedaActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Carlito", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciacrud/Resources/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.setIconTextGap(10);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnBuscarKeyReleased(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Carlito", 1, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciacrud/Resources/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizar.setIconTextGap(10);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        jLabel6.setText("Seleccione la fila para agregar el producto.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(datosBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(datosDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(datosApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(datosNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(43, 43, 43)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jLabel6))))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(datosNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(13, 13, 13)
                            .addComponent(datosApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnRegistrar)
                            .addGap(16, 16, 16))))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datosDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(datosBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(3, 3, 3)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        try {
            mostar("medicamentos");
        } catch (Exception ex) {
            System.out.println("¡Error! No se pudo actualizar: " + ex.toString());
        }
        datosBusqueda.setText("");
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyReleased

    }//GEN-LAST:event_btnBuscarKeyReleased

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        if (datosBusqueda.getText().equals("")) {
            Icon wrong = new ImageIcon(getClass().getResource("wrong.png"));
            JOptionPane.showMessageDialog(null, "Llene el campo de busqueda", "Invalido", JOptionPane.WARNING_MESSAGE, wrong);
        } else {
            try {

                buscarMedicamentos(datosBusqueda.getText());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ventanaPanelDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        DaoClientImpl cliente_dao = new DaoClientImpl();
        Cliente cliente = new Cliente();

        try {

            //cliente.setId(1);
            cliente.setNombre(datosNombres.getText());
            
            cliente.setApellidos(datosApellidos.getText());
            
            cliente.setDni(Integer.parseInt(datosDNI.getText()));
            
            cliente.setBusqueda(datosBusqueda.getText());

            // Validamos los cambios
            if (cliente.getNombre().equals("") | cliente.getApellidos().equals("") | cliente.getDni() < 0 | cliente.getBusqueda().equals("")) {
                
                Icon wrong = new ImageIcon(getClass().getResource("wrong.png"));
                JOptionPane.showMessageDialog(null, "Debe llenar los datos", "Invalido", JOptionPane.WARNING_MESSAGE, wrong);
                
            } else {
                
                Icon check = new ImageIcon(getClass().getResource("check.png"));
                
                JOptionPane.showMessageDialog(null, "Guardado con exito", "Valido", JOptionPane.WARNING_MESSAGE, check);
                
                int fila = tbeMedicamentos.getSelectedRow();
                
                String idenC = tbeMedicamentos.getValueAt(fila, 1).toString();
                
                cliente_dao.registrar(cliente, idenC);
                
                datosNombres.setText("");
                
                datosApellidos.setText("");
                
                datosDNI.setText("");
                
                datosBusqueda.setText("");
                
                // Se decrementa el stock
                
                DaoClientImpl dao_client = new DaoClientImpl();
                
               int filaC = tbeMedicamentos.getSelectedRow();
               
               String nombreColumna = tbeMedicamentos.getValueAt(filaC, 0).toString();
               
                System.out.println("go: " + nombreColumna);
                
                
                //dao_client.actualizar(nombreFilaColumna, datoColumna);
                
            }
        } catch (Exception e) {
            Icon wrong = new ImageIcon(getClass().getResource("wrong.png"));
            JOptionPane.showMessageDialog(null, "Falta rellenar campos", "Invalido", JOptionPane.WARNING_MESSAGE, wrong);
        }

    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void datosBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datosBusquedaActionPerformed

    private void datosDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datosDNIActionPerformed
   
    private void buscarMedicamentos(String medi) throws ClassNotFoundException {
        
        String sql = "SELECT * FROM medicamentos WHERE Nombre like '%" + medi + "%'";

        ResultSet rs;

        PreparedStatement pst;

        DefaultTableModel mode = new DefaultTableModel();

        mode.addColumn("Nombre");

        mode.addColumn("Precio");

        mode.addColumn("Stock");

        tbeMedicamentos.setModel(mode);

        String[] dato = new String[3];

        try {
            Connection con = ConexionBD.getInstance().conectar();

            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {

                dato[0] = rs.getString("Nombre");

                dato[1] = rs.getString("Precio");

                dato[2] = rs.getString("Stock");

                mode.addRow(dato);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        }

    }

    // Agregamos el PopMenu en la cual le ponemos una imagen que al momento de seleccionar nos guarde los datos
    public void popMenu() {
        JMenuItem eliminar = new JMenuItem("Seleccionar", icono("/farmaciacrud/Resources/selecc.png", 25, 25));
        
         eliminar.addActionListener((ActionEvent e) -> {
             
             int fila = tbeMedicamentos.getSelectedRow();
             
             String identidad = tbeMedicamentos.getValueAt(fila, 2).toString();
             
             System.out.println(identidad);
             
        });
        
        popMenuCliente.add(eliminar);

        tbeMedicamentos.setComponentPopupMenu(popMenuCliente);

    }

    public Icon icono(String ruta, int width, int heigh) {

        Icon eliminar = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(width, heigh, 0));

        return eliminar;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField datosApellidos;
    private javax.swing.JTextField datosBusqueda;
    private javax.swing.JTextField datosDNI;
    private javax.swing.JTextField datosNombres;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPopupMenu popMenuCliente;
    private javax.swing.JTable tbeMedicamentos;
    // End of variables declaration//GEN-END:variables
}
