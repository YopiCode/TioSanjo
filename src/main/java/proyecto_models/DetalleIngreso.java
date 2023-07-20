package proyecto_models;

public class DetalleIngreso {

    private int id_detalleingreso;
    private int id_producto;
    private int cantidad;
    private float precio;
    private int id_ingreso;

    public DetalleIngreso(int id_detalleingreso, int id_producto, int cantidad, float precio, int id_ingreso) {
        this.id_detalleingreso = id_detalleingreso;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_ingreso = id_ingreso;
    }

    public DetalleIngreso() {
    }

    @Override
    public String toString() {
        return "DetalleIngreso{" +
                "id_detalleingreso=" + id_detalleingreso +
                ", id_producto=" + id_producto +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", id_ingreso=" + id_ingreso +
                '}';
    }

    public int getId_detalleingreso() {
        return id_detalleingreso;
    }

    public void setId_detalleingreso(int id_detalleingreso) {
        this.id_detalleingreso = id_detalleingreso;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getId_ingreso() {
        return id_ingreso;
    }

    public void setId_ingreso(int id_ingreso) {
        this.id_ingreso = id_ingreso;
    }
}
