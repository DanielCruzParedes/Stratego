package stratego;

import javax.swing.JOptionPane;
//PRUEBA A VER SI ESTO SE ELIMINA
public class Login extends javax.swing.JFrame {

    ControladorLogin controladorlogin;
    Login login;
    Configuracion configuracion;
    MiPerfil miperfil;
    Ranking universomarvel;
    
    public Login() {
        initComponents();
        setLocationRelativeTo(this);
        this.controladorlogin = new ControladorLogin();
        this.configuracion=new Configuracion(this, controladorlogin);
        MenuPrincipal menuprincipal = new MenuPrincipal(this, controladorlogin);
        
        
    }
    
    public ControladorLogin getControlador() {
        return controladorlogin;
    }
    
    @SuppressWarnings("unchecked")
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usuarioTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        crearCuentaButton = new javax.swing.JButton();
        contrasenaPasswordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setExtendedState(6);
        setPreferredSize(new java.awt.Dimension(814, 490));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 157, -1));

        usuarioTextField.setBackground(new java.awt.Color(0, 0, 0));
        usuarioTextField.setForeground(new java.awt.Color(204, 204, 204));
        usuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(usuarioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 214, 244, 40));

        loginButton.setBackground(new java.awt.Color(0, 102, 255));
        loginButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 140, 50));

        crearCuentaButton.setBackground(new java.awt.Color(0, 102, 255));
        crearCuentaButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        crearCuentaButton.setForeground(new java.awt.Color(255, 255, 255));
        crearCuentaButton.setText("Crear Player");
        crearCuentaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaButtonActionPerformed(evt);
            }
        });
        jPanel1.add(crearCuentaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 210, 50));

        contrasenaPasswordField.setBackground(new java.awt.Color(0, 0, 0));
        contrasenaPasswordField.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(contrasenaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 278, 244, 40));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/T/avengersLogin.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 760, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearCuentaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuentaButtonActionPerformed
        VentanaRegistrarse ventanaregistro = new VentanaRegistrarse(this, controladorlogin);
        ventanaregistro.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_crearCuentaButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String usuario = usuarioTextField.getText();
        String contrasena = new String(contrasenaPasswordField.getPassword());
        controladorlogin.modoTutorial=true;
        Usuario aux = controladorlogin.buscarUsuario(usuario);
        
        if(usuarioTextField.getText().isEmpty() || contrasenaPasswordField.getPassword().length<1){
            JOptionPane.showMessageDialog(null, "Ingrese usuario y contraseña.");
        }else{
        if (aux != null) {
            if (aux.getContrasena().equals(contrasena)) {
                this.controladorlogin.UsuarioLogeado=usuario;
                MenuPrincipal menuprincipal = new MenuPrincipal(this, controladorlogin);
                menuprincipal.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
        }
        }
        
        usuarioTextField.setText("");
        contrasenaPasswordField.setText("");
        

    }//GEN-LAST:event_loginButtonActionPerformed

    private void usuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrasenaPasswordField;
    private javax.swing.JButton crearCuentaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}
