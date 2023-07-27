package proyecto_models;

public class Mesa {
    private int id;
    private boolean estado;

    public Mesa(int id, boolean estado) {
        this.id = id;
        this.estado = estado;
    }

    public Mesa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "id=" + id +
                ", estado=" + estado +
                '}';
    }
}
