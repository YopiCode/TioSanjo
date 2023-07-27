package proyecto_models;

import java.util.Date;

public class Pedido {
    private int id;
    private int idCliente;
    private int idUsuario;
    private Date fecha;
    private int idMesa;
    private double total;
    private int idTipoPedido;

    private boolean despachado;

    public Pedido() {
    }

    public Pedido(int id, int idCliente, int idUsuario, Date fecha, int idMesa, double total, int idTipoPedido, boolean despachado) {
        this.id = id;
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.idMesa = idMesa;
        this.total = total;
        this.idTipoPedido = idTipoPedido;
        this.despachado = despachado;
    }

    public int getId() {


        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdTipoPedido() {
        return idTipoPedido;
    }

    public void setIdTipoPedido(int idTipoPedido) {
        this.idTipoPedido = idTipoPedido;
    }

    public boolean isDespachado() {
        return despachado;
    }

    public void setDespachado(boolean despachado) {
        this.despachado = despachado;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", idCliente=" + idCliente +
                ", idUsuario=" + idUsuario +
                ", fecha=" + fecha +
                ", idMesa=" + idMesa +
                ", total=" + total +
                ", idTipoPedido=" + idTipoPedido +
                ", despacho=" + despachado +
                '}';
    }
}
