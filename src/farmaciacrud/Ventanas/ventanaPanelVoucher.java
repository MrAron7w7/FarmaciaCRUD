package farmaciacrud.Ventanas;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import farmaciacrud.Conexion.ConexionBD;
import farmaciacrud.DAO.DaoVoucherImpl;
import farmaciacrud.MetodosTrabajos.Cliente;
import farmaciacrud.MetodosTrabajos.Operadores;
import farmaciacrud.MetodosTrabajos.Voucher;
import java.awt.HeadlessException;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ventanaPanelVoucher extends javax.swing.JPanel {

    // Imagenes predeterminadas en el sistema
    private final Icon check = new ImageIcon(getClass().getResource("check.png"));

    private final Icon wrong = new ImageIcon(getClass().getResource("wrong.png"));

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

            System.out.println("¡Error!" + e.toString());

        }

    }

    public ventanaPanelVoucher() throws ClassNotFoundException, SQLException {
        initComponents();

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
        jButton1 = new javax.swing.JButton();

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
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(102, 102, 255));
        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciacrud/Resources/pdf2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtDniVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(335, 335, 335)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDniVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarVoucher))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnActualizar)))))
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

            if (voucher_dao.buscar(voucher)) {

                JOptionPane.showMessageDialog(null, "Usuario encontrado", "Exito", JOptionPane.WARNING_MESSAGE, check);

                String[] tituloCOlumna = {"DNI", "Nombre", "Compra"};

                DefaultTableModel model = new DefaultTableModel(tituloCOlumna, 0);

                List<Cliente> datosClientes;

                Object[] columna = new Object[3];

                datosClientes = (List<Cliente>) voucher_dao.mostrar();

                for (Cliente fila : datosClientes) {

                    columna[0] = fila.getDni();

                    columna[1] = fila.getNombre();

                    columna[2] = fila.getBusqueda();

                    model.addRow(columna);

                }
                tbeVoucher.setEnabled(true);
                
                this.tbeVoucher.setModel(model);
                
                //buscarCliente(txtDniVoucher.getText());

            } else {

                JOptionPane.showMessageDialog(null, "Usuario no encontrado", "¡Error!", JOptionPane.WARNING_MESSAGE, wrong);

            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Llene el campo a buscar", "Error", JOptionPane.WARNING_MESSAGE, wrong);

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

        //Connection cn;
        PreparedStatement pst;

        ResultSet rs;

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

            JOptionPane.showMessageDialog(null, "Error" + e.toString());

        }

    }
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        DaoVoucherImpl dao = new DaoVoucherImpl();

        try {

            int fila = tbeVoucher.getSelectedRow();

            String identidad = tbeVoucher.getValueAt(fila, 0).toString();

            if (dao.eliminar(identidad)) {

                JOptionPane.showMessageDialog(null, "Fila eliminada con exito", "Valido", JOptionPane.WARNING_MESSAGE, check);

            } else {

                JOptionPane.showMessageDialog(null, "La fila no fue eliminada", "invalido", JOptionPane.WARNING_MESSAGE, wrong);

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Seleccione una fila a eliminar", "¡Error!", JOptionPane.WARNING_MESSAGE, wrong);
        }


    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        try {

            mostrar("clientes");

            txtDniVoucher.setText("");

        } catch (ClassNotFoundException e) {

            JOptionPane.showMessageDialog(null, "Error no se pudo actualizar los datos", "¡Error!", JOptionPane.WARNING_MESSAGE, wrong);
        }
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void txtDniVoucherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniVoucherKeyReleased

    }//GEN-LAST:event_txtDniVoucherKeyReleased

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {

            reporte();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se guardo el reporte", "¡Error!", JOptionPane.WARNING_MESSAGE, wrong);

        }
    }//GEN-LAST:event_jButton1MouseClicked

    public void reporte() throws ClassNotFoundException {

        Document documento = new Document();

        FileOutputStream archivo;

        File file;

        DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy");

        //Date date = new Date();
        String date = dateFormat.format(new Date());

        try {

            /*
            Creamos el encabezado del archivo PDF en la cual tendraslos datos
             */
            file = new File("src/farmaciacrud/ReporteDeDatosPDF/Reporte.pdf");

            archivo = new FileOutputStream(file);

            //String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, archivo);

            documento.open();

            Image img = Image.getInstance("src/farmaciacrud/Resources/logo.png");

            Paragraph fecha = new Paragraph();

            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK);

            fecha.add(Chunk.NEWLINE);

            fecha.add("Factura \n" + "Fecha: " + date + "\n\n");

            /*
            Encabezado del PDF
             */
            PdfPTable encabezado = new PdfPTable(4);

            encabezado.setWidthPercentage(100);

            encabezado.getDefaultCell().setBorder(2);

            float[] columnaEncabezado = new float[]{20f, 30f, 70f, 40f};

            encabezado.setWidths(columnaEncabezado);

            encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

            encabezado.addCell(img);

            String nombre = "Farmacia Virgen \nDe Guadalupe";

            String telefono = "938475643";

            String direccion = "Av Melchorita";

            encabezado.addCell("");

            encabezado.addCell("Nombre: " + nombre + "\nTefefono: " + telefono + "\nDirección: " + direccion);

            encabezado.addCell(fecha);

            documento.add(encabezado);

            // Creamos otra tabla para obtener los datos del cliente
            PdfPTable tablaClient = new PdfPTable(4);

            tablaClient.setWidthPercentage(100);

            tablaClient.getDefaultCell().setBorder(0);

            float[] columnClient = new float[]{25f, 25f, 25f, 25f};

            tablaClient.setWidths(columnClient);

            tablaClient.setHorizontalAlignment(Element.ALIGN_LEFT);

            // Agregamos los titulos en celdas
            PdfPCell cl1 = new PdfPCell(new Phrase("\nDNI", negrita));

            PdfPCell cl2 = new PdfPCell(new Phrase("\nNombre", negrita));

            PdfPCell cl3 = new PdfPCell(new Phrase("\nApellido", negrita));

            PdfPCell cl4 = new PdfPCell(new Phrase("\nCompra", negrita));

            cl1.setBorder(0);

            cl2.setBorder(0);

            cl3.setBorder(0);

            cl4.setBorder(0);

            // Agregamos la celda a la tabla
            tablaClient.addCell(cl1);

            tablaClient.addCell(cl2);

            tablaClient.addCell(cl3);

            tablaClient.addCell(cl4);

            // Agregamos los datos de la base de datos
            try {
                ConexionBD cn = ConexionBD.getInstance();

                int fila = tbeVoucher.getSelectedRow();

                String iden = tbeVoucher.getValueAt(fila, 0).toString();

                String sql = "SELECT * FROM clientes WHERE dni=" + iden;

                PreparedStatement pst = cn.conectar().prepareStatement(sql);

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    do {

                        tablaClient.addCell(rs.getString(4));

                        tablaClient.addCell(rs.getString(2));

                        tablaClient.addCell(rs.getString(3));

                        tablaClient.addCell(rs.getString(5));

                    } while (rs.next());

                    documento.add(tablaClient);

                }

            } catch (SQLException e) {

                System.out.println("error: " + e);

            }

            // Agregamos el total a pagar
            Paragraph total = new Paragraph();

            total.add("\nTotal a pagar: ");

            total.setAlignment(Element.ALIGN_RIGHT);

            documento.add(total);

            // Agregamos un mensaje al final de todo
            Paragraph mensaje = new Paragraph();

            mensaje.add("\n\n¡Gracias por su compra!\n"
                    + "\n"
                    + "Si necesita asistencia adicional, por favor comuníquese con nosotros al número de teléfono proporcionado.");

            mensaje.setAlignment(Element.ALIGN_CENTER);

            documento.add(mensaje);

            documento.close();

            archivo.close();

            JOptionPane.showMessageDialog(null, "Reporte exitoso");

        } catch (DocumentException | HeadlessException | IOException e) {
            System.out.println(e.toString());

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarVoucher;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbeVoucher;
    private javax.swing.JTextField txtDniVoucher;
    // End of variables declaration//GEN-END:variables
}
