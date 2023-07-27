package proyecto.proyecto_models;

public class DetallePedido {

    private int id;
    private int idPedido;
    private int idItem;
    private int cantidad;

    public DetallePedido(int id, int idPedido, int idItem, int cantidad) {
        this.id = id;
        this.idPedido = idPedido;
        this.idItem = idItem;
        this.cantidad = cantidad;
    }

    public DetallePedido() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "id=" + id +
                ", idPedido=" + idPedido +
                ", idItem=" + idItem +
                ", cantidad=" + cantidad +
                '}';
    }
}
