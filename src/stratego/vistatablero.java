package stratego;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class vistatablero extends javax.swing.JFrame {
    FichasTableroHeroes fichastableroheroes = new FichasTableroHeroes(this);
    FichasTableroVillanos fichastablerovillanos = new FichasTableroVillanos(this);
    public int filaDeFichaSeleccionada;
    public int columnaDeFichaSeleccionada;
    public int filaDeFichaDestino;
    public int columnaDeFichaDestino;
    private int turno=1;
    MovimientosDeFichas movimientos;
    public vistatablero(MovimientosDeFichas movimientos) {
        initComponents();
        
        this.setResizable(false);
        this.setSize(1360, 830);
        this.setLocationRelativeTo(null);
        this.setTitle("Estratego");
        this.setExtendedState(MAXIMIZED_BOTH);
        BtDesac1.setEnabled(false);
        BtDesac2.setEnabled(false);
        BtDesac3.setEnabled(false);
        BtDesac4.setEnabled(false);
        BtDesac5.setEnabled(false);
        BtDesac6.setEnabled(false);
        BtDesac7.setEnabled(false);
        BtDesac8.setEnabled(false);
        this.movimientos=movimientos;
        fichastableroheroes.ponerFichas();
        fichastablerovillanos.ponerFichas();
        
    }
   
		
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton29 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BtDesac2 = new javax.swing.JButton();
        BtDesac3 = new javax.swing.JButton();
        BtDesac5 = new javax.swing.JButton();
        BtDesac6 = new javax.swing.JButton();
        BtDesac1 = new javax.swing.JButton();
        BtDesac4 = new javax.swing.JButton();
        BtDesac7 = new javax.swing.JButton();
        BtDesac8 = new javax.swing.JButton();
        c91 = new javax.swing.JButton();
        c92 = new javax.swing.JButton();
        c93 = new javax.swing.JButton();
        c94 = new javax.swing.JButton();
        c95 = new javax.swing.JButton();
        c96 = new javax.swing.JButton();
        c97 = new javax.swing.JButton();
        c98 = new javax.swing.JButton();
        c99 = new javax.swing.JButton();
        c100 = new javax.swing.JButton();
        c82 = new javax.swing.JButton();
        c83 = new javax.swing.JButton();
        c84 = new javax.swing.JButton();
        c85 = new javax.swing.JButton();
        c86 = new javax.swing.JButton();
        c87 = new javax.swing.JButton();
        c88 = new javax.swing.JButton();
        c89 = new javax.swing.JButton();
        c90 = new javax.swing.JButton();
        c81 = new javax.swing.JButton();
        c72 = new javax.swing.JButton();
        c73 = new javax.swing.JButton();
        c71 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        c61 = new javax.swing.JButton();
        c31 = new javax.swing.JButton();
        c21 = new javax.swing.JButton();
        c51 = new javax.swing.JButton();
        c41 = new javax.swing.JButton();
        c12 = new javax.swing.JButton();
        c13 = new javax.swing.JButton();
        c19 = new javax.swing.JButton();
        c20 = new javax.swing.JButton();
        c16 = new javax.swing.JButton();
        c17 = new javax.swing.JButton();
        c18 = new javax.swing.JButton();
        c14 = new javax.swing.JButton();
        c15 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        c22 = new javax.swing.JButton();
        c32 = new javax.swing.JButton();
        c62 = new javax.swing.JButton();
        c52 = new javax.swing.JButton();
        c42 = new javax.swing.JButton();
        c63 = new javax.swing.JButton();
        c11 = new javax.swing.JButton();
        c30 = new javax.swing.JButton();
        c10 = new javax.swing.JButton();
        c78 = new javax.swing.JButton();
        c69 = new javax.swing.JButton();
        c68 = new javax.swing.JButton();
        c28 = new javax.swing.JButton();
        c38 = new javax.swing.JButton();
        c8 = new javax.swing.JButton();
        c70 = new javax.swing.JButton();
        c9 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        c6 = new javax.swing.JButton();
        c7 = new javax.swing.JButton();
        c79 = new javax.swing.JButton();
        c80 = new javax.swing.JButton();
        c59 = new javax.swing.JButton();
        c60 = new javax.swing.JButton();
        c49 = new javax.swing.JButton();
        c50 = new javax.swing.JButton();
        c39 = new javax.swing.JButton();
        c40 = new javax.swing.JButton();
        c29 = new javax.swing.JButton();
        c74 = new javax.swing.JButton();
        c64 = new javax.swing.JButton();
        c77 = new javax.swing.JButton();
        c67 = new javax.swing.JButton();
        c37 = new javax.swing.JButton();
        c27 = new javax.swing.JButton();
        c33 = new javax.swing.JButton();
        c23 = new javax.swing.JButton();
        c34 = new javax.swing.JButton();
        c24 = new javax.swing.JButton();
        c75 = new javax.swing.JButton();
        c76 = new javax.swing.JButton();
        c65 = new javax.swing.JButton();
        c66 = new javax.swing.JButton();
        c55 = new javax.swing.JButton();
        c56 = new javax.swing.JButton();
        c45 = new javax.swing.JButton();
        c46 = new javax.swing.JButton();
        c35 = new javax.swing.JButton();
        c36 = new javax.swing.JButton();
        c25 = new javax.swing.JButton();
        c26 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LbTierra = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        jButton29.setText("jButton29");

        jButton52.setText("jButton52");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setFocusable(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtDesac2.setBackground(new java.awt.Color(255, 51, 51));
        BtDesac2.setText(" ");
        BtDesac2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtDesac2.setBorderPainted(false);
        jPanel1.add(BtDesac2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 250, 79, 63));

        BtDesac3.setBackground(new java.awt.Color(255, 51, 51));
        BtDesac3.setText(" ");
        BtDesac3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtDesac3.setBorderPainted(false);
        jPanel1.add(BtDesac3, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 250, 79, 63));

        BtDesac5.setBackground(new java.awt.Color(153, 153, 255));
        BtDesac5.setText(" ");
        BtDesac5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtDesac5.setBorderPainted(false);
        jPanel1.add(BtDesac5, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 250, 79, 63));

        BtDesac6.setBackground(new java.awt.Color(153, 153, 255));
        BtDesac6.setText(" ");
        BtDesac6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtDesac6.setBorderPainted(false);
        BtDesac6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDesac6ActionPerformed(evt);
            }
        });
        jPanel1.add(BtDesac6, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 250, 79, 63));

        BtDesac1.setBackground(new java.awt.Color(255, 51, 51));
        BtDesac1.setText(" ");
        BtDesac1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtDesac1.setBorderPainted(false);
        jPanel1.add(BtDesac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 313, 79, 63));

        BtDesac4.setBackground(new java.awt.Color(255, 51, 51));
        BtDesac4.setText(" ");
        BtDesac4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtDesac4.setBorderPainted(false);
        jPanel1.add(BtDesac4, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 313, 79, 63));

        BtDesac7.setBackground(new java.awt.Color(153, 153, 255));
        BtDesac7.setText(" ");
        BtDesac7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtDesac7.setBorderPainted(false);
        jPanel1.add(BtDesac7, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 313, 79, 63));

        BtDesac8.setBackground(new java.awt.Color(153, 153, 255));
        BtDesac8.setText(" ");
        BtDesac8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtDesac8.setBorderPainted(false);
        jPanel1.add(BtDesac8, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 313, 79, 63));

        c91.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c91.setName(""); // NOI18N
        c91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c91ActionPerformed(evt);
            }
        });
        jPanel1.add(c91, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 79, 63));

        c92.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c92.setName(""); // NOI18N
        jPanel1.add(c92, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 0, 79, 63));

        c93.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c93.setName(""); // NOI18N
        jPanel1.add(c93, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 0, 79, 63));

        c94.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c94.setName(""); // NOI18N
        jPanel1.add(c94, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 0, 79, 63));

        c95.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c95.setName(""); // NOI18N
        jPanel1.add(c95, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 0, 79, 63));

        c96.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c96.setName(""); // NOI18N
        jPanel1.add(c96, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 0, 79, 63));

        c97.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c97.setName(""); // NOI18N
        jPanel1.add(c97, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 0, 79, 63));

        c98.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c98.setName(""); // NOI18N
        jPanel1.add(c98, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 0, 79, 63));

        c99.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c99.setName(""); // NOI18N
        jPanel1.add(c99, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 0, 79, 63));

        c100.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c100.setName(""); // NOI18N
        jPanel1.add(c100, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 0, 79, 63));

        c82.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c82.setName(""); // NOI18N
        jPanel1.add(c82, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 63, 79, 63));

        c83.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c83.setName(""); // NOI18N
        jPanel1.add(c83, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 63, 79, 63));

        c84.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c84.setName(""); // NOI18N
        jPanel1.add(c84, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 63, 79, 63));

        c85.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c85.setName(""); // NOI18N
        jPanel1.add(c85, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 63, 79, 63));

        c86.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c86.setName(""); // NOI18N
        jPanel1.add(c86, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 63, 79, 63));

        c87.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c87.setName(""); // NOI18N
        jPanel1.add(c87, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 63, 79, 63));

        c88.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c88.setName(""); // NOI18N
        jPanel1.add(c88, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 63, 79, 63));

        c89.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c89.setName(""); // NOI18N
        jPanel1.add(c89, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 63, 79, 63));

        c90.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c90.setName(""); // NOI18N
        jPanel1.add(c90, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 63, 79, 63));

        c81.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c81.setName(""); // NOI18N
        jPanel1.add(c81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 79, 63));

        c72.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c72.setName(""); // NOI18N
        jPanel1.add(c72, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 126, 79, 63));

        c73.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c73.setName(""); // NOI18N
        jPanel1.add(c73, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 126, 79, 63));

        c71.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c71.setName(""); // NOI18N
        jPanel1.add(c71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 126, 79, 63));

        c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 567, 79, 63));

        c61.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 189, 79, 63));

        c31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 378, 79, 63));

        c21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 441, 79, 63));

        c51.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 252, 79, 63));

        c41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 308, 79, 70));

        c12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 504, 79, 63));

        c13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c13, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 504, 79, 63));

        c19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c19, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 504, 79, 63));

        c20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c20, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 504, 79, 63));

        c16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c16, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 504, 79, 63));

        c17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c17, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 504, 79, 63));

        c18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c18, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 504, 79, 63));

        c14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c14, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 504, 79, 63));

        c15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c15, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 504, 79, 63));

        c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 567, 79, 63));

        c22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c22, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 441, 79, 63));

        c32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c32, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 378, 79, 63));

        c62.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c62, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 189, 79, 63));

        c52.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c52, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 252, 79, 63));

        c42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c42, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 315, 79, 63));

        c63.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c63, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 189, 79, 63));

        c11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 504, 79, 63));

        c30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c30, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 441, 79, 63));

        c10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 567, 79, 63));

        c78.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c78, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 126, 79, 63));

        c69.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c69, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 189, 79, 63));

        c68.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c68, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 185, 79, 63));

        c28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c28, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 441, 79, 63));

        c38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c38, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 378, 79, 63));

        c8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 567, 79, 63));

        c70.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c70, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 189, 79, 63));

        c9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 567, 79, 63));

        c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 567, 79, 63));

        c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 567, 79, 63));

        c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 567, 79, 63));

        c6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 567, 79, 63));

        c7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 567, 79, 63));

        c79.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c79, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 126, 79, 63));

        c80.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c80, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 126, 79, 63));

        c59.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c59, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 252, 79, 63));

        c60.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c60, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 252, 79, 63));

        c49.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c49, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 315, 79, 63));

        c50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c50, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 315, 79, 63));

        c39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c39, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 378, 79, 63));

        c40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c40, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 378, 79, 63));

        c29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c29, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 441, 79, 63));

        c74.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c74, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 126, 79, 63));

        c64.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c64, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 189, 79, 63));

        c77.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c77, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 126, 79, 63));

        c67.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c67, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 189, 79, 63));

        c37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c37, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 378, 79, 63));

        c27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c27, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 441, 79, 63));

        c33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c33, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 378, 79, 63));

        c23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c23, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 441, 79, 63));

        c34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c34, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 378, 79, 63));

        c24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c24, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 441, 79, 63));

        c75.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c75, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 126, 79, 63));

        c76.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c76, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 126, 79, 63));

        c65.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c65, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 189, 79, 63));

        c66.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c66ActionPerformed(evt);
            }
        });
        jPanel1.add(c66, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 189, 79, 63));

        c55.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c55, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 252, 79, 63));

        c56.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c56ActionPerformed(evt);
            }
        });
        jPanel1.add(c56, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 252, 79, 63));

        c45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c45ActionPerformed(evt);
            }
        });
        jPanel1.add(c45, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 315, 79, 63));

        c46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c46, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 315, 79, 63));

        c35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c35ActionPerformed(evt);
            }
        });
        jPanel1.add(c35, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 378, 80, 63));

        c36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c36, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 378, 79, 63));

        c25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c25, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 441, 79, 63));

        c26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c26, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 441, 79, 63));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 790, 628));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/T/tablero.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -60, 1000, 960));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/4.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 560, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/2.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 560, -1, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/3.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 560, 60, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/5.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 620, 60, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/6.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 500, 60, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/7.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 500, 60, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/8.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 500, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/9.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 620, 60, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/10.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 620, 60, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/11.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 440, 60, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/12.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 440, 60, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/13.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 440, 60, 60));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/14.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 380, 60, 60));

        LbTierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/15.png"))); // NOI18N
        jPanel2.add(LbTierra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 500, 60, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/16.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 380, 60, 60));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/17.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 380, 60, 60));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/18.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 380, 60, 60));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/19.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 440, 60, 60));

        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/20.png"))); // NOI18N
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 80, 60, 60));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/21.png"))); // NOI18N
        jLabel22.setOpaque(true);
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 320, 60, 60));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/22.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 320, 60, 60));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/23.png"))); // NOI18N
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 320, 60, 60));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/24.jpg"))); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 320, 60, 60));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/25.png"))); // NOI18N
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 80, 60, 60));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/0.png"))); // NOI18N
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 200, 60, 60));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/38.png"))); // NOI18N
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 260, 60, 60));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/39.png"))); // NOI18N
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 260, 60, 60));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/26.png"))); // NOI18N
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 260, 60, 60));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/35.png"))); // NOI18N
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 260, 60, 60));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/37.png"))); // NOI18N
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 200, 60, 60));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/27.png"))); // NOI18N
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 80, 60, 60));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/28.png"))); // NOI18N
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 200, 60, 60));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/29.png"))); // NOI18N
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 200, 60, 60));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/30.png"))); // NOI18N
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 80, 60, 60));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/31.png"))); // NOI18N
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 140, 60, 60));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/32.png"))); // NOI18N
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 140, 60, 60));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/33.png"))); // NOI18N
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 140, 60, 60));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/34.png"))); // NOI18N
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 140, 60, 60));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/36.png"))); // NOI18N
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 620, 60, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Heroes/1.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 560, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/abominacionV.png"))); // NOI18N
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 60, 60));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/apocalipseV.png"))); // NOI18N
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 60, 60));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/blackcatV.png"))); // NOI18N
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 60, 60));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/bullsedeV.png"))); // NOI18N
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, 60, 60));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/carnage.png"))); // NOI18N
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 60, 60));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/deadpoolV.png"))); // NOI18N
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 60, 60));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/drDoomV.png"))); // NOI18N
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 60, 60));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/duendeV.png"))); // NOI18N
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 60, 60));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/earthV.png"))); // NOI18N
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 60, 60));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/electro.png"))); // NOI18N
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 60, 60));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/galactusV.png"))); // NOI18N
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 60, 60));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/juggerV.png"))); // NOI18N
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 60, 60));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/kingpinV.png"))); // NOI18N
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 60, 60));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/leader.png"))); // NOI18N
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 60, 60));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/lizardV.png"))); // NOI18N
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 60, 60));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/magnetoV.png"))); // NOI18N
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 60, 60));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/moleV.png"))); // NOI18N
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 60, 60));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/mysterioV.png"))); // NOI18N
        jPanel2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 60, 60));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/mystiqueV.png"))); // NOI18N
        jPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 60, 60));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/octopusV.png"))); // NOI18N
        jPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 60, 60));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/omegaV.png"))); // NOI18N
        jPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 60));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/ongslaughtV.png"))); // NOI18N
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 60, 60));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/pumpkinV.png"))); // NOI18N
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 60, 60));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/pumpkinV.png"))); // NOI18N
        jPanel2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 60, 60));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/pumpkinV.png"))); // NOI18N
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 60, 60));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/pumpkinV.png"))); // NOI18N
        jPanel2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 60, 60));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/pumpkinV.png"))); // NOI18N
        jPanel2.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 60, 60));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/pumpkinV.png"))); // NOI18N
        jPanel2.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 60, 60));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/redbullV.png"))); // NOI18N
        jPanel2.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 60, 60));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/rhino.png"))); // NOI18N
        jPanel2.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 60, 60));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/sabretoothV.png"))); // NOI18N
        jPanel2.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 60, 60));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/sandman.png"))); // NOI18N
        jPanel2.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 60, 60));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/sentinel.png"))); // NOI18N
        jPanel2.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 60, 60));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/sentinel.png"))); // NOI18N
        jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 60));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/sinisterV.png"))); // NOI18N
        jPanel2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 60, 60));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/thanosV.png"))); // NOI18N
        jPanel2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 60, 60));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/ultron.png"))); // NOI18N
        jPanel2.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 60));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/venomV.png"))); // NOI18N
        jPanel2.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 60, 60));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/viper.png"))); // NOI18N
        jPanel2.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 60, 60));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/villanos/widowV.png"))); // NOI18N
        jPanel2.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 60, 60));

        jButton1.setText("jButton1");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 10, 100, 25));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, 600));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtDesac6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDesac6ActionPerformed

    }//GEN-LAST:event_BtDesac6ActionPerformed

    private void c91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c91ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c91ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void c35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c35ActionPerformed
        this.filaDeFichaSeleccionada=4;
        this.columnaDeFichaSeleccionada=5;
    }//GEN-LAST:event_c35ActionPerformed

    private void c45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c45ActionPerformed
        this.filaDeFichaDestino=5;
        this.columnaDeFichaDestino=5;
        if(this.turno==1){
        c45.setText(c35.getText());
        c35.setText("");
        this.turno=2;
        }else{
            JOptionPane.showMessageDialog(null, "No es tu turno!");
        }
    }//GEN-LAST:event_c45ActionPerformed

    private void c66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c66ActionPerformed

    }//GEN-LAST:event_c66ActionPerformed

    private void c56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c56ActionPerformed
        if(this.turno==2){
        c56.setText(c66.getText());
        c66.setText("");
        this.turno=1;
        }else{
            JOptionPane.showMessageDialog(null, "No es tu turno!");
        }
    }//GEN-LAST:event_c56ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtDesac1;
    public javax.swing.JButton BtDesac2;
    public javax.swing.JButton BtDesac3;
    public javax.swing.JButton BtDesac4;
    public javax.swing.JButton BtDesac5;
    public javax.swing.JButton BtDesac6;
    public javax.swing.JButton BtDesac7;
    public javax.swing.JButton BtDesac8;
    public javax.swing.JLabel LbTierra;
    public javax.swing.JButton c1;
    public javax.swing.JButton c10;
    public javax.swing.JButton c100;
    public javax.swing.JButton c11;
    public javax.swing.JButton c12;
    public javax.swing.JButton c13;
    public javax.swing.JButton c14;
    public javax.swing.JButton c15;
    public javax.swing.JButton c16;
    public javax.swing.JButton c17;
    public javax.swing.JButton c18;
    public javax.swing.JButton c19;
    public javax.swing.JButton c2;
    public javax.swing.JButton c20;
    public javax.swing.JButton c21;
    public javax.swing.JButton c22;
    public javax.swing.JButton c23;
    public javax.swing.JButton c24;
    public javax.swing.JButton c25;
    public javax.swing.JButton c26;
    public javax.swing.JButton c27;
    public javax.swing.JButton c28;
    public javax.swing.JButton c29;
    public javax.swing.JButton c3;
    public javax.swing.JButton c30;
    public javax.swing.JButton c31;
    public javax.swing.JButton c32;
    public javax.swing.JButton c33;
    public javax.swing.JButton c34;
    public javax.swing.JButton c35;
    public javax.swing.JButton c36;
    public javax.swing.JButton c37;
    public javax.swing.JButton c38;
    public javax.swing.JButton c39;
    public javax.swing.JButton c4;
    public javax.swing.JButton c40;
    private javax.swing.JButton c41;
    private javax.swing.JButton c42;
    private javax.swing.JButton c45;
    private javax.swing.JButton c46;
    private javax.swing.JButton c49;
    public javax.swing.JButton c5;
    private javax.swing.JButton c50;
    private javax.swing.JButton c51;
    private javax.swing.JButton c52;
    private javax.swing.JButton c55;
    private javax.swing.JButton c56;
    private javax.swing.JButton c59;
    public javax.swing.JButton c6;
    private javax.swing.JButton c60;
    public javax.swing.JButton c61;
    public javax.swing.JButton c62;
    public javax.swing.JButton c63;
    public javax.swing.JButton c64;
    public javax.swing.JButton c65;
    public javax.swing.JButton c66;
    public javax.swing.JButton c67;
    public javax.swing.JButton c68;
    public javax.swing.JButton c69;
    public javax.swing.JButton c7;
    public javax.swing.JButton c70;
    public javax.swing.JButton c71;
    public javax.swing.JButton c72;
    public javax.swing.JButton c73;
    public javax.swing.JButton c74;
    public javax.swing.JButton c75;
    public javax.swing.JButton c76;
    public javax.swing.JButton c77;
    public javax.swing.JButton c78;
    public javax.swing.JButton c79;
    public javax.swing.JButton c8;
    public javax.swing.JButton c80;
    public javax.swing.JButton c81;
    public javax.swing.JButton c82;
    public javax.swing.JButton c83;
    public javax.swing.JButton c84;
    public javax.swing.JButton c85;
    public javax.swing.JButton c86;
    public javax.swing.JButton c87;
    public javax.swing.JButton c88;
    public javax.swing.JButton c89;
    public javax.swing.JButton c9;
    public javax.swing.JButton c90;
    public javax.swing.JButton c91;
    public javax.swing.JButton c92;
    public javax.swing.JButton c93;
    public javax.swing.JButton c94;
    public javax.swing.JButton c95;
    public javax.swing.JButton c96;
    public javax.swing.JButton c97;
    public javax.swing.JButton c98;
    public javax.swing.JButton c99;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton52;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables

    boolean espacioDisponible(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void colocarFicha(String ficha, int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
