/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_views;

import proyecto_DAO.InsumoDao;
import proyecto_DAO.ItemCartaDao;
import proyecto_models.Insumo;
import proyecto_models.ItemCarta;
import proyecto_models.Preparacion;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

import static proyecto_utils.Formularios.getObjetoFormulario;

/**
 *
 * @author Jhon_A
 */
public class formRegistroPlatillo extends javax.swing.JFrame {

    ItemCartaDao itemCartaDao = new ItemCartaDao();
    InsumoDao insumoDao = new InsumoDao();
    List<Insumo> insumos = insumoDao.listaInsumoCocina();
    List<Preparacion> preparaciones = new ArrayList<>();
    public formRegistroPlatillo() {
        initComponents();
        this.setLocationRelativeTo(this);

        listarTablaInsumos();
        listarTablaPreparacion();
    }

    public void listarTablaInsumos() {
        String[] encabezado = {"Nombre", "Stock"};
        Object[][] data = insumos.stream()
                .map(item -> new Object[]{item.getNombre(),
                        item.getStock()})
                .toArray(Object[][]::new);
        tablaInsumos.setModel(new DefaultTableModel(data, encabezado));
    }

    public void listarTablaPreparacion() {
        tablaInsumosDetalle.removeAll();
        String[] encabezado = {"Insumo", "Cantidad"};
        Object[][] data = preparaciones.stream()
                .map(item -> new Object[]{insumoDao.getInsumo(item.getIdInsumo()).getNombre(),
                        item.getCantidad()})
                .toArray(Object[][]::new);
        tablaInsumosDetalle.setModel(new DefaultTableModel(data, encabezado));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        precioUnit = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInsumosDetalle = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInsumos = new javax.swing.JTable();
        cantidad = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Nuevo Platillo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre Platillo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio Unit.");

        btnAgregar.setBackground(new java.awt.Color(238, 0, 27));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar Cliente");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaInsumosDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaInsumosDetalle);

        tablaInsumos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaInsumos);

        btnAdd.setBackground(new java.awt.Color(0, 153, 51));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("AGREGAR");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CANTIDAD: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cantidad)
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(511, 511, 511))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel4)
                        .addGap(64, 64, 64)
                        .addComponent(precioUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(precioUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ItemCarta item = getObjetoFormulario(this, ItemCarta.class);
        ItemCarta nuevo = itemCartaDao.registraItemCarta(item);

        for (Preparacion preparacion : preparaciones) {
            preparacion.setIdItem(nuevo.getId());
            itemCartaDao.registrarPreparacion(preparacion);
        }
        listarTablaInsumos();
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Preparacion preparacion = new Preparacion();
        preparacion.setIdInsumo(insumos.get(tablaInsumos.getSelectedRow()).getId());
        preparacion.setCantidad(Integer.parseInt(cantidad.getText()));
        preparaciones.add(preparacion);
        listarTablaPreparacion();
    }                                      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precioUnit;
    private javax.swing.JTable tablaInsumos;
    private javax.swing.JTable tablaInsumosDetalle;
    // End of variables declaration//GEN-END:variables
}
