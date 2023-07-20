package proyecto_models;

import java.util.Date;

public class Pedido {

    private int id_pedido;
    private int id_cliente;
    private int id_tipopedido;
    private int id_mesa;
    private int id_empleado;
    private Date fecha_pedido;
    private float total;
    private int estadopedido;
    private int id_metodopago;

    public Pedido(int id_pedido, int id_cliente, int id_tipopedido, int id_mesa, int id_empleado, Date fecha_pedido, float total, int estadopedido, int id_metodopago) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.id_tipopedido = id_tipopedido;
        this.id_mesa = id_mesa;
        this.id_empleado = id_empleado;
        this.fecha_pedido = fecha_pedido;
        this.total = total;
        this.estadopedido = estadopedido;
        this.id_metodopago = id_metodopago;
    }

    public Pedido() {
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id_pedido=" + id_pedido +
                ", id_cliente=" + id_cliente +
                ", id_tipopedido=" + id_tipopedido +
                ", id_mesa=" + id_mesa +
                ", id_empleado=" + id_empleado +
                ", fecha_pedido=" + fecha_pedido +
                ", total=" + total +
                ", estadopedido=" + estadopedido +
                ", id_metodopago=" + id_metodopago +
                '}';
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_tipopedido() {
        return id_tipopedido;
    }

    public void setId_tipopedido(int id_tipopedido) {
        this.id_tipopedido = id_tipopedido;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getEstadopedido() {
        return estadopedido;
    }

    public void setEstadopedido(int estadopedido) {
        this.estadopedido = estadopedido;
    }

    public int getId_metodopago() {
        return id_metodopago;
    }

    public void setId_metodopago(int id_metodopago) {
        this.id_metodopago = id_metodopago;
    }
}
