package proyecto.proyecto_models;

import java.util.Date;

public class Compra {

    private int id;
    private int idInsumo;
    private Date fecha;
    private double precioCompra;
    private int cantidad;

    public Compra(int id, int idInsumo, Date fecha, double precioCompra, int cantidad) {
        this.id = id;
        this.idInsumo = idInsumo;
        this.fecha = fecha;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
    }

    public Compra() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "id=" + id +
                ", idInsumo=" + idInsumo +
                ", fecha=" + fecha +
                ", precioCompra=" + precioCompra +
                ", cantidad=" + cantidad +
                '}';
    }
}
