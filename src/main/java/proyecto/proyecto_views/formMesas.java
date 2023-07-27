/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto.proyecto_views;


import proyecto.proyecto_DAO.MesaDao;
import proyecto.proyecto_models.Mesa;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * @author Jhon_A
 */
public class formMesas extends javax.swing.JPanel {

    MesaDao dao = new MesaDao();
    List<Mesa> mesas = dao.listaMesa();
    List<JButton> botones = new ArrayList<>();
    public formMesas() {
        initComponents();
        getMesas();
        mesasOcupadas();
    }

    private void mesasOcupadas(){
        mesas.stream().filter(Mesa::isEstado)
                        .forEach(item->{
                            JButton button = botones.get(item.getId()-1);
                            button.setForeground(new java.awt.Color(255, 255, 255));
                            button.setBackground(new java.awt.Color(238, 0, 27));
                            button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                        });
    }

    private void getMesas(){
        Field[] campos = this.getClass().getDeclaredFields();

        int i = 1;
        for (Field campo : campos) {
            if (campo.getName().startsWith("mesa") && campo.getType() == JButton.class) {
                campo.setAccessible(true);
                try {
                    JButton button =(JButton) campo.get(this);
                    int finalI = i;
                    /*button.addActionListener((a)->{
                        Mesa mesa = new Mesa();
                        mesa.setId(finalI);
                        mesa.setEstado(!dao.getMesa(finalI).isEstado());
                        System.out.println(mesa);
                        dao.actualizarMesa(mesa);
                        mesasOcupadas();
                    });*/
                    botones.add(button);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                i++;
            }
        }
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
        jButton1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mesaA = new javax.swing.JButton();
        mesaC = new javax.swing.JButton();
        mesaE = new javax.swing.JButton();
        mesaF = new javax.swing.JButton();
        mesaI = new javax.swing.JButton();
        mesaD = new javax.swing.JButton();
        mesaG = new javax.swing.JButton();
        mesaH = new javax.swing.JButton();
        mesaB = new javax.swing.JButton();
        mesaJ = new javax.swing.JButton();
        mesaK = new javax.swing.JButton();
        mesaL = new javax.swing.JButton();

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

        jButton1.setText("jButton1");

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton11.setText("MESA 1");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 0, 27)));

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("MESAS");
        jLabel1.setIconTextGap(11);

        mesaA.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaA.setText("MESA 1");

        mesaC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaC.setText("MESA 3");
        mesaC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 0, 27)));

        mesaE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaE.setText("MESA 5");
        mesaE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 0, 27)));
        mesaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaEActionPerformed(evt);
            }
        });

        mesaF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaF.setText("MESA 6");
        mesaF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 0, 27)));

        mesaI.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaI.setText("MESA 9");
        mesaI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 0, 27)));

        mesaD.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaD.setText("MESA 4");
        mesaD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 0, 27)));

        mesaG.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaG.setText("MESA 7");
        mesaG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 0, 27)));

        mesaH.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaH.setText("MESA 8");
        mesaH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 0, 27)));

        mesaB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaB.setText("MESA 2");
        mesaB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 0, 27)));

        mesaJ.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaJ.setText("MESA 10");
        mesaJ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 0, 27)));

        mesaK.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaK.setText("MESA 11");
        mesaK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 0, 27)));

        mesaL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaL.setText("MESA 12");
        mesaL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 0, 27)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 469, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(447, 447, 447))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesaA, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesaE, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesaI, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mesaJ, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mesaK, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mesaL, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mesaF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mesaG, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mesaH, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mesaB, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mesaC, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mesaD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesaA, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesaC, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesaD, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesaB, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesaE, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesaF, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesaG, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesaH, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mesaJ, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mesaK, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mesaL, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mesaI, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
       
    }//GEN-LAST:event_editarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    
    }//GEN-LAST:event_eliminarActionPerformed

    private void mesaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesaEActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem editar;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mesaA;
    private javax.swing.JButton mesaB;
    private javax.swing.JButton mesaC;
    private javax.swing.JButton mesaD;
    private javax.swing.JButton mesaE;
    private javax.swing.JButton mesaF;
    private javax.swing.JButton mesaG;
    private javax.swing.JButton mesaH;
    private javax.swing.JButton mesaI;
    private javax.swing.JButton mesaJ;
    private javax.swing.JButton mesaK;
    private javax.swing.JButton mesaL;
    private javax.swing.JPopupMenu popMenu;
    // End of variables declaration//GEN-END:variables
}
