/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stratego;

public class Batallas extends javax.swing.JFrame {
ControladorLogin controladorlogin;
Login login;
    public Batallas(Login login, ControladorLogin controladorlogin) {
        initComponents();
        setLocationRelativeTo(null);
        this.login=login;
        this.controladorlogin=controladorlogin;
        
        lblusuariosactivos.setText(String.valueOf(controladorlogin.totalUsuariosActivos));
        lblcantidadusuarioshistoricos.setText(String.valueOf(controladorlogin.totalUsuariosHistoricos));
        lblcantidadpartidasjugadas.setText(String.valueOf(controladorlogin.partidasJugadasComoHeroes+controladorlogin.vecesQueGanaronVillanos));
        lblvecesqueganaronheroes.setText(String.valueOf(controladorlogin.vecesQueGanaronHeroes));
        lblvecesqueganaronvillanos.setText(String.valueOf(controladorlogin.vecesQueGanaronVillanos));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnregresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblusuariosactivos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblcantidadusuarioshistoricos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblcantidadpartidasjugadas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblvecesqueganaronheroes = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblvecesqueganaronvillanos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregresar.setBackground(new java.awt.Color(51, 51, 255));
        btnregresar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnregresar.setText("VOLVER AL MENU PRINCIPAL");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 82));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad de usuarios activos:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 53, -1, -1));

        lblusuariosactivos.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblusuariosactivos.setForeground(new java.awt.Color(255, 255, 255));
        lblusuariosactivos.setText("a");
        jPanel1.add(lblusuariosactivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 50, 45));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad de usuarios historicos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 104, -1, -1));

        lblcantidadusuarioshistoricos.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblcantidadusuarioshistoricos.setForeground(new java.awt.Color(255, 255, 255));
        lblcantidadusuarioshistoricos.setText("a");
        jPanel1.add(lblcantidadusuarioshistoricos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 47, 45));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad de partidas jugadas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 155, -1, -1));

        lblcantidadpartidasjugadas.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblcantidadpartidasjugadas.setForeground(new java.awt.Color(255, 255, 255));
        lblcantidadpartidasjugadas.setText("a");
        jPanel1.add(lblcantidadpartidasjugadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 47, 45));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Veces que ganaron los heroes: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 206, -1, -1));

        lblvecesqueganaronheroes.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblvecesqueganaronheroes.setForeground(new java.awt.Color(255, 255, 255));
        lblvecesqueganaronheroes.setText("a");
        jPanel1.add(lblvecesqueganaronheroes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 47, 45));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Veces que ganaron los villanos: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 247, -1, -1));

        lblvecesqueganaronvillanos.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblvecesqueganaronvillanos.setForeground(new java.awt.Color(255, 255, 255));
        lblvecesqueganaronvillanos.setText("a");
        jPanel1.add(lblvecesqueganaronvillanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 47, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        MenuPrincipal menuprincipal = new MenuPrincipal(login, controladorlogin);
        menuprincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcantidadpartidasjugadas;
    private javax.swing.JLabel lblcantidadusuarioshistoricos;
    private javax.swing.JLabel lblusuariosactivos;
    private javax.swing.JLabel lblvecesqueganaronheroes;
    private javax.swing.JLabel lblvecesqueganaronvillanos;
    // End of variables declaration//GEN-END:variables
}
