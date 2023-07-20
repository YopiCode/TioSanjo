
package proyecto_models;

import java.util.Date;

public class Cliente{
    private int id_cliente;
    private int id_persona;
    private Date fecha_registro;

    public Cliente(int id_cliente, int id_persona, Date fecha_registro) {
        this.id_cliente = id_cliente;
        this.id_persona = id_persona;
        this.fecha_registro = fecha_registro;
    }

    public Cliente() {
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_cliente=" + id_cliente +
                ", id_persona=" + id_persona +
                ", fecha_registro=" + fecha_registro +
                '}';
    }
}
