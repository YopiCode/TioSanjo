/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_views;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import proyecto_DAO.*;
import proyecto_models.*;
import proyecto_utils.Boleta;
import proyecto_utils.DetalleBoleta;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.*;

import static proyecto_views.formPrincipalAdmin.panelContenido;


public class formCaja extends javax.swing.JPanel {
    PedidoDao pedidoDao = new PedidoDao();
    ItemCartaDao itemCartaDao = new ItemCartaDao();
    MesaDao mesaDao = new MesaDao();
    PagoDao pagoDao = new PagoDao();
    ClienteDao clienteDao = new ClienteDao();
    List<Pedido> pedidos = pedidoDao.listaPedido();
    List<DetallePedido> detalles = new ArrayList<>();
    List<MetodoPago> metodos = pagoDao.listaMetodoPago();
    Pedido pedido = new Pedido();

    public formCaja() {
        initComponents();
        listarTablaPedidos();
        listarTablaDetalle();
        System.out.println(pedidos);
        metodos.forEach(item-> metodoPago.addItem(item.getMetodoPago()));
    }

    public void listarTablaPedidos() {
        String[] encabezado = {"Nro", "Cliente", "Mesa", "Fecha", "Estado"};
        Object[][] data = pedidos.stream().filter(item -> pagoDao.getPagoByIdPedido(item.getId()) == null)
                .map(item -> {
                    Cliente cliente = clienteDao.getCliente(item.getIdCliente());
                    String estado = "Sin Cancelar";
                    return new Object[]{item.getId(),
                            cliente.getNombre(),
                            item.getIdMesa(),
                            item.getFecha(),
                            estado};
                })
                .toArray(Object[][]::new);
        tabConsumo.setModel(new DefaultTableModel(data, encabezado));
    }

    public void listarTablaDetalle() {
        String[] encabezado = {"Item", "Precio Unit", "Cantidad"};
        Object[][] data = detalles.stream()
                .map(item -> {
                    ItemCarta itemCarta = itemCartaDao.getItemCarta(item.getIdItem());
                    return new Object[]{
                            itemCarta.getNombre(),
                            itemCarta.getPrecioUnit(),
                            item.getCantidad()};
                })
                .toArray(Object[][]::new);
        tabDetalle.setModel(new DefaultTableModel(data, encabezado));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabDetalle = new javax.swing.JTable();
        btnDetalle = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabConsumo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnCobrar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        metodoPago = new javax.swing.JComboBox<>();

        jCheckBox1.setText("Yape");

        jCheckBox2.setText("Efectivo");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("Metodo de Pago:");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("CAJA");
        jLabel1.setIconTextGap(11);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 23, -1, -1));

        tabDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabDetalle);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 918, 183));

        btnDetalle.setBackground(new java.awt.Color(238, 0, 27));
        btnDetalle.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnDetalle.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalle.setText("DETALLE");
        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });
        add(btnDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 104, 117, 35));

        tabConsumo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabConsumo);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 103, 625, 160));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("TOTAL A PAGAR :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Lista Detallada");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTotal.setText("S/.  00.00");
        add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, -1, -1));

        btnCobrar.setBackground(new java.awt.Color(238, 0, 27));
        btnCobrar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCobrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCobrar.setText("COBRAR");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });
        add(btnCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 580, 117, 35));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Metodo de Pago:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        add(metodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed
        pedido = pedidos.get(tabConsumo.getSelectedRow());
        txtTotal.setText(String.valueOf(pedido.getTotal()));
        detalles = pedidoDao.listaDetallePedidoByIdPedido(pedido.getId());
        listarTablaDetalle();
    }//GEN-LAST:event_btnDetalleActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        Pago pago = new Pago();
        pago.setIdPedido(pedido.getId());
        pago.setIdMetodoPago(metodos.get(metodoPago.getSelectedIndex()).getId());
        pago.setFecha(new Date());
        pagoDao.registrarPago(pago);
        new CambiaPanel(panelContenido, new formCaja());

        Cliente cliente = clienteDao.getCliente(pedido.getIdCliente());
        String img = Boleta.class.getClassLoader().getResource("img/logo_LOGIN.jpg").getPath();
        Boleta boleta = new Boleta(img, cliente.getDni(), cliente.getNombre(), String.valueOf(pedido.getTotal()));
        List<DetalleBoleta> detalleBoletas = new ArrayList<>();
        for (DetallePedido detalle : detalles) {
            DetalleBoleta detalleBoleta = new DetalleBoleta();
            ItemCarta item = itemCartaDao.getItemCarta(detalle.getIdItem());
            detalleBoleta.setCantidad(detalle.getCantidad());
            detalleBoleta.setTotal(detalle.getCantidad() * item.getPrecioUnit());
            detalleBoleta.setDescripcion(item.getNombre());
            detalleBoletas.add(detalleBoleta);
        }
        System.out.println(detalleBoletas);
        Mesa mesa = mesaDao.getMesa(pedido.getIdMesa());
        mesa.setEstado(false);
        mesaDao.actualizarMesa(mesa);

        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            File seleccionar = fileChooser.getSelectedFile();
            String ruta = seleccionar.getAbsolutePath() + ".pdf";
            generarBoleta(ruta, boleta, detalleBoletas);
        }
    }//GEN-LAST:event_btnCobrarActionPerformed

    public void generarBoleta(String filePath, Boleta boleta, List<DetalleBoleta> detalleBoleta) {
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            JasperReport report = (JasperReport) JRLoader.loadObject(new File(Boleta.class.getClassLoader().getResource("Boleta_ERTSJ.jasper").getPath()));
            JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(detalleBoleta);
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("dni", boleta.getDni());
            parameters.put("nombre", boleta.getCliente());
            parameters.put("total", boleta.getTotal());
            parameters.put("img", boleta.getImg());
            JasperPrint jasperPrint = null;
            try {
                jasperPrint = JasperFillManager.fillReport(report, parameters, ds);
            } catch (JRException e) {
                throw new RuntimeException(e);
            }
            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
            outputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> metodoPago;
    private javax.swing.JTable tabConsumo;
    private javax.swing.JTable tabDetalle;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
