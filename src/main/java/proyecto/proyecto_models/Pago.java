package proyecto.proyecto_models;

import java.util.Date;

public class Pago {

    private int id;
    private int idPedido;
    private int idMetodoPago;
    private Date fecha;

    public Pago(int id, int idPedido, int idMetodoPago, Date fecha) {
        this.id = id;
        this.idPedido = idPedido;
        this.idMetodoPago = idMetodoPago;
        this.fecha = fecha;
    }

    public Pago() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", idPedido=" + idPedido +
                ", idMetodoPago=" + idMetodoPago +
                ", fecha=" + fecha +
                '}';
    }
}
