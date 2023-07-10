package proyecto_views;
import proyecto_views.formHome_Admin;

public class formPrincipalAdmin extends javax.swing.JFrame {
 public static void main(String[] args) {
        formPrincipalAdmin fa = new formPrincipalAdmin();
        fa.setVisible(true);
    }
    public formPrincipalAdmin() {
        initComponents();
        this.setLocationRelativeTo(this);
       this.btnHome.setSelected(true);
        new CambiaPanel(panelContenido, new formHome_Admin());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnCocina = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnPlatillos = new javax.swing.JButton();
        btnCaja = new javax.swing.JButton();
        btnMesas = new javax.swing.JButton();
        btnDelivery = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnAbastecimiento = new javax.swing.JButton();
        btnUsers = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelContenido = new javax.swing.JPanel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SERVICIO INFORMATICO | JTECH");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(186, 36, 36));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("El Rincon del Tio Sanjo");

        jButton1.setBackground(new java.awt.Color(255, 51, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/USER.png"))); // NOI18N
        jButton1.setBorderPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 955, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1361, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 6, -1, 94));

        btnHome.setBackground(new java.awt.Color(194, 29, 99));
        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 106, 170, 55));

        btnCocina.setBackground(new java.awt.Color(194, 29, 99));
        btnCocina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCocina.setForeground(new java.awt.Color(255, 255, 255));
        btnCocina.setText("COCINA");
        btnCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocinaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCocina, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 167, 170, 55));

        btnClientes.setBackground(new java.awt.Color(194, 29, 99));
        btnClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("CLIENTES");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel2.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 289, 170, 55));

        btnPlatillos.setBackground(new java.awt.Color(194, 29, 99));
        btnPlatillos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlatillos.setForeground(new java.awt.Color(255, 255, 255));
        btnPlatillos.setText("PLATILLOS");
        btnPlatillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatillosActionPerformed(evt);
            }
        });
        jPanel2.add(btnPlatillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 228, 170, 55));

        btnCaja.setBackground(new java.awt.Color(194, 29, 99));
        btnCaja.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCaja.setForeground(new java.awt.Color(255, 255, 255));
        btnCaja.setText("CAJA");
        btnCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 350, 170, 55));

        btnMesas.setBackground(new java.awt.Color(194, 29, 99));
        btnMesas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMesas.setForeground(new java.awt.Color(255, 255, 255));
        btnMesas.setText("MESAS");
        btnMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesasActionPerformed(evt);
            }
        });
        jPanel2.add(btnMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 411, 170, 55));

        btnDelivery.setBackground(new java.awt.Color(194, 29, 99));
        btnDelivery.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelivery.setForeground(new java.awt.Color(255, 255, 255));
        btnDelivery.setText("DELIVERY");
        btnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 472, 170, 55));

        btnReporte.setBackground(new java.awt.Color(194, 29, 99));
        btnReporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setText("REPORTE");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel2.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 533, 170, 55));

        btnAbastecimiento.setBackground(new java.awt.Color(194, 29, 99));
        btnAbastecimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAbastecimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnAbastecimiento.setText("ABASTECIMIENTO");
        btnAbastecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbastecimientoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAbastecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 594, 170, 55));

        btnUsers.setBackground(new java.awt.Color(194, 29, 99));
        btnUsers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnUsers.setText("USUARIOS");
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });
        jPanel2.add(btnUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 655, 170, 55));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 716, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 250, -1));

        panelContenido.setBackground(new java.awt.Color(255, 204, 204));
        panelContenido.setLayout(new javax.swing.BoxLayout(panelContenido, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 88, 1098, 764));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new CambiaPanel(panelContenido, new formHome_Admin());
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesasActionPerformed
        new CambiaPanel(panelContenido,new formMesas());
    }//GEN-LAST:event_btnMesasActionPerformed

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryActionPerformed
        new CambiaPanel(panelContenido,new formDelivery());
    }//GEN-LAST:event_btnDeliveryActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        new CambiaPanel(panelContenido,new formReportes());
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnAbastecimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbastecimientoActionPerformed
        new CambiaPanel(panelContenido,new formAbastecimiento());
    }//GEN-LAST:event_btnAbastecimientoActionPerformed

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        new CambiaPanel(panelContenido,new formUsuarios());
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       Login_Admin la=new Login_Admin();
       la.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocinaActionPerformed
        new CambiaPanel(panelContenido, new formCocina());
     
    }//GEN-LAST:event_btnCocinaActionPerformed

    private void btnPlatillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatillosActionPerformed
        new CambiaPanel(panelContenido, new formPlatillos());
    }//GEN-LAST:event_btnPlatillosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        new CambiaPanel(panelContenido, new formClientes());
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaActionPerformed
       new CambiaPanel(panelContenido,new formCaja());
    }//GEN-LAST:event_btnCajaActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbastecimiento;
    private javax.swing.JButton btnCaja;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCocina;
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnMesas;
    private javax.swing.JButton btnPlatillos;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsers;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel panelContenido;
    // End of variables declaration//GEN-END:variables
}
