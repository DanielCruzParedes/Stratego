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
        jLabel2 = new javax.swing.JLabel();

        activarmodotutorial1.setBackground(new java.awt.Color(51, 51, 255));
        activarmodotutorial1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        activarmodotutorial1.setText("MODO TUTORIAL");
        activarmodotutorial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarmodotutorial1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Configuracion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        activarmodotutorial.setBackground(new java.awt.Color(0, 0, 102));
        activarmodotutorial.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        activarmodotutorial.setForeground(new java.awt.Color(255, 255, 255));
        activarmodotutorial.setText("MODO TUTORIAL");
        activarmodotutorial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        activarmodotutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarmodotutorialActionPerformed(evt);
            }
        });
        jPanel1.add(activarmodotutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 420, 90));

        activarmodoclasico.setBackground(new java.awt.Color(0, 0, 102));
        activarmodoclasico.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        activarmodoclasico.setForeground(new java.awt.Color(255, 255, 255));
        activarmodoclasico.setText("MODO CLASICO");
        activarmodoclasico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        activarmodoclasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarmodoclasicoActionPerformed(evt);
            }
        });
        jPanel1.add(activarmodoclasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 420, 90));

        btnRegresarAMenuPrincipal.setBackground(new java.awt.Color(255, 51, 51));
        btnRegresarAMenuPrincipal.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnRegresarAMenuPrincipal.setText("REGRESAR AL MENU PRINCIPAL");
        btnRegresarAMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarAMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresarAMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 344, 63));

        btnvideo.setBackground(new java.awt.Color(0, 0, 102));
        btnvideo.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        btnvideo.setForeground(new java.awt.Color(255, 255, 255));
        btnvideo.setText("VIDEO");
        btnvideo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnvideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvideoActionPerformed(evt);
            }
        });
        jPanel1.add(btnvideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 118, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/T/config.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 470));

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
        String videoPath = "src/videoTutorial/tutorial.MOV";
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
