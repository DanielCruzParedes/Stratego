package stratego;

public class UniversoMarvel extends javax.swing.JFrame {
    
    ControladorLogin controladorlogin;
    Login login;
    public UniversoMarvel(ControladorLogin controladorlogin, Login login) {
        initComponents();
        setLocationRelativeTo(null);
        this.controladorlogin=controladorlogin;
        this.login=login;
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
        btnranking = new javax.swing.JButton();
        btnbatallas = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        btnranking.setBackground(new java.awt.Color(51, 51, 255));
        btnranking.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnranking.setForeground(new java.awt.Color(0, 0, 0));
        btnranking.setText("RANKING");
        btnranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrankingActionPerformed(evt);
            }
        });

        btnbatallas.setBackground(new java.awt.Color(51, 51, 255));
        btnbatallas.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnbatallas.setForeground(new java.awt.Color(0, 0, 0));
        btnbatallas.setText("BATALLAS");
        btnbatallas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatallasActionPerformed(evt);
            }
        });

        btnregresar.setBackground(new java.awt.Color(51, 51, 255));
        btnregresar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnregresar.setForeground(new java.awt.Color(0, 0, 0));
        btnregresar.setText("REGRESAR AL MENU PRINCIPAL");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnbatallas, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(btnranking, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnranking, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbatallas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrankingActionPerformed
        Ranking ranking = new Ranking(login, controladorlogin);
        ranking.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnrankingActionPerformed

    private void btnbatallasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatallasActionPerformed
        Batallas batallas = new Batallas(login, controladorlogin);
        batallas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbatallasActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        MenuPrincipal menuprincipal = new MenuPrincipal(login, controladorlogin);
        menuprincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatallas;
    private javax.swing.JButton btnranking;
    private javax.swing.JButton btnregresar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
