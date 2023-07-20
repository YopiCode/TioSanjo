package proyecto_models;

import java.util.Date;

public class Carta {
    private int id_carta;
    private Date fecha;
    private int estado;
    private int id_producto;
    private int id_platillo;

    public Carta(int id_carta, Date fecha, int estado, int id_producto, int id_platillo) {
        this.id_carta = id_carta;
        this.fecha = fecha;
        this.estado = estado;
        this.id_producto = id_producto;
        this.id_platillo = id_platillo;
    }

    public Carta() {
    }

    @Override
    public String toString() {
        return "Carta{" +
                "id_carta=" + id_carta +
                ", fecha=" + fecha +
                ", estado=" + estado +
                ", id_producto=" + id_producto +
                ", id_platillo=" + id_platillo +
                '}';
    }

    public int getId_carta() {
        return id_carta;
    }

    public void setId_carta(int id_carta) {
        this.id_carta = id_carta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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
