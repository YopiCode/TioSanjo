
package proyecto_views;

import javax.swing.table.DefaultTableModel;

public class formPlatillos extends javax.swing.JPanel {
       String [] encabezado={"N°","Nombre","Descripcion","Eliminar"};
        DefaultTableModel tabPlato;
   
    public formPlatillos() {
      initComponents();
      
      tabPlato = new DefaultTableModel(null, encabezado);
        tabPlatillos.setModel(tabPlato);
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel5 = new javax.swing.JLabel();
        boxPlatillos = new javax.swing.JComboBox<>();
        btnNuevoProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPlatillos = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PLATILLOS EN CARTA");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 610, 70));
        add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 845, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("SELECCIONAR TIPO / CATEGORIA:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        boxPlatillos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PLATOS PRINCIPALES", "BEBIDAS", "BEBIDAS PREPARADAS", "BEBIDAS ALCOHOLICAS" }));
        add(boxPlatillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 290, 50));

        btnNuevoProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProducto.setText("NUEVO PRODUCTO");
        btnNuevoProducto.setBorderPainted(false);
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });
        add(btnNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 170, 40));

        tabPlatillos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabPlatillos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 720, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        formRegistroProducto frp=new formRegistroProducto();
        frp.setVisible(true);
        frp.setDefaultCloseOperation(frp.HIDE_ON_CLOSE);
               
    }//GEN-LAST:event_btnNuevoProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxPlatillos;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabPlatillos;
    // End of variables declaration//GEN-END:variables
}
