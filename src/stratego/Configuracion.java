package stratego;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
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

        activarmodotutorial1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        activarmodotutorial = new javax.swing.JButton();
        activarmodoclasico = new javax.swing.JButton();
        btnRegresarAMenuPrincipal = new javax.swing.JButton();
        btnvideo = new javax.swing.JButton();

        activarmodotutorial1.setBackground(new java.awt.Color(51, 51, 255));
        activarmodotutorial1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        activarmodotutorial1.setForeground(new java.awt.Color(0, 0, 0));
        activarmodotutorial1.setText("MODO TUTORIAL");
        activarmodotutorial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarmodotutorial1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Configuracion");

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

        btnvideo.setBackground(new java.awt.Color(51, 51, 255));
        btnvideo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnvideo.setForeground(new java.awt.Color(0, 0, 0));
        btnvideo.setText("VIDEO");
        btnvideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvideoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnRegresarAMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(activarmodoclasico, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(activarmodotutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnvideo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activarmodotutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvideo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(activarmodoclasico, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnRegresarAMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void activarmodotutorial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarmodotutorial1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activarmodotutorial1ActionPerformed

    private void btnvideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvideoActionPerformed
        try {
        String videoPath = "videoTutorial/tutorial.MOV";
        File videoFile = new File(videoPath);
        
        if (videoFile.exists()) {
            Desktop.getDesktop().open(videoFile);
        } else {
            JOptionPane.showMessageDialog(null, "El archivo de video no existe: " + videoPath);
        }
    } catch (IOException ex) {
        ex.printStackTrace();
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvideoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activarmodoclasico;
    private javax.swing.JButton activarmodotutorial;
    private javax.swing.JButton activarmodotutorial1;
    private javax.swing.JButton btnRegresarAMenuPrincipal;
    private javax.swing.JButton btnvideo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
