
package proyecto_views;

import proyecto_DAO.CompraDao;
import proyecto_DAO.InsumoDao;
import proyecto_models.Compra;
import proyecto_models.Insumo;

import javax.swing.table.DefaultTableModel;

import java.util.List;

import static proyecto_utils.Formularios.getObjetoFormulario;


public class formAbastecimientoCocina extends javax.swing.JFrame {
    CompraDao compraDao = new CompraDao();
    InsumoDao insumoDao = new InsumoDao();
    List<Insumo> insumos = insumoDao.listaInsumoCocina();
    List<Compra> compras = compraDao.listaCompra();

    public formAbastecimientoCocina() {
        initComponents();
        this.setLocationRelativeTo(this);
        listarTabla();
        insumos.forEach(item -> idInsumo.addItem(item.getNombre()));
    }

    public void listarTabla() {
        tabCocina.removeAll();
        String[] encabezado = {"PRODUCTOS", "PRECIO COMPRA", "CANTIDAD", "FECHA", "TOTAL"};
        Object[][] data = compras.stream()
                .filter(item -> insumos.stream().anyMatch(item2 -> item.getIdInsumo() == item2.getId()))
                .map(item -> {
                    Insumo insumo = insumoDao.getInsumo(item.getIdInsumo());
                    return new Object[]{insumo.getNombre(),
                            item.getPrecioCompra(),
                            item.getCantidad(),
                            item.getFecha(),
                            item.getCantidad() * item.getPrecioCompra()};
                })
                .toArray(Object[][]::new);
        tabCocina.setModel(new DefaultTableModel(data, encabezado));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        btnAgregarServicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        precioCompra = new javax.swing.JTextField();
        idInsumo = new javax.swing.JComboBox<>();
        btnAgregarServicio1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCocina = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de insumos Cocina ");
        jLabel1.setIconTextGap(11);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jPanel2.setBackground(new java.awt.Color(231, 231, 231));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Nueva Compra");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Insumo Cocina:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Canti.");

        btnAgregarServicio.setBackground(new java.awt.Color(218, 30, 40));
        btnAgregarServicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarServicio.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarServicio.setText("AGREGAR");
        btnAgregarServicio.setToolTipText("");
        btnAgregarServicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarServicio.setIconTextGap(10);
        btnAgregarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarServicioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Fecha:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Precio Compra:");

        btnAgregarServicio1.setBackground(new java.awt.Color(218, 30, 40));
        btnAgregarServicio1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarServicio1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarServicio1.setText("REGISTRAR");
        btnAgregarServicio1.setToolTipText("");
        btnAgregarServicio1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarServicio1.setIconTextGap(10);
        btnAgregarServicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarServicio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(83, 83, 83))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                .addComponent(btnAgregarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnAgregarServicio1)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel7)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jLabel5)
                                                                .addComponent(jLabel2))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(precioCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                                .addComponent(cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                                .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                                .addComponent(idInsumo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(btnAgregarServicio1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(precioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 350, 420));

        tabCocina.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(tabCocina);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 520, 330));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("COCINA");
        jLabel8.setIconTextGap(11);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarServicioActionPerformed
        Compra compra = getObjetoFormulario(this, Compra.class);
        compra.setIdInsumo(insumos.get(compra.getIdInsumo()).getId());
        compraDao.registraCompra(compra);
        listarTabla();
        this.dispose();
    }//GEN-LAST:event_btnAgregarServicioActionPerformed

    private void btnAgregarServicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarServicio1ActionPerformed
        formRegistrarInsumo fb = new formRegistrarInsumo();
        fb.setVisible(true);
        fb.setDefaultCloseOperation(fb.HIDE_ON_CLOSE);

    }//GEN-LAST:event_btnAgregarServicio1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarServicio;
    private javax.swing.JButton btnAgregarServicio1;
    private javax.swing.JTextField cantidad;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JComboBox<String> idInsumo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField precioCompra;
    private javax.swing.JTable tabCocina;
    // End of variables declaration//GEN-END:variables
}
