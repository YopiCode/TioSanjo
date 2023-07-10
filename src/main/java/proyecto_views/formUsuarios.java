/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_views;



import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author Jhon_A
 */
public class formUsuarios extends javax.swing.JPanel {
 
        String [] encabezado={"NOMBRE EMPLEADO","TIPO EMPLEADO","TELEFONO"};
    DefaultTableModel tabUsu;
   
    
    public formUsuarios() {
        initComponents();
      tabUsu = new DefaultTableModel(null, encabezado);
        tabUser.setModel(tabUsu);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        popMenu = new javax.swing.JPopupMenu();
        editar = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel1 = new javax.swing.JLabel();
        btnNuevoTecnico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabUser = new javax.swing.JTable();

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        popMenu.add(editar);

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        popMenu.add(eliminar);

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("Lista de Usuarios");
        jLabel1.setIconTextGap(11);

        btnNuevoTecnico.setBackground(new java.awt.Color(218, 30, 40));
        btnNuevoTecnico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevoTecnico.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoTecnico.setText("NUEVO EMPLEADO");
        btnNuevoTecnico.setToolTipText("");
        btnNuevoTecnico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevoTecnico.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevoTecnico.setIconTextGap(10);
        btnNuevoTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTecnicoActionPerformed(evt);
            }
        });

        tabUser.setModel(new javax.swing.table.DefaultTableModel(
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
        tabUser.setComponentPopupMenu(popMenu);
        jScrollPane1.setViewportView(tabUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoTecnico)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(929, 929, 929)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnNuevoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTecnicoActionPerformed
           formRegistroUsuario fu=new formRegistroUsuario();
           fu.setVisible(true);
           fu.setDefaultCloseOperation(fu.HIDE_ON_CLOSE);
    }//GEN-LAST:event_btnNuevoTecnicoActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
       
    }//GEN-LAST:event_editarActionPerformed

   
    public void listarTabla() {
      
    }
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       
        listarTabla();
    }//GEN-LAST:event_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoTecnico;
    private javax.swing.JMenuItem editar;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu popMenu;
    private javax.swing.JTable tabUser;
    // End of variables declaration//GEN-END:variables
}
