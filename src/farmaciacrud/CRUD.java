package farmaciacrud;

import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import farmaciacrud.DAO.DaoLoginImpl;
import farmaciacrud.Metodos.Login;
import farmaciacrud.Ventanas.ventanaPrincipal;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CRUD extends javax.swing.JFrame {

    public CRUD() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        pass_Inicio = new javax.swing.JLabel();
        usuario_Inicio = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        datos_Usuario = new javax.swing.JTextField();
        datos_Pass = new javax.swing.JPasswordField();
        img_Inicio = new javax.swing.JLabel();
        titutloInicio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        pass_Inicio.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        pass_Inicio.setForeground(new java.awt.Color(0, 0, 0));
        pass_Inicio.setText("Contraseña");

        usuario_Inicio.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        usuario_Inicio.setForeground(new java.awt.Color(0, 0, 0));
        usuario_Inicio.setText("Usuario");

        btnIniciar.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
        });

        datos_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        datos_Usuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        datos_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        datos_Usuario.setText("Nombre de usuario");
        datos_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                datos_UsuarioMousePressed(evt);
            }
        });

        datos_Pass.setBackground(new java.awt.Color(255, 255, 255));
        datos_Pass.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        datos_Pass.setForeground(new java.awt.Color(204, 204, 204));
        datos_Pass.setText("************");
        datos_Pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                datos_PassMousePressed(evt);
            }
        });

        img_Inicio.setForeground(new java.awt.Color(0, 0, 0));
        img_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciacrud/Resources/img-iniciov2-replica.png"))); // NOI18N
        img_Inicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        titutloInicio.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        titutloInicio.setForeground(new java.awt.Color(0, 0, 0));
        titutloInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titutloInicio.setText("Inicio Session");
        titutloInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciacrud/Resources/logo-repliica.png"))); // NOI18N

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIniciar)
                        .addGap(119, 119, 119))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass_Inicio)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(usuario_Inicio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(datos_Usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                .addComponent(datos_Pass, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(titutloInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titutloInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuario_Inicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datos_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pass_Inicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datos_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnIniciar)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(img_Inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
        DaoLoginImpl login_dao = new DaoLoginImpl();
        Login login = new Login();

        try {
            String contra = String.valueOf(datos_Pass.getText());
            login.setUser(datos_Usuario.getText());
            login.setPass(contra);
            if (login.getUser().equals("") && login.getPass().equals("")) {
                Icon wrong = new ImageIcon(getClass().getResource("wrong.png"));
                JOptionPane.showMessageDialog(null, "Llene los campos", "Error", JOptionPane.WARNING_MESSAGE, wrong);

            } else {
                login_dao.validar(login);
                validadInicio();

            }

        } catch (Exception e) {
            Icon wrong = new ImageIcon(getClass().getResource("wrong.png"));
            JOptionPane.showMessageDialog(null, "Llene los campos", "Error", JOptionPane.WARNING_MESSAGE, wrong);
        }


    }//GEN-LAST:event_btnIniciarMouseClicked

    private void datos_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datos_UsuarioMousePressed
        if (datos_Usuario.getText().equals("Nombre de usuario")) {
            datos_Usuario.setText("");
            datos_Usuario.setForeground(Color.BLACK);
        }
        if (String.valueOf(datos_Pass.getPassword()).isEmpty()) {
            datos_Pass.setText("************");
            datos_Pass.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_datos_UsuarioMousePressed

    private void datos_PassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datos_PassMousePressed
        if (String.valueOf(datos_Pass.getPassword()).equals("************")) {
            datos_Pass.setText("");
            datos_Pass.setForeground(Color.BLACK);
        }
        if (datos_Usuario.getText().isEmpty()) {
            datos_Usuario.setText("Nombre de usuario");
            datos_Usuario.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_datos_PassMousePressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatCyanLightIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CRUD().setVisible(true);
        });
    }

    // Metodos
    public void validadInicio() {
        // Muestra de icono en Joption
        Icon usuarioLogin = new ImageIcon(getClass().getResource("usuarioLogin.png"));
        JOptionPane.showMessageDialog(null, "Usuario iniciado con exito", "Sesion Valida", JOptionPane.WARNING_MESSAGE, usuarioLogin);

        ventanaPrincipal principal = new ventanaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JPasswordField datos_Pass;
    private javax.swing.JTextField datos_Usuario;
    private javax.swing.JLabel img_Inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel pass_Inicio;
    private javax.swing.JLabel titutloInicio;
    private javax.swing.JLabel usuario_Inicio;
    // End of variables declaration//GEN-END:variables
}
