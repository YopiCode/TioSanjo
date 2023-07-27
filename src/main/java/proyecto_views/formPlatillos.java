
package proyecto_views;

import proyecto_DAO.ItemCartaDao;
import proyecto_models.ItemCarta;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class formPlatillos extends javax.swing.JPanel {

    ItemCartaDao itemCartaDao = new ItemCartaDao();
    List<ItemCarta> items = itemCartaDao.listaItemCarta();
    public formPlatillos() {
        initComponents();

        listarTablaItems();
    }

    public void listarTablaItems() {
        String[] encabezado = {"Nombre", "Precio Unit"};
        Object[][] data = items.stream()
                .map(item -> new Object[]{item.getNombre(),
                        item.getPrecioUnit()})
                .toArray(Object[][]::new);
        tabPlatillos.setModel(new DefaultTableModel(data, encabezado));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel5 = new javax.swing.JLabel();
        boxPlatillos = new javax.swing.JComboBox<>();
        btnBebida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPlatillos = new javax.swing.JTable();
        btnNuevoProducto1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ITEMS EN CARTA");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 610, 70));
        add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 845, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("SELECCIONAR TIPO / CATEGORIA:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        boxPlatillos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PLATOS PRINCIPALES", "BEBIDAS", "BEBIDAS PREPARADAS", "BEBIDAS ALCOHOLICAS" }));
        add(boxPlatillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 290, 50));

        btnBebida.setBackground(new java.awt.Color(0, 0, 0));
        btnBebida.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBebida.setForeground(new java.awt.Color(255, 255, 255));
        btnBebida.setText("Nueva Bebida");
        btnBebida.setBorderPainted(false);
        btnBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidaActionPerformed(evt);
            }
        });
        add(btnBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 170, 40));

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

        btnNuevoProducto1.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoProducto1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoProducto1.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProducto1.setText("Nuevo Platillo");
        btnNuevoProducto1.setBorderPainted(false);
        btnNuevoProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProducto1ActionPerformed(evt);
            }
        });
        add(btnNuevoProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidaActionPerformed
        formRegistroBebida frp = new formRegistroBebida();
        frp.setVisible(true);
        frp.setDefaultCloseOperation(frp.HIDE_ON_CLOSE);

    }//GEN-LAST:event_btnBebidaActionPerformed

    private void btnNuevoProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProducto1ActionPerformed
        formRegistroPlatillo frp = new formRegistroPlatillo();
        frp.setVisible(true);
        frp.setDefaultCloseOperation(frp.HIDE_ON_CLOSE);
    }//GEN-LAST:event_btnNuevoProducto1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxPlatillos;
    private javax.swing.JButton btnBebida;
    private javax.swing.JButton btnNuevoProducto1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabPlatillos;
    // End of variables declaration//GEN-END:variables
}
