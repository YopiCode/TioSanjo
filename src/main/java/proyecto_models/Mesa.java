package proyecto_models;

public class Mesa {
    private int id_mesa;
    private String descripcionmesa;

    public Mesa(int id_mesa, String descripcionmesa) {
        this.id_mesa = id_mesa;
        this.descripcionmesa = descripcionmesa;
    }

    public Mesa() {
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "id_mesa=" + id_mesa +
                ", descripcionmesa='" + descripcionmesa + '\'' +
                '}';
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public String getDescripcionmesa() {
        return descripcionmesa;
    }

    public void setDescripcionmesa(String descripcionmesa) {
        this.descripcionmesa = descripcionmesa;
    }
}
