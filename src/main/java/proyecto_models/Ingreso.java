package proyecto_models;

import java.util.Date;

public class Ingreso {

    private int id_ingreso;
    private Date fecha;
    private float total;
    private int estado;

    public Ingreso() {
    }

    public Ingreso(int id_ingreso, Date fecha, float total, int estado) {
        this.id_ingreso = id_ingreso;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ingreso{" +
                "id_ingreso=" + id_ingreso +
                ", fecha=" + fecha +
                ", total=" + total +
                ", estado=" + estado +
                '}';
    }

    public int getId_ingreso() {
        return id_ingreso;
    }

    public void setId_ingreso(int id_ingreso) {
        this.id_ingreso = id_ingreso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
