package proyecto_models;

public class TipoInsumo {
    private int id;
    private String tipo;

    public TipoInsumo(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public TipoInsumo() {
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
        return "TipoInsumo{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
