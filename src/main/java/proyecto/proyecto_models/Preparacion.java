package proyecto.proyecto_models;

public class Preparacion {
    private int id;
    private int idItem;
    private int idInsumo;
    private int cantidad;

    public Preparacion(int id, int idItem, int idInsumo, int cantidad) {
        this.id = id;
        this.idItem = idItem;
        this.idInsumo = idInsumo;
        this.cantidad = cantidad;
    }

    public Preparacion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Preparacion{" +
                "id=" + id +
                ", idItem=" + idItem +
                ", idInsumo=" + idInsumo +
                ", cantidad=" + cantidad +
                '}';
    }
}
