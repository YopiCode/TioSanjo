package proyecto.proyecto_models;

public class TipoEmpleado {

    private int id;
    private String tipo;

    public TipoEmpleado(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public TipoEmpleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TipoEmpleado{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
