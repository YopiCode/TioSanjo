package proyecto.proyecto_utils;

public class DetalleBoleta {

    private int cantidad;
    private String descripcion;
    private double total;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "DetalleBoleta{" +
                "cantidad=" + cantidad +
                ", descripcion='" + descripcion + '\'' +
                ", total=" + total +
                '}';
    }
}
