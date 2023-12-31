package stratego;

import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    Usuario usuario;
    Login login;
    ControladorLogin controladorlogin;

    public MenuPrincipal(Login login, ControladorLogin controladorlogin) {
        
        initComponents();
        setLocationRelativeTo(this);
    
        this.login=login;
        this.controladorlogin=controladorlogin;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnStrategoMarvelHeroes = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnMiPerfil = new javax.swing.JButton();
        btncerrarsesion = new javax.swing.JButton();
        btnUniversoMarvel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStrategoMarvelHeroes.setBackground(new java.awt.Color(255, 0, 51));
        btnStrategoMarvelHeroes.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnStrategoMarvelHeroes.setText("STRATEGO - MARVEL HEROES");
        btnStrategoMarvelHeroes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStrategoMarvelHeroesActionPerformed(evt);
            }
        });
        jPanel1.add(btnStrategoMarvelHeroes, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 66, -1, 60));

        btnConfiguracion.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnConfiguracion.setText("CONFIGURACION");
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 144, -1, 60));

        btnMiPerfil.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnMiPerfil.setText("MI PERFIL");
        btnMiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(btnMiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 216, -1, 60));

        btncerrarsesion.setBackground(new java.awt.Color(102, 102, 102));
        btncerrarsesion.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btncerrarsesion.setText("CERRAR SESION");
        btncerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarsesionActionPerformed(evt);
            }
        });
        jPanel1.add(btncerrarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 372, -1, 60));

        btnUniversoMarvel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnUniversoMarvel.setText("UNIVERSO MARVEL");
        btnUniversoMarvel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniversoMarvelActionPerformed(evt);
            }
        });
        jPanel1.add(btnUniversoMarvel, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 294, -1, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/T/menuprin.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 500));

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

    private void btnStrategoMarvelHeroesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStrategoMarvelHeroesActionPerformed
        StrategoMarvel strategomarvel = new StrategoMarvel(login, controladorlogin);
        strategomarvel.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btnStrategoMarvelHeroesActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        Configuracion configuracion = new Configuracion(login, controladorlogin);
        configuracion.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiPerfilActionPerformed
        MiPerfil miperfil = new MiPerfil(login, controladorlogin);
        miperfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMiPerfilActionPerformed

    private void btncerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarsesionActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea cerrar sesion?", "", JOptionPane.YES_NO_OPTION);
        if (respuesta == 0) {
        login.setVisible(true);
        this.dispose();
            
        }
    }//GEN-LAST:event_btncerrarsesionActionPerformed

    private void btnUniversoMarvelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUniversoMarvelActionPerformed
        UniversoMarvel universomarvel = new UniversoMarvel(controladorlogin, login);
        universomarvel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUniversoMarvelActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnMiPerfil;
    private javax.swing.JButton btnStrategoMarvelHeroes;
    private javax.swing.JButton btnUniversoMarvel;
    private javax.swing.JButton btncerrarsesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
