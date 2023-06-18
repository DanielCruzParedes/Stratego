package stratego;

import javax.swing.JOptionPane;

public class PedirSegundoPlayer extends javax.swing.JFrame {
    public String bandoElegido;
    ControladorLogin controladorlogin;
    Login login;
MenuPrincipal menuprincipal;
FichasTableroHeroes controladortablero;
MovimientosDeFichas movimientos;
   
public String segundoPlayer;
    public PedirSegundoPlayer(ControladorLogin controladorlogin, Login login, MovimientosDeFichas movimientos) {
        initComponents();
        setLocationRelativeTo(this);
        this.controladorlogin=controladorlogin;
        this.login=login;
        lblUsuarioLogeado.setText(controladorlogin.UsuarioLogeado);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuarioLogeado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSegundoPlayer = new javax.swing.JTextField();
        btnJuego = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        Cb_bandos = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Player 1:");

        lblUsuarioLogeado.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("Player 2:");

        txtSegundoPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoPlayerActionPerformed(evt);
            }
        });

        btnJuego.setBackground(new java.awt.Color(0, 102, 153));
        btnJuego.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnJuego.setText("CONFIRMAR");
        btnJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegoActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 102, 153));
        btnExit.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        Cb_bandos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HEROES", "VILLANOS" }));
        Cb_bandos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_bandosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUsuarioLogeado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSegundoPlayer)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnJuego)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(Cb_bandos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUsuarioLogeado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSegundoPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(Cb_bandos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJuego)
                    .addComponent(btnExit))
                .addGap(45, 45, 45))
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

    private void txtSegundoPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoPlayerActionPerformed
      
    }//GEN-LAST:event_txtSegundoPlayerActionPerformed

    private void btnJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegoActionPerformed
        
        String segundoplayer = txtSegundoPlayer.getText();
        Usuario user = controladorlogin.buscarUsuario(segundoplayer);
        if(txtSegundoPlayer.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos.");
        }else{
        if(user!= null){
            if(segundoplayer.equals(String.valueOf(this.controladorlogin.UsuarioLogeado))){
                JOptionPane.showMessageDialog(null, "El segundo player no puede ser el mismo que el primer player.");
            }else{
            if(user.getUser().equals(segundoplayer)){
                this.segundoPlayer=segundoplayer;
                if(this.bandoElegido==null){
                    JOptionPane.showMessageDialog(null, "Elija el bando con el que desea jugar.");
                }else{
            Tablero tablero = new Tablero(this, controladorlogin, login);
            this.bandoElegido=Cb_bandos.getSelectedItem().toString();
            if(this.bandoElegido.equals("HEROES")){
                controladorlogin.partidasJugadasComoHeroes++;
            }else{
                controladorlogin.partidasJugadasComoVillanos++;
            }
            tablero.setVisible(true);
            this.dispose();
                    
                }
                
            }
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "El username del segundo player no existe.");
        }
            
        }
    }//GEN-LAST:event_btnJuegoActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        menuprincipal= new MenuPrincipal(login,controladorlogin);
        menuprincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void Cb_bandosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_bandosActionPerformed
        bandoElegido = Cb_bandos.getSelectedItem().toString();
    }//GEN-LAST:event_Cb_bandosActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cb_bandos;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnJuego;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblUsuarioLogeado;
    private javax.swing.JTextField txtSegundoPlayer;
    // End of variables declaration//GEN-END:variables
}
