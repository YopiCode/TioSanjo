package proyecto_models;

import java.util.Date;

public class Elaboracion {

    private int id_elaboracion;
    private Date fecha;
    private int consumo_cantidad;
    private int id_producto;
    private int id_platillo;


    public Elaboracion(int id_elaboracion, Date fecha, int consumo_cantidad, int id_producto, int id_platillo) {
        this.id_elaboracion = id_elaboracion;
        this.fecha = fecha;
        this.consumo_cantidad = consumo_cantidad;
        this.id_producto = id_producto;
        this.id_platillo = id_platillo;
    }

    public Elaboracion() {
    }

    @Override
    public String toString() {
        return "Elaboracion{" +
                "id_elaboracion=" + id_elaboracion +
                ", fecha=" + fecha +
                ", consumo_cantidad=" + consumo_cantidad +
                ", id_producto=" + id_producto +
                ", id_platillo=" + id_platillo +
                '}';
    }

    public int getId_elaboracion() {
        return id_elaboracion;
    }

    public void setId_elaboracion(int id_elaboracion) {
        this.id_elaboracion = id_elaboracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getConsumo_cantidad() {
        return consumo_cantidad;
    }

    public void setConsumo_cantidad(int consumo_cantidad) {
        this.consumo_cantidad = consumo_cantidad;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_platillo() {
        return id_platillo;
    }

    public void setId_platillo(int id_platillo) {
        this.id_platillo = id_platillo;
    }
}
