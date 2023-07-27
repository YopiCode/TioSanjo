package proyecto_views;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import proyecto_DAO.EmpleadoDao;
import proyecto_DAO.MesaDao;
import proyecto_models.Empleado;
import proyecto_models.Mesa;

import javax.swing.*;

public class formPrincipal_mozo extends javax.swing.JFrame {
    MesaDao mesaDao = new MesaDao();
    List<Mesa> mesas = mesaDao.listaMesa();
    List<JButton> botones = new ArrayList<>();
    
    EmpleadoDao empleadoDao = new EmpleadoDao();
    List<Empleado> empleados = empleadoDao.listaMozos();

    public static void main(String[] args) {
        formPrincipal_mozo fm = new formPrincipal_mozo();
        fm.setVisible(true);
    }

    public formPrincipal_mozo() {
        initComponents();
        setLocationRelativeTo(this);

        mozosComboBox.removeAllItems();
        empleados.forEach(item -> mozosComboBox.addItem(item.getUsuario()));

        getMesas();
        mesasOcupadas();
    }

    private void mesasOcupadas() {
        mesas.stream().filter(Mesa::isEstado)
                .forEach(item -> {
                    JButton button = botones.get(item.getId() - 1);
                    button.setForeground(new java.awt.Color(255, 255, 255));
                    button.setBackground(new java.awt.Color(238, 0, 27));
                    button.setFont(new java.awt.Font("Segoe UI", 1, 24));
                    button.setEnabled(false);
                });
    }

    private void getMesas() {
        Field[] campos = this.getClass().getDeclaredFields();
        for (Field campo : campos) {
            if (campo.getName().startsWith("mesa") && campo.getType() == JButton.class) {
                campo.setAccessible(true);
                try {
                    JButton button = (JButton) campo.get(this);
                    botones.add(button);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        mesaA = new javax.swing.JButton();
        mesaB = new javax.swing.JButton();
        mesaC = new javax.swing.JButton();
        mesaD = new javax.swing.JButton();
        mesaE = new javax.swing.JButton();
        mesaF = new javax.swing.JButton();
        mesaG = new javax.swing.JButton();
        mesaH = new javax.swing.JButton();
        mesaI = new javax.swing.JButton();
        mesaJ = new javax.swing.JButton();
        mesaK = new javax.swing.JButton();
        mesaL = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mozosComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

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

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("jMenu1");

        jMenuItem4.setText("jMenuItem4");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jButton9.setText("jButton1");

        jButton10.setText("jButton1");

        jButton11.setText("jButton1");

        jButton12.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SERVICIO INFORMATICO | JTECH");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(186, 36, 36));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MESAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(607, 607, 607))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        mesaA.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaA.setText("MESA 1");
        mesaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaAActionPerformed(evt);
            }
        });

        mesaB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaB.setText("MESA 2");
        mesaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaBActionPerformed(evt);
            }
        });

        mesaC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaC.setText("MESA 3");
        mesaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaCActionPerformed(evt);
            }
        });

        mesaD.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaD.setText("MESA 4");
        mesaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaDActionPerformed(evt);
            }
        });

        mesaE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaE.setText("MESA 5");
        mesaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaEActionPerformed(evt);
            }
        });

        mesaF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaF.setText("MESA 6");
        mesaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaFActionPerformed(evt);
            }
        });

        mesaG.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaG.setText("MESA 7");
        mesaG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaGActionPerformed(evt);
            }
        });

        mesaH.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaH.setText("MESA 8");
        mesaH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaHActionPerformed(evt);
            }
        });

        mesaI.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaI.setText("MESA 9");
        mesaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaIActionPerformed(evt);
            }
        });

        mesaJ.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaJ.setText("MESA 10");
        mesaJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaJActionPerformed(evt);
            }
        });

        mesaK.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaK.setText("MESA 11");
        mesaK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaKActionPerformed(evt);
            }
        });

        mesaL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesaL.setText("MESA 12");
        mesaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaLActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VENDEDOR");

        mozosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"MOZO 1", "MOZO 2", "MOZO 3"}));
        mozosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mozosComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("00:00");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FECHA Y HORA:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("18/06/2023");

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(mesaE, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(75, 75, 75)
                                                        .addComponent(mesaF, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(59, 59, 59)
                                                        .addComponent(mesaG, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(87, 87, 87)
                                                        .addComponent(mesaH, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(mesaA, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(75, 75, 75)
                                                        .addComponent(mesaB, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(59, 59, 59)
                                                        .addComponent(mesaC, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(87, 87, 87)
                                                        .addComponent(mesaD, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(mesaI, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(75, 75, 75)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                        .addComponent(jLabel2)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(mozosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                        .addComponent(mesaJ, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(59, 59, 59)
                                                                        .addComponent(mesaK, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(87, 87, 87)
                                                                        .addComponent(mesaL, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(51, 51, 51)
                                                                .addComponent(jLabel3)))))
                                .addContainerGap(87, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addContainerGap(948, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(304, 304, 304)))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mesaA, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mesaB, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mesaC, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mesaD, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mesaE, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mesaF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mesaG, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mesaH, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mesaI, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mesaJ, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mesaK, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mesaL, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(mozosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel5))
                                                .addGap(24, 24, 24))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addContainerGap(662, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(26, 26, 26)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int getIdEmpleado(){
        return empleados.get(mozosComboBox.getSelectedIndex()).getId();
    }

    private void mesaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaAActionPerformed
        formPedido fp = new formPedido(getIdEmpleado(), 1);
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesaAActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Login_Mozo lm = new Login_Mozo();
        lm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void mesaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaBActionPerformed
        formPedido fp = new formPedido(getIdEmpleado(), 2);
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesaBActionPerformed

    private void mesaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaDActionPerformed
        formPedido fp = new formPedido(getIdEmpleado(), 4);
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesaDActionPerformed

    private void mesaJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaJActionPerformed
        formPedido fp = new formPedido(getIdEmpleado(), 10);
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesaJActionPerformed

    private void mesaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaCActionPerformed
        formPedido fp = new formPedido(getIdEmpleado(), 3);
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesaCActionPerformed

    private void mesaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaEActionPerformed
        formPedido fp = new formPedido(getIdEmpleado(), 5);
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesaEActionPerformed

    private void mesaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaFActionPerformed
        formPedido fp = new formPedido(getIdEmpleado(), 6);
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesaFActionPerformed

    private void mesaGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaGActionPerformed
        formPedido fp = new formPedido(getIdEmpleado(), 7);
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesaGActionPerformed

    private void mesaHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaHActionPerformed
        formPedido fp = new formPedido(getIdEmpleado(), 8);
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesaHActionPerformed

    private void mesaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaIActionPerformed
        formPedido fp = new formPedido(getIdEmpleado(), 9);
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesaIActionPerformed

    private void mesaKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaKActionPerformed
        formPedido fp = new formPedido(getIdEmpleado(), 11);
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesaKActionPerformed

    private void mesaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaLActionPerformed
        formPedido fp = new formPedido(getIdEmpleado(), 12);
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mesaLActionPerformed

    private void mozosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mozosComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mozosComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
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
    private javax.swing.JComboBox<String> mozosComboBox;
    // End of variables declaration//GEN-END:variables
}
