package stratego;

import javax.swing.JOptionPane;

public class Configuracion extends javax.swing.JFrame {

    Login login;
    ControladorLogin controladorlogin;
    
    public Configuracion(Login login, ControladorLogin controladorlogin) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Configuracion");
        this.login=login;
        this.controladorlogin=controladorlogin;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        activarmodotutorial = new javax.swing.JButton();
        activarmodoclasico = new javax.swing.JButton();
        btnRegresarAMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Configuracion");

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setText("Volver al menu principal");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        activarmodotutorial.setBackground(new java.awt.Color(51, 51, 255));
        activarmodotutorial.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        activarmodotutorial.setForeground(new java.awt.Color(0, 0, 0));
        activarmodotutorial.setText("MODO TUTORIAL");
        activarmodotutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarmodotutorialActionPerformed(evt);
            }
        });

        activarmodoclasico.setBackground(new java.awt.Color(51, 51, 255));
        activarmodoclasico.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        activarmodoclasico.setForeground(new java.awt.Color(0, 0, 0));
        activarmodoclasico.setText("MODO CLASICO");
        activarmodoclasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarmodoclasicoActionPerformed(evt);
            }
        });

        btnRegresarAMenuPrincipal.setBackground(new java.awt.Color(255, 51, 51));
        btnRegresarAMenuPrincipal.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnRegresarAMenuPrincipal.setText("REGRESAR AL MENU PRINCIPAL");
        btnRegresarAMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarAMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(activarmodoclasico, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(activarmodotutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnRegresarAMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(activarmodotutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(activarmodoclasico, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnRegresarAMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MenuPrincipal menuprincipal=new MenuPrincipal(login, controladorlogin);
        menuprincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnRegresarAMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarAMenuPrincipalActionPerformed
        MenuPrincipal menuprincipal=new MenuPrincipal(login, controladorlogin);
        menuprincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarAMenuPrincipalActionPerformed

    private void activarmodotutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarmodotutorialActionPerformed
        controladorlogin.modoTutorial=true;
        JOptionPane.showMessageDialog(null, "Modo tutorial activado. Ahora puedes ver las fichas de tu enemigo en todo momento.");
    }//GEN-LAST:event_activarmodotutorialActionPerformed

    private void activarmodoclasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarmodoclasicoActionPerformed
        controladorlogin.modoTutorial=false;
        JOptionPane.showMessageDialog(null, "Modo clasico activado. Las fichas del oponente ahora estaran ocultas.");
    }//GEN-LAST:event_activarmodoclasicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activarmodoclasico;
    private javax.swing.JButton activarmodotutorial;
    private javax.swing.JButton btnRegresarAMenuPrincipal;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
