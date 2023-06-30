package farmaciacrud.Ventanas;

import farmaciacrud.DAO.DaoOperadoresImpl;
import farmaciacrud.MetodosTrabajos.Operadores;
import java.awt.HeadlessException;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ventanaPanelHorario extends javax.swing.JPanel {

    private final Icon check = new ImageIcon(getClass().getResource("check.png"));

    private final Icon wrong = new ImageIcon(getClass().getResource("wrong.png"));

    private void mostrarDatos() {

        String[] tituloColumna = {"Nombre", "Hora"};

        DefaultTableModel model = new DefaultTableModel(tituloColumna, 0);

        DaoOperadoresImpl dao = new DaoOperadoresImpl();

        List<Operadores> datosOperadores;

        Object[] columna = new Object[2];

        datosOperadores = dao.seleccionar();

        for (Operadores fila : datosOperadores) {

            columna[0] = fila.getNombreOperadores();

            columna[1] = fila.getHora();

            model.addRow(columna);
        }

        tbeHorarios.setEnabled(true);

        this.tbeHorarios.setModel(model);
    }

    public ventanaPanelHorario() throws ClassNotFoundException {

        initComponents();

        mostrarDatos();
        
        centradoColumna();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datosNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbeHorarios = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setText("Control de asistencia");

        jLabel2.setFont(new java.awt.Font("Abyssinica SIL", 0, 20)); // NOI18N
        jLabel2.setText("Nombre:");

        datosNombre.setFont(new java.awt.Font("Abyssinica SIL", 0, 16)); // NOI18N

        tbeHorarios.setFont(new java.awt.Font("Abyssinica SIL", 0, 15)); // NOI18N
        tbeHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbeHorarios);

        btnActualizar.setFont(new java.awt.Font("Carlito", 1, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciacrud/Resources/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Carlito", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciacrud/Resources/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuardar.setInheritsPopupMenu(true);
        btnGuardar.setPreferredSize(new java.awt.Dimension(111, 30));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciacrud/Resources/hora.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciacrud/Resources/hora.png"))); // NOI18N

        btnEliminar.setFont(new java.awt.Font("Carlito", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciacrud/Resources/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(109, 30));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(datosNombre)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnActualizar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar)
                    .addComponent(jLabel2)
                    .addComponent(datosNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void centradoColumna(){
        // Centramos las columnas requeridas
        
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();

        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        
        tbeHorarios.getColumnModel().getColumn(1).setCellRenderer(tcr);
        
    }
    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked

        // Agregamos y validamos los campos, si estan vacios o si ponen datos
        DaoOperadoresImpl operadores_dao = new DaoOperadoresImpl();

        Operadores operadores = new Operadores();

        //DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        //String date = dateFormat.format(Calendar.getInstance().getTime());
        DateFormat dateFormat = new SimpleDateFormat("HH:mm aa");

        String date = dateFormat.format(new Date());

        try {

            operadores.setNombreOperadores(datosNombre.getText().trim());

            operadores.setHora(date);

            if (operadores.getNombreOperadores().equals("")) {

                JOptionPane.showMessageDialog(null, "Rellene el campo", "invalido", JOptionPane.WARNING_MESSAGE, wrong);

                datosNombre.setText("");

            } else {

                operadores_dao.registrarOperadores(operadores);

                //mostrarDatos();
                JOptionPane.showMessageDialog(null, "Guardado con exito", "Valido", JOptionPane.WARNING_MESSAGE, check);

                datosNombre.setText("");

            }
        } catch (HeadlessException e) {

            JOptionPane.showMessageDialog(null, "Falta rellenar campos", "Invalido", JOptionPane.WARNING_MESSAGE, wrong);
        }

    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked

        mostrarDatos();

        datosNombre.setText("");

    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked

        DaoOperadoresImpl dao = new DaoOperadoresImpl();

        try {

            int fila = tbeHorarios.getSelectedRow();

            String selecion = tbeHorarios.getValueAt(
                    fila, 0).toString();

            if (dao.eliminar(selecion)) {

                JOptionPane.showMessageDialog(null, "Selección eliminada", "¡Valido!", JOptionPane.WARNING_MESSAGE, check);

            } else {

                JOptionPane.showMessageDialog(null, "No se pudo eliminar", "¡Error!", JOptionPane.WARNING_MESSAGE, wrong);

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Debe selecionar una fila a eliminar", "¡Error!", JOptionPane.WARNING_MESSAGE, wrong);

        }


    }//GEN-LAST:event_btnEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField datosNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbeHorarios;
    // End of variables declaration//GEN-END:variables
}
