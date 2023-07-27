package proyecto_models;

public class TipoPedido {
    private int id;
    private String tipo;

    public TipoPedido() {
    }

    public TipoPedido(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
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
        return "TipoPedido{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
